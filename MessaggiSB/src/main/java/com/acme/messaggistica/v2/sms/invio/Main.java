package com.acme.messaggistica.v2.sms.invio;

import com.acme.messaggistica.invio.ServerInvioSmsFactory;
import com.acme.messaggistica.sms.MessaggioSmsNonSpecificatoException;
import com.acme.messaggistica.sms.NumeroDiTelefonoNonSpecificatoException;
import com.acme.messaggistica.sms.Sms;
import com.acme.messaggistica.sms.SmsFactory;
import com.acme.messaggistica.sms.TipoSmsNonSpecificatoException;
import com.acme.messaggistica.v2.sms.SmsHigh;
import com.acme.messaggistica.v2.sms.server.ServerInvioSms;


// factory
// base o un interfaccia o una classe che rappresenta l'oggetto da creare
// deve avere un metodo (di solito si chiama create) che accetta un parametro di tipo stringa ,
// e crea un oggetto del tipo previsto
// che permette di definire l'oggetto da creare


public class Main {
	public static void main(String[] args) {
		
		ServerInvioSmsFactory factory = new ServerInvioSmsFactory();
		
		ServerInvioSms serverUno = factory.create(ServerInvioSmsFactory.TIPO_SERVER_ACME);
		// invii su server uno
			
		
		
		ServerInvioSms serverDue = factory.create(ServerInvioSmsFactory.TIPO_SERVER_GOOGLE);
		InvioSms sender = new InvioSms(  serverDue );	
		
		
		
		// faccio gli invii server due
		
		
		sender.invia(  new SmsHigh("3333333", "messaggio")   );
		
		
		SmsFactory smsFactory = new SmsFactory();
		
		try {
			
			Sms smsDaInviare = smsFactory.create( SmsFactory.TIPO_SMS_HIGH   , "22222222", "messaggio");
			
		} catch (TipoSmsNonSpecificatoException | NumeroDiTelefonoNonSpecificatoException
				| MessaggioSmsNonSpecificatoException e) {
			
			//System.out.println("Non hai specificato tutti i parametri");
			System.out.println( e.getMessage() );
		}
		
		
		try {
			Sms smsDainviare2 = smsFactory.create( SmsFactory.TIPO_SMS_GOOGLE   , "4444", "messaggio 2");
		} catch (TipoSmsNonSpecificatoException e) {
			System.out.println( "Tipo sms non specificato" );
			
		} catch (NumeroDiTelefonoNonSpecificatoException e) {
			// TODO Auto-generated catch block
			System.out.println( "Tipo sms non specificato" );
		} catch (MessaggioSmsNonSpecificatoException e) {
			// TODO Auto-generated catch block
			System.out.println( "Tipo sms non specificato" );
		}
		
	}
}
