package com.acme.messaggistica.invio;

import com.acme.messaggistica.v2.sms.server.ServerInvioSms;

public class ServerInvioSmsFactory {
	
	public final static String TIPO_SERVER_GOOGLE = "google.service.com"; 
	public final static String TIPO_SERVER_ACME = "server.invio.acme.com"; 
	
	public ServerInvioSms create(String tipo) {
		
		
			return ServerInvioSms.getInstance(tipo);
		
		
		
	}
	
}
