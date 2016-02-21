package uk.me.hendy.hendyweb.serviceclient;

import org.springframework.beans.factory.annotation.Value;

public abstract class AbstractServiceClient {
	
	@Value("${drg.hendyweb.service.server}")
	String serviceServer;
	@Value("${drg.hendyweb.service.webapp}")
	String serviceWebapp;

}
