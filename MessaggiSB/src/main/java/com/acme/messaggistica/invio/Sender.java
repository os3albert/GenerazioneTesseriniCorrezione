package com.acme.messaggistica.invio;

import java.util.List;

public class Sender {
		
		public static void send(List<Sendable> messages) {
			
			for (Sendable sendable : messages) {
				sendable.send();
			}
		}
		
		public static void send(Sendable message) {
			
			message.send();
		}
		
}
