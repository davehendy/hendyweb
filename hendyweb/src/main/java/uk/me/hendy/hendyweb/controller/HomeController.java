package uk.me.hendy.hendyweb.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.me.hendy.hendyweb.serviceclient.MenuDTO;
import uk.me.hendy.hendyweb.serviceclient.MenuServiceClient;
import uk.me.hendy.hendyweb.utility.ObjectCache;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/*
	@Value("${drg.hendyweb.service.server}")
	private String serviceServer;
	@Value("${drg.hendyweb.service.webapp}")
	private String serviceWebapp;
	*/
	@Autowired
	MenuServiceClient menuServiceClient;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping("/home")
	public String home(Locale locale, Model model) {
		logger.info("Hi and welcome home! The client locale is {}.", locale);
		logger.debug("model attributes in=" + model);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		String javaVersion = System.getProperty("java.version");
		String userName = System.getProperty("user.name");
		//String menuHtml = this.getMenuJson();
		MenuDTO menuObject = getMenuObject("davetest");
						
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("javaVersion", javaVersion);
		model.addAttribute("userName", userName);
		//model.addAttribute("hendymenu", menuHtml);
		//model.addAttribute("menuJson", menuJson);
		model.addAttribute("menuObject",menuObject);
		
		//model.addAttribute("hendyCamJson", this.getHendyCamJson());
		
		logger.debug("model attributes out=" + model);
		
		return "home";
	}
	
	/*
	private String getMenu() {
		logger.debug("getMenu");
		String menuHtml = "";
		
		MenuDTO menu = menuService.getMenu("davetest");
		logger.debug("------AGAIN------");
		menu = menuService.getMenu("davetest");
		menuHtml = menu.getHtml();
		
		return menuHtml;
	}*/
	
	//private String getMenuJson(String menuName) {
		//String serviceURL = this.serviceServer + "/" + this.serviceWebapp + "/menu/" + menuName + ".json";
		//logger.debug("serviceURL="+serviceURL);
		//RestTemplate restTemplate = new RestTemplate();
		//String result = restTemplate.getForObject(serviceURL, String.class);
		//logger.debug("menuJson="+result);
		//return result;
	//}
	
	private MenuDTO getMenuObject(String menuName) {
		
		//String serviceURL = this.serviceServer + "/" + this.serviceWebapp + "/menu/" + menuName + ".xml";
		//logger.debug("serviceURL="+serviceURL);
		//RestTemplate restTemplate = new RestTemplate();
		//MenuDTO result = restTemplate.getForObject(serviceURL, MenuDTO.class);
		//logger.debug("menuObject="+result);
		//return result;
		return menuServiceClient.getMenu(menuName);
	}
	
	/*private String getHendyCamJson() {
		String serviceURL = this.serviceServer + "/" + this.serviceWebapp + "/hendycam/list.json";
		logger.debug("serviceURL="+serviceURL);
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(serviceURL, String.class);
		logger.debug("hendyCamJson="+result);
		return result;
	}
	*/
}
