package fr.isika.cda18.annuaire.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LanceurAnnuaire {

	//test2
	
	public static void main(String[] args) {
		
		try {
			
			//ouvre un flux du fichier vers le programme
			FileReader fr = new FileReader("src/mesFichiers/STAGIAIRES.DON");
			BufferedReader br = new BufferedReader(fr);
			
			String contenu = "";
			
			//tant qu'il y a quelque chose � lire, lit la ligne
			while(br.ready()) {
				contenu += br.readLine() + "\n";
			}
			
			System.out.println(contenu);
			
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



	

