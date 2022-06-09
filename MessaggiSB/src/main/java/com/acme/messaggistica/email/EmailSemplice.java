package com.acme.messaggistica.email;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmailSemplice extends EmailImp {public EmailSemplice(String messaggio, String from, String to) {
		super(messaggio, from, to);
		// TODO Auto-generated constructor stub
	}

}
