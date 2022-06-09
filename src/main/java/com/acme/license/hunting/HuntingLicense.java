package com.acme.license.hunting;

import com.acme.license.LicenseImp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true) // per non creare problemi con l'eredita
@AllArgsConstructor
public class HuntingLicense extends LicenseImp {

	private String atcDiRiferimento;
	private int numeroSerialeArma;
	private int annoDiScadenza;
	private String tipologiaPrede;
	
	
	public HuntingLicense(String email, String numeroLicenza, String nome, String cognome, String indirizzo, String cap,
			String citta, String atcDiRiferimento, int numeroSerialeArma, int annoDiScadenza, String tipologiaPrede) {
		super(email, numeroLicenza, nome, cognome, indirizzo, cap, citta);
		this.atcDiRiferimento = atcDiRiferimento;
		this.numeroSerialeArma = numeroSerialeArma;
		this.annoDiScadenza = annoDiScadenza;
		this.tipologiaPrede = tipologiaPrede;
	}
	
	

}
