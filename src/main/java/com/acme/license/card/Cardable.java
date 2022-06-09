package com.acme.license.card;

public interface Cardable extends Generable{

	int getAnnoDiValidità();

	String getCognome();

	String getIndirizzo();

	String getNome();

	int getNumeroLicenza();

}