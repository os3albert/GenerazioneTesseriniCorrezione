package com.acme.license;

import com.acme.license.fishing.FishingLicense;
import com.acme.license.hunting.HuntingLicense;

public class LicenseFactory extends LicenseImp {
	
	private final static String LICENSE_TYPE_HUNTING = "HuntingLicense";
	private final static String LICENSE_TYPE_FISHING = "FishingLicense";
	
	public static LicenseImp create(String type, String email, String numeroLicenza, String nome, String cognome, String indirizzo, String cap,
			String citta, String tipoLicenza, int annoDiScadenza, String località) {
		
//		String email, String numeroLicenza, String nome, String cognome, String indirizzo, String cap,
//		String citta, String atcDiRiferimento, int numeroSerialeArma, int annoDiScadenza, String tipologiaPrede
		
		if (type.equals(LICENSE_TYPE_FISHING)) {
			return new FishingLicense(email, numeroLicenza, nome, cognome, indirizzo, cap, citta, tipoLicenza, annoDiScadenza, località);
		} else {
			return new HuntingLicense(località, annoDiScadenza, annoDiScadenza, cap); 
		}
		
	}

}
