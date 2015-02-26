package uk.me.hendy;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.me.hendy.service.menu.MenuDTO;
import uk.me.hendy.service.menu.MenuService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private MenuService menuService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping({"/","/home"})
	public String home(Locale locale, Model model) {
		logger.info("Hi and welcome home! The client locale is {}.", locale);
		logger.debug("model attributes in=" + model);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		String javaVersion = System.getProperty("java.version");
		String userName = System.getProperty("user.name");
		String menuHtml = this.getMenu();
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("javaVersion", javaVersion);
		model.addAttribute("userName", userName);
		model.addAttribute("hendymenu", menuHtml);
		
		logger.debug("model attributes out=" + model);
		
		return "home";
	}
	
	private String getMenu() {
		String menuHtml = "";
		
		MenuDTO menu = menuService.getMenu("davetest");
		System.out.println("------AGAIN------");
		menu = menuService.getMenu("davetest");
		menuHtml = menu.getHtml();
		
		return menuHtml;
	}
	
}
