package biblio.dao;

import java.util.ArrayList;

import biblio.domain.Adherent;
import biblio.domain.Employe;
import biblio.domain.Utilisateur;

// Cette classe permet l'accès aux données (DAO)

public class UtilisateursDao {

	
//	Utilisateur util1 = new Utilisateur ("Alex", "Cerise", 001);
//	Utilisateur util2 = new Utilisateur ("Aurélie", "Letoux", 002);
//	Utilisateur util3 = new Utilisateur ("Christophe", "Fleury", 003);
//	Utilisateur util4 = new Utilisateur ("Déborah", "Smits", 004);		
//	
//	
//	// ArrayList qui simule la BDD des utilisateurs de la bibliothèque
//	private ArrayList <Utilisateur> utilisateursDB = new ArrayList <Utilisateur>() {{
//		add(util1);
//		add(util2);
//		add(util3);
//		add(util4);
//	}};
	private static ArrayList <Utilisateur> utilisateursDB = new ArrayList <Utilisateur>();
	
	static {
		utilisateursDB.add(new Adherent ("Alex", "Cerise", 001));
		utilisateursDB.add(new Adherent ("Aurélie", "Letoux", 002));
		utilisateursDB.add(new Employe ("Christophe", "Fleury", 003));
		utilisateursDB.add(new Employe ("Déborah", "Smits", 004));
	}
	
	
	// Méthode qui retourne l'utilisateur par son idUtilisateur
	public Utilisateur findByKey(int idUtilisateur) {
		for (Utilisateur utilisateur : utilisateursDB) {
			if (utilisateur.getIdUtilisateur() == idUtilisateur) 
				return utilisateur;
		}
		return null;
	}
	
	
	
}
