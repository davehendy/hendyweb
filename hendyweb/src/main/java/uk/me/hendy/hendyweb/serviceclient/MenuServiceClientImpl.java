package uk.me.hendy.hendyweb.serviceclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import uk.me.hendy.hendyweb.utility.ObjectCache;

@Service("menuServiceClient")
public class MenuServiceClientImpl extends AbstractServiceClient implements MenuServiceClient  {
	private static final Logger logger = LoggerFactory.getLogger(MenuServiceClient.class);
	
	@Override
	public MenuDTO getMenu(String menuName) {
		logger.debug("getMenu("+menuName+")");
		
		MenuDTO menuObject = ObjectCache.INSTANCE.getMenu(ObjectCache.INSTANCE.MAIN_MENU_KEY);
		if (menuObject == null) {
			String serviceURL = serviceServer + "/" + serviceWebapp + "/menu/" + menuName + ".xml";
			RestTemplate restTemplate = new RestTemplate();
			menuObject = restTemplate.getForObject(serviceURL, MenuDTO.class);
			ObjectCache.INSTANCE.setMenu(ObjectCache.INSTANCE.MAIN_MENU_KEY, menuObject);
		}
		
		logger.debug("menuObject="+menuObject);
		return menuObject;
	} 

	

}
