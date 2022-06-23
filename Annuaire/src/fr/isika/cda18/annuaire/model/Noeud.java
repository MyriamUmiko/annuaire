package fr.isika.cda18.annuaire.model;

public class Noeud {
	private Stagiaire stagiaire;
	private Noeud filsGauche;
	private Noeud filsDroit;

	// constructor
	public Noeud(Stagiaire stagiaire) {
		super();
		this.stagiaire = stagiaire;
		this.filsGauche = null;
		this.filsDroit = null;
	}
	// Setter and

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

	public String toStringInfixe() {
		String result = "";
		if (this.filsGauche != null) {
			result += this.filsGauche.toStringInfixe();
		}
		result += " " + stagiaire+"\n";
		if (this.filsDroit != null) {
			result += this.filsDroit.toStringInfixe();
		}
		return result;
	}

	public void ajouterValeur(Stagiaire stagiaireAAjouter) {
		if(this.stagiaire==null) {
			this.stagiaire=stagiaireAAjouter;
		}else if (this.stagiaire.getNom().compareTo(stagiaireAAjouter.getNom())> 0) {
			if (this.filsGauche == null) {
				this.filsGauche = new Noeud(stagiaireAAjouter);
			} else {
				this.filsGauche.ajouterValeur(stagiaireAAjouter);
			}
		} else {
			if (this.filsDroit == null) {
				this.filsDroit = new Noeud(stagiaireAAjouter);
			} else {
				this.filsDroit.ajouterValeur(stagiaireAAjouter);
			}
		}
	}

	public int nombreTotalDesNoeuds(Noeud noeud) {
		
		if (noeud == null) {
			return 0;
		} else {
			return 1+nombreTotalDesNoeuds(noeud.filsDroit)+nombreTotalDesNoeuds(noeud.filsGauche);
		}
		
	}
}
