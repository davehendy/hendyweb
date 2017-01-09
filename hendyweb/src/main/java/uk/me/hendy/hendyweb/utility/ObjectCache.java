package uk.me.hendy.hendyweb.utility;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.me.hendy.hendyweb.serviceclient.MenuDTO;

public enum ObjectCache {
	
	INSTANCE;
	
	private static final Logger logger = LoggerFactory.getLogger(ObjectCache.class);
	
	HashMap<String,String> stringMap = new HashMap<String,String>();	
	HashMap<String,MenuDTO> menuMap = new HashMap<String,MenuDTO>();
	public String MAIN_MENU_KEY = "hendyweb";
	
	public String getString(String key) {
		logger.debug("getString("+key+")");
		if (stringMap.containsKey(key)) {
			logger.debug("found");
			return stringMap.get(key);
		} else {
			logger.debug("not found");
			return null;
		}
	}
	public void setString(String key, String data) {
		logger.debug("setString("+key+","+data+")");
		stringMap.put(key, data);
	}
	
	public MenuDTO getMenu(String key) {
		logger.debug("getMenu("+key+")");
		if (menuMap.containsKey(key)) {
			logger.debug("found");
			return menuMap.get(key);
		} else {
			logger.debug("not found");
			return null;
		}
	}
	public void setMenu(String key, MenuDTO menuDTO) {
		logger.debug("setMenu("+key+","+menuDTO+")");
		menuMap.put(key, menuDTO);
	}

}
