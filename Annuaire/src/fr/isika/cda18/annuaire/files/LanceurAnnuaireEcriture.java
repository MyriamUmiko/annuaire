package fr.isika.cda18.annuaire.files;

import java.io.FileWriter;
import java.io.IOException;

public class LanceurAnnuaireEcriture {
	public static void main(String[] args) {

		//FileWriter(chemin, booleen)
		//boolean false -> ecrire au d�but (�crase ce qui existe d�j�)
		//boolean true => ecrire � la fin du fichier (� la suite de l'existant)
		
		try {
			//cr�ation d'un flux du prog vers le fichier
			FileWriter fw = new FileWriter("src/mesFichiers/monFichier.txt", false);
			
			fw.write("123 \r\n");
			fw.write("J'�cris ma premi�re ligne via java\r\n");
		
			
			//fermeture du flux
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
