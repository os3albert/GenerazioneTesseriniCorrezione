package com.acme.license.card.fishing;

import com.acme.license.card.Card;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true) // per non creare problemi con l'eredita
@AllArgsConstructor
@NoArgsConstructor
public class Fishing extends Card {
	
	private String localita;

	@Override
	public void genera() {
		// TODO Auto-generated method stub
		
	}

	public Fishing(String nome, String cognome, String indirizzo, int annoDiValidità, int numeroLicenza,
			String localita) {
		super(nome, cognome, indirizzo, annoDiValidità, numeroLicenza);
		this.localita = localita;
	}
	
	
	
	
	

}
