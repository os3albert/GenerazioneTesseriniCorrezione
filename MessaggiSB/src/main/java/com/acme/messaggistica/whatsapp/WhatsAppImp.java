package com.acme.messaggistica.whatsapp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class WhatsAppImp implements WhatsApp {
	private String messaggio;
}
