package fr.isika.cda18.annuaire.model;



public class Noeud {

	private Stagiaire stagiaire;
	private Noeud filsGauche;
	private Noeud filsDroit;
	
	
	
	//constructor
	
	public Noeud(Stagiaire stagiaire) {
		super();
		this.stagiaire = stagiaire;
		this.filsGauche = null;
		this.filsDroit = null;
	}

	
	// Getters and Setters :
	public Stagiaire getStagiaire() {
		return stagiaire;
	}

	


	public void setStagiaire(Stagiaire stagiaire) {
		this.stagiaire = stagiaire;
	}

	public Noeud getFilsGauche() {
		return filsGauche;
	}

	public void setFilsGauche(Noeud filsGauche) {
		this.filsGauche = filsGauche;
	}

	public Noeud getFilsDroit() {
		return filsDroit;
	}

	public void setFilsDroit(Noeud filsDroit) {
		this.filsDroit = filsDroit;
	}
	
	
	//méthode toString
	@Override
	public String toString() {
		String result="";
		if(this.filsGauche != null) {
			result +=this.filsGauche.toString();
		}
		result += " "+ stagiaire;
		
		if(this.filsDroit != null) {
			result += this.filsDroit.toString();
		}
		
		return result;
	}
	
	
	//nombre de noeuds
	public int nombreNoeuds(Noeud nbNoeuds) {

		if (nbNoeuds == null) {
			return 0;

//		if ((this.filsGauche == null) && (this.filsDroit==null)) {
//			return 0;
		} else {
			return 1 + nombreNoeuds(nbNoeuds.filsDroit) + nombreNoeuds(nbNoeuds.filsGauche);
		}

	}
	
	
}
