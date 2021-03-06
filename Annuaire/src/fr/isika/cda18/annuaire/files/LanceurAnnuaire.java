package fr.isika.cda18.annuaire.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import fr.isika.cda18.annuaire.model.ArbreBinaire;
import fr.isika.cda18.annuaire.model.Noeud;
import fr.isika.cda18.annuaire.model.Stagiaire;

public class LanceurAnnuaire {

//test
	
	public static void main(String[] args) {
		List<Stagiaire> listeStagiaire=new ArrayList<>();
		

		ArbreBinaire arbreBinaire = new ArbreBinaire();

		// stocker les données dans une liste

		//stocker les données dans la liste - pour la lecture du fichier STAGIAIRE.DON

		try {
			
			//ouvre un flux du fichier vers le programme
			FileReader fr = new FileReader("Annuaire/src/mesFichiers/STAGIAIRES.DON");
			BufferedReader br = new BufferedReader(fr);
			
			String contenu = "";
			
			//tant qu'il y a quelque chose à lire, lit la ligne
			while(br.ready()) {
				Stagiaire stagiaire=new Stagiaire(null,null,null,null,null);
				stagiaire.setNom(br.readLine() );
				stagiaire.setPrenom(br.readLine());
				stagiaire.setDepartement(br.readLine() );
				stagiaire.setNomPromo(br.readLine() );
				stagiaire.setAnneePromo(br.readLine());
				contenu+=br.readLine() ;
				listeStagiaire.add(stagiaire);
				
			}
		

//			for(Stagiaire stagiaire:listeStagiaire) {
//			System.out.println(stagiaire);
//			}
	
			//fermeture des flux

//			for(Stagiaire stagiaire:listeStagiaire) {
//			System.out.println(stagiaire);
//			}
//	

			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	// Affichage de l'ABR 
	for (Stagiaire stagiaire : listeStagiaire) {
		arbreBinaire.ajouterNoeud(new Noeud(stagiaire));
	}
	
	System.out.println("----------------");
//	System.out.println(listeStagiaire.size());
	//System.out.println(arbreBinaire);
	System.out.println(arbreBinaire.parcoursInfixe() );
//	System.out.println("------------------------------------------");
//	arbreBinaire.nombreTotalDesNoeuds(arbreBinaire);
//	System.out.println(arbreBinaire.nombreTotalDesNoeuds(arbreBinaire));

		
		
			


	}
		
}



	

