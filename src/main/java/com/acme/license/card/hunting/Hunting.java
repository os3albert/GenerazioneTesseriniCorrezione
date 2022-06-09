package com.acme.license.card.hunting;

import com.acme.license.card.Card;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true) // per non creare problemi con l'eredita
@AllArgsConstructor
@NoArgsConstructor
public class Hunting extends Card {
	
	private String atcDiRiferimento;
	
	

	@Override
	public void genera() {
		// TODO Auto-generated method stub
		
	}



	public Hunting(String nome, String cognome, String indirizzo, int annoDiValidità, int numeroLicenza,
			String atcDiRiferimento) {
		super(nome, cognome, indirizzo, annoDiValidità, numeroLicenza);
		this.atcDiRiferimento = atcDiRiferimento;
	}

}
