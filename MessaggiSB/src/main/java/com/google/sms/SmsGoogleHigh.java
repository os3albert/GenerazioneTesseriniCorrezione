package com.google.sms;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SmsGoogleHigh extends SmsGoogle {
	
	public SmsGoogleHigh(String phoneNumber, String message, boolean checkIfPhoneExist) {
		super(phoneNumber, message, checkIfPhoneExist);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
