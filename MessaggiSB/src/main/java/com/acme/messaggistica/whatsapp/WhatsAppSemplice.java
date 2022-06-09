package com.acme.messaggistica.whatsapp;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class WhatsAppSemplice  extends WhatsAppImp {
	private  String destinatario;
	@Override
	public void send() {
		System.out.println("------------ Invio Messaggio semplice -------------");
		 
		System.out.println("Messaggio inviato a " + destinatario);
	 
		
	}
	public WhatsAppSemplice(String messaggio, String destinatario) {
		super(messaggio);
		this.destinatario = destinatario;
	}

	
}
