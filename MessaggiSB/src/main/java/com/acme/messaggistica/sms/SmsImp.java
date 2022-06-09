package com.acme.messaggistica.sms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class SmsImp implements Sms {
	private String numeroTelefono;
	private String messaggio;
}
