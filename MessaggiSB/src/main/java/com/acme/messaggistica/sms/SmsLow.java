package com.acme.messaggistica.sms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SmsLow extends SmsImp {

	@Override
	public void send() {
		System.out.println("---------------------------------");
		System.out.println("Messaggio in bassa definizione");
		System.out.println("prendere il numero");
		System.out.println("comporre numero e messaggio");
		System.out.println("inviare il messaggio");
		System.out.println("NUMERO : " + getNumeroTelefono() + " messaggio: " + getMessaggio());
		
	}

	public SmsLow(String numeroTelefono, String messaggio) {
		super(numeroTelefono, messaggio);
		// TODO Auto-generated constructor stub
	}



}
