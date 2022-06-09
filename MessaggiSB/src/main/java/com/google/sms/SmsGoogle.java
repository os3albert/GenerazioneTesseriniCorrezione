package com.google.sms;

import com.acme.messaggistica.sms.Sms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class SmsGoogle  implements Sms{
	private String phoneNumber;
	private String message;
	private boolean checkIfPhoneExist;
	
	public void sendSmsMessage() {
		System.out.println("sending message from google");
	}
	@Override
	public void send() {
		
		sendSmsMessage();
	}
	@Override
	public String getMessaggio() {
		// TODO Auto-generated method stub
		return message;
	}
	@Override
	public String getNumeroTelefono() {
		// TODO Auto-generated method stub
		return phoneNumber;
	}
	
	
}
