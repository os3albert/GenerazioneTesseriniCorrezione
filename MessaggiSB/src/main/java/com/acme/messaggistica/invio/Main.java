package com.acme.messaggistica.invio;

import java.util.ArrayList;
import java.util.List;

import com.acme.messaggistica.email.EmailPec;
import com.acme.messaggistica.sms.SmsHigh;
import com.acme.messaggistica.sms.SmsLow;
import com.acme.messaggistica.whatsapp.WhatsAppBusiness;
import com.google.sms.SmsGoogleHigh;

public class Main {
	
	
	public static void main(String[] args) {
		List<Sendable> messaggi = new ArrayList<Sendable>();
		
		messaggi.add(  new SmsHigh("333 444 555", "Messaggio 1")  );
		messaggi.add(  new EmailPec("Messaggio 2", "damarco@gmail.com","aroberto@gmail.com")  );
		
		List<String> destinatari = new ArrayList<String>();
		destinatari.add("roberto");
		destinatari.add("gianni");
		destinatari.add("andrea");
		
		messaggi.add(  new WhatsAppBusiness("messaggio 3", destinatari)  );
		
		
		Sender.send(messaggi);
		Sender.send(  new SmsLow("4444 44435", "messaggio 5")  );
		
	
		Sender.send( new SmsGoogleHigh("222222","MESSAGGIO",true) );
		
	}
	
	
}
