package biblio.dao;

import java.util.ArrayList;

import biblio.domain.Utilisateur;

// Cette classe permet l'accès aux données (DAO)

public class UtilisateursDao {

	
	Utilisateur util1 = new Utilisateur ("Alex", "Cerise", 001);
	Utilisateur util2 = new Utilisateur ("Aurélie", "Letoux", 002);
	Utilisateur util3 = new Utilisateur ("Christophe", "Fleury", 003);
	Utilisateur util4 = new Utilisateur ("Déborah", "Smits", 004);		
	
	
	// ArrayList qui simule la BDD des utilisateurs de la bibliothèque
	private ArrayList <Utilisateur> utilisateursDB = new ArrayList <Utilisateur>() {{
		add(util1);
		add(util2);
		add(util3);
		add(util4);
	}};
	
	
	
	// Méthode qui retourne l'utilisateur par son idUtilisateur
	public Utilisateur findByKey(int idUtilisateur) {
		for (int i = 0 ; i < utilisateursDB.size() ; i++) {
			//if (utilisateursDB.get(idUtilisateur) == idUtilisateur) 
				//return utilisateursDB;
		}
		return null;
	}
	
	
	
}
