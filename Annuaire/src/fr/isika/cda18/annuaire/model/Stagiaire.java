package fr.isika.cda18.annuaire.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Stagiaire extends Personne {

	// Attributes
	private String departement;
	private String nomPromo;
	private String anneePromo;
	
	//Constructor
	public Stagiaire(String nom, String prenom, String departement, String nomPromo, String anneePromo) {
		super(nom, prenom);
		this.departement = departement;
		this.nomPromo = nomPromo;
		this.anneePromo = anneePromo;
	}



	//Getters && Setters
	public String getDepartement() {
		return departement;
	}


	public void setDepartement(String departement) {
		this.departement = departement;
	}


	public String getNomPromo() {
		return nomPromo;
	}


	public void setNomPromo(String nomPromo) {
		this.nomPromo = nomPromo;
	}


	public String getAnneePromo() {
		return anneePromo;
	}


	public void setAnneePromo(String anneePromo) {
		this.anneePromo = anneePromo;
	}

	//Method toString
//	@Override
//	public String toString() {
//		return "Stagiaire[departement=" + departement + ", nomPromo=" + nomPromo + ", anneePromo=" + anneePromo + "]";
//		
//	}
	@Override
	public String toString() {
		return  super.toString()+ " " + departement + " " + nomPromo + " " + anneePromo ;
	}


	

}
