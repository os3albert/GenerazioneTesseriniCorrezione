package com.acme.license.card;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Card implements Cardable {
	
	private String nome;
	private String cognome;
	private String indirizzo;
	private int annoDiValidità;
	private int numeroLicenza;

}
