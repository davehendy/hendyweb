package uk.me.hendy.hendyweb.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.me.hendy.hendyweb.serviceclient.MenuDTO;
import uk.me.hendy.hendyweb.serviceclient.MenuServiceClient;


/**
 * Handles requests for the HendyCam page.
 */
@Controller
public class HendyCamController {
	
	private static final Logger logger = LoggerFactory.getLogger(HendyCamController.class);
	
	@Value("${drg.hendyweb.service.server}")
	private String serviceServer;
	@Value("${drg.hendyweb.service.webapp}")
	private String serviceWebapp;
	@Autowired
	MenuServiceClient menuServiceClient;
	
	/**
	 * Gets the HendyCam images and loads the jsp
	 */
	@RequestMapping("/hendycam")
	public String home(Locale locale, Model model) {
		logger.debug("enters hendycam");
		
		MenuDTO menuObject = menuServiceClient.getMenu("hendyweb");
		model.addAttribute("menuObject",menuObject);
				
		model.addAttribute("hendyCamJson", this.getHendyCamJson());
		
		logger.debug("hendycam model attributes out=" + model);
		
		return "hendycam";
	}
	
	
	
	private String getHendyCamJson() {
		String serviceURL = this.serviceServer + "/" + this.serviceWebapp + "/hendycam/list.json";
		logger.debug("serviceURL="+serviceURL);
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(serviceURL, String.class);
		logger.debug("hendyCamJson="+result);
		return result;
	}
	
}
