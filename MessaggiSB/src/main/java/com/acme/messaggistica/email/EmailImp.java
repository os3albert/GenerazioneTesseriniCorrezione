package com.acme.messaggistica.email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class EmailImp implements Email {
	private String messaggio;
	private String from;
	private String to;
	@Override
	public void send() {
		
		System.out.println("---------------------------------");
		System.out.println("Messaggio email " + getClass().getSimpleName());
		System.out.println("contatto server");
		System.out.println("preparo email per conto  di " +getFrom() + " diretta a " + getTo());
		System.out.println("eseguo l'invio");
	
		
		
	}
	
}
