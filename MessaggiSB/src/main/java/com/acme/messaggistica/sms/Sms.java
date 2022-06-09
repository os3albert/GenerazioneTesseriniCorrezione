package com.acme.messaggistica.sms;

import com.acme.messaggistica.invio.Sendable;

public interface Sms extends Sendable {

	String getMessaggio();

	String getNumeroTelefono();

}