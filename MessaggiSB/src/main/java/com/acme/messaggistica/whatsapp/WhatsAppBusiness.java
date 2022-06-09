package com.acme.messaggistica.whatsapp;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class WhatsAppBusiness  extends WhatsAppImp {
	private List<String> destinatari;
	@Override
	public void send() {
		System.out.println("------------ Invio business -------------");
		
		for (String destinatario : destinatari) {
			System.out.println("Messaggio inviato a " + destinatario);
		}
		
	}
	public WhatsAppBusiness(String messaggio, List<String> destinatari) {
		super(messaggio);
		this.destinatari = destinatari;
	}

	
}
