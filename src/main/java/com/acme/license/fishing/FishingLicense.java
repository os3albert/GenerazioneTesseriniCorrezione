package com.acme.license.fishing;

import com.acme.license.LicenseImp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true) // per non creare problemi con l'eredita
@AllArgsConstructor
public class FishingLicense extends LicenseImp{
	
	private String tipoLicenza; //(a,b,c), 
	private int annoDiScadenza;
	private String località;
	
	public FishingLicense(String email, String numeroLicenza, String nome, String cognome, String indirizzo, String cap,
			String citta, String tipoLicenza, int annoDiScadenza, String località) {
		super(email, numeroLicenza, nome, cognome, indirizzo, cap, citta);
		this.tipoLicenza = tipoLicenza;
		this.annoDiScadenza = annoDiScadenza;
		this.località = località;
	}
	

}
