package uk.me.hendy.hendyweb.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HendywebServletContextListener implements ServletContextListener {
	private static final Logger logger = LoggerFactory.getLogger(HendywebServletContextListener.class);

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		logger.info("context being destroyed");

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		//System.setProperty("drg., value)
		
		logger.info("context being initialised");
		

	}

}
