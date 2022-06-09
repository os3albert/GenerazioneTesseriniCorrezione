package com.acme.messaggistica.v2.sms;

import lombok.Data;

@Data
public class SmsLow extends Sms {
	public SmsLow(String numeroTelefono, String messaggio) {
		super(numeroTelefono, messaggio);
		// TODO Auto-generated constructor stub
	}
	
}
