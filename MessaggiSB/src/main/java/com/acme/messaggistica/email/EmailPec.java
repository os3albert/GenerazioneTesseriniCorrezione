package com.acme.messaggistica.email;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmailPec extends EmailImp {public EmailPec(String messaggio, String from, String to) {
		super(messaggio, from, to);
		// TODO Auto-generated constructor stub
	}

}
