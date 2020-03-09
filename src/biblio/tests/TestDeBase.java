package biblio.tests;

import java.time.LocalDate;

import biblio.dao.*;
import biblio.domain.*;


public class TestDeBase {

	public static void main(String[] args) throws BiblioException {
		
		ExemplairesDao exDao = new ExemplairesDao();
		UtilisateursDao utDao = new UtilisateursDao();
		
		
		System.out.println( "findbykey");
		System.out.println( exDao.findByKey (1));
		System.out.println( exDao.findByKey (4));		
		System.out.println(utDao.findByKey(1));
		System.out.println(utDao.findByKey(3));
		
		// Création d'un adhérent à partir de la dao
		Adherent a1 = (Adherent) utDao.findByKey(1);	 
		Exemplaire e1 = exDao.findByKey(2);
		
		EmpruntEnCours empc1 = new EmpruntEnCours(LocalDate.now(), a1, e1);		
		a1.addEmpruntEnCours(empc1);	

		System.out.println("EmpruntEnCours de l'adhérent a1: " + a1.getEmpruntsEnCours());	
		
		// Création d'un employé à partir de la dao
		Employe em1 = (Employe) utDao.findByKey(3);	 
		Exemplaire e2 = exDao.findByKey(1);
		EmpruntEnCours empc2 = new EmpruntEnCours(LocalDate.now(), em1, e2);		
		em1.addEmpruntEnCours(empc2);		
		
		System.out.println("EmpruntEnCours de l'employé em1: " + em1.getEmpruntsEnCours());	
		

	}

}
