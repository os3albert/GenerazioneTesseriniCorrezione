package com.acme.messaggistica.whatsapp;

import com.acme.messaggistica.invio.Sendable;

public interface WhatsApp  extends Sendable{

	String getMessaggio();

}