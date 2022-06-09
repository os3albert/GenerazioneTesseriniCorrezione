package com.acme.messaggistica.sms;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SmsHigh  extends SmsImp{

	@Override
	public void send() {
		
		System.out.println("---------------------------------");
		System.out.println("Messaggio in alta definizione");
		System.out.println("prendere il numero");
		System.out.println("comporre numero e messaggio");
		System.out.println("inviare il messaggio");
		System.out.println("NUMERO : " + getNumeroTelefono() + " messaggio: " + getMessaggio());
		
	}


	public SmsHigh(String numeroTelefono, String messaggio) {
		super(numeroTelefono, messaggio);
	}
	
	

}
