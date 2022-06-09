package com.acme.messaggistica.v2.sms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Sms {
	private String numeroTelefono;
	private String messaggio;
}
