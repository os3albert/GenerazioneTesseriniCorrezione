package com.acme.messaggistica.sms;

import com.google.sms.SmsGoogleHigh;

public class SmsFactory {
	public final static String TIPO_SMS_HIGH = "high";
	public final static String TIPO_SMS_LOW = "low";
	public final static String TIPO_SMS_GOOGLE = "google";
	
	public Sms create(String tipo, String telefono, String messaggio) 
			throws 
			TipoSmsNonSpecificatoException, 
			NumeroDiTelefonoNonSpecificatoException, 
			MessaggioSmsNonSpecificatoException {
		
		if(telefono == null || telefono.isBlank() ) {
			throw new NumeroDiTelefonoNonSpecificatoException("devi specificare il numero di telefono");
		}
		
		if(messaggio == null || messaggio.isBlank()) {
			throw new MessaggioSmsNonSpecificatoException("Manca il messaggio");
		}
		
		if(tipo.equals(TIPO_SMS_HIGH)) {
			return new SmsHighKingSize(telefono,messaggio);
		} else if(tipo.equals(TIPO_SMS_LOW)) {
			return new SmsLow(telefono,messaggio);
		} else if( tipo.equals(TIPO_SMS_GOOGLE)) {
			return new SmsGoogleHigh(telefono,messaggio,true);
		} 
		 	
		throw new TipoSmsNonSpecificatoException("Non hai specificato il tipo di messaggio da inviare");
	
		
	}
}
