package uk.me.hendy.hendyweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import uk.me.hendy.service.menu.MenuDTO;
import uk.me.hendy.service.menu.MenuService;

@RestController
@RequestMapping("/menu")
public class MenuController {
	@Autowired
	private MenuService menuService;
	
	@RequestMapping(value="/{name}", method=RequestMethod.GET)
	public @ResponseBody MenuDTO getMenu(@PathVariable("name") String name) {
		MenuDTO menuDTO = new MenuDTO();
		menuDTO = menuService.getMenu("davetest");
		return menuDTO;
	}
	/**
	 * @param menuService the menuService to set
	 */
	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}

}
