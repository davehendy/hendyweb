package uk.me.hendy.hendyweb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.me.hendy.hendyweb.serviceclient.MenuServiceClient;
import uk.me.hendy.hendyweb.utility.ObjectCache;


/**
 * Handles requests from the menu.
 */
@Controller
public class MenuController {
	
	private static final Logger logger = LoggerFactory.getLogger(MenuController.class);
	
	@Autowired
	MenuServiceClient menuServiceClient;
	
	/**
	 * Pass control to "about"
	 */
	@RequestMapping("/about")
	public String about(Model model) {
		logger.debug("enters about");
		model.addAttribute("menuObject",menuServiceClient.getMenu(ObjectCache.INSTANCE.MAIN_MENU_KEY));
		return "about";
	}
	
	/**
	 * Pass control to "news"
	 */
	@RequestMapping("/news")
	public String news(Model model) {
		logger.debug("enters news");
		model.addAttribute("menuObject",menuServiceClient.getMenu(ObjectCache.INSTANCE.MAIN_MENU_KEY));
		return "news";
	}
	
	/**
	 * Reset menu cache
	 */
	@RequestMapping("/menuclearcache")
	public String menuclearcache(Model model) {
		logger.debug("enters menuclearcache");
		ObjectCache.INSTANCE.setMenu(ObjectCache.INSTANCE.MAIN_MENU_KEY, null);
		model.addAttribute("menuObject",menuServiceClient.getMenu(ObjectCache.INSTANCE.MAIN_MENU_KEY));
		return "home";
	}
	
	
}
