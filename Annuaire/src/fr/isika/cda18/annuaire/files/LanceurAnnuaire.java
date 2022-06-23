package fr.isika.cda18.annuaire.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import fr.isika.cda18.annuaire.model.Stagiaire;

public class LanceurAnnuaire {

//test
	
	public static void main(String[] args) {
		List<Stagiaire> listeStagiaire=new ArrayList<>();
//		Stagiaire stagiaire=new Stagiaire(null,null,0,null,0);
		
		
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
		
			for(Stagiaire stagiaire:listeStagiaire) {
			System.out.println(stagiaire);
			}
	
			
//			/*fr.read() retourne un entier
//			cet entier c'est l'unicode du caract�re lu*/
//			int caractereLu = 0;
//			String texteLu = "";
//			
//			//caract�reLu = -1 => fin du fichier donc fin du while
//			while((caractereLu = fr.read()) != -1 ) {
//				texteLu += (char) caractereLu;
//			}
//			
//			System.out.println(texteLu);
//			
			//fermeture des flux
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
			

	}
		
}



	

