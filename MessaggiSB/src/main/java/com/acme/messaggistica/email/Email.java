package com.acme.messaggistica.email;

import com.acme.messaggistica.invio.Sendable;

public interface Email extends Sendable{

	String getFrom();

	String getMessaggio();

	String getTo();

}