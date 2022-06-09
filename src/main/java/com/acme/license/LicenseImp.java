package com.acme.license;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class LicenseImp implements Licensable  {
	
	private String email;
	private String numeroLicenza;
	private String nome;
	private String cognome;
	private String indirizzo;
	private String cap;
	private String citta;
	
	
	
	
	
}
