package com.acme.messaggistica.v2.sms.invio;

import java.util.List;

import com.acme.messaggistica.v2.sms.Sms;
import com.acme.messaggistica.v2.sms.server.ServerInvioSms;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InvioSms {
	
	
	private ServerInvioSms server;
	
	public void invia(Sms sms) {
		server.inviaSms(sms);
	}
	
	public void invia(List<Sms> lista) {
		for (Sms sms : lista) {
			server.inviaSms(sms);
		}
	}
}
