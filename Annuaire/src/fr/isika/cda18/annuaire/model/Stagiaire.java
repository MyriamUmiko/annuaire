package fr.isika.cda18.annuaire.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Stagiaire extends Personne {

	// Attributes
	private int departement;
	private String nomPromo;
	private int anneePromo;
	
	//Constructor
	public Stagiaire(String nom, String prenom, int departement, String nomPromo, int anneePromo) {
		super(nom, prenom);
		this.departement = departement;
		this.nomPromo = nomPromo;
		this.anneePromo = anneePromo;
	}

	//Getters && Setters
	public int getDepartement() {
		return departement;
	}


	public void setDepartement(int departement) {
		this.departement = departement;
	}


	public String getNomPromo() {
		return nomPromo;
	}


	public void setNomPromo(String nomPromo) {
		this.nomPromo = nomPromo;
	}


	public int getAnneePromo() {
		return anneePromo;
	}


	public void setAnneePromo(int anneePromo) {
		this.anneePromo = anneePromo;
	}

	//Method toString
	@Override
	public String toString() {
		return "Stagiaire [departement=" + departement + ", nomPromo=" + nomPromo + ", anneePromo=" + anneePromo + "]";
	}
	

	

}
