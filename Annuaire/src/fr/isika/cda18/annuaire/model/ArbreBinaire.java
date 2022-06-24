package fr.isika.cda18.annuaire.model;

import java.util.ArrayList;
import java.util.List;

public class ArbreBinaire {
	private Noeud racine;

	public ArbreBinaire() {

	}

	public void ajouterNoeud(Noeud ajouterNoeud) {
		if (racine == null) {
			racine = ajouterNoeud;
		} else {
			racine.ajouterValeur(ajouterNoeud);
		}
	}

	@Override
	public String toString() {
		return  racine.toString();
	}

	public String parcoursInfixe() {
		if (racine == null) {
			return null;
//        parcoursInfixe();
//        System.out.print(a.contenu + " ");
//        parcoursInfixe(a.filsD);
		} else {
		return	racine.toStringInfixe();
		}
		
	}
	
}
