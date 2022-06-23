package fr.isika.cda18.annuaire.model;

public abstract class Personne {

	
	//Attributes
	
	protected String nom;
	protected String prenom;
	
	//Constructor :
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	
	
	// Getters and Setters :
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	//Methods ToString 

	@Override
	public String toString() {
		return  nom +"  "+ prenom+" ";
	}
	
		
}
