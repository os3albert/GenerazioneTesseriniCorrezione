package com.acme.messaggistica.v2.sms.server;

import com.acme.messaggistica.v2.sms.SmsLow;
import com.acme.messaggistica.v2.sms.Sms;
import com.acme.messaggistica.v2.sms.SmsHigh;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class ServerInvioSms {
	private String dns;
	private final static ServerInvioSms instance = new ServerInvioSms();
	
	
	public String getDns() {
		return dns;
	}

	public void setDns(String dns) {
		this.dns = dns;
	}

	public static ServerInvioSms getInstance(String dns) {
		instance.setDns(dns);
		return instance;
	}
	
	
	public static ServerInvioSms getInstance() {
		return instance;
	}
	
	private ServerInvioSms() {
		super();
	}
	
	//Singleton
		// solo il costruttore vuoto che deve essere private
		// deve esistere una variabile statica dello stesso tipo della classe che deve essere privata
	
		//deve esistere un metodo statico e pubblico che mi permette di recuperare tale variabile che sarà
		// il mio singleton
	
	
	
	
	public void inviaSmsDaAttributi(String tipoMessaggio, String telefono, String testo) {
		Sms sms = null;
		
		if(tipoMessaggio.equals("High")) sms = new SmsHigh(telefono, testo);
		else sms = new SmsLow(telefono, testo);
	
		inviaSms(sms);
	}
	
	
	public void inviaSms(String tipoMessaggio, String telefono, String testo) {
		System.out.println("Invio tramite il server " + dns + " il messaggio " +tipoMessaggio + " a " + telefono + " testo: " + testo );
	}
	
	
	public void inviaSms(Sms sms ) {
		
		String testo = sms.getMessaggio();
		String telefono = sms.getNumeroTelefono();
		String tipoMessaggio = null;
		
		if(sms.getClass().getSimpleName().equals("SmsGoogleHigh") ) tipoMessaggio = "High";
		else tipoMessaggio = "Low";
		
		inviaSms(tipoMessaggio,telefono,testo);
		
	}


	
}
