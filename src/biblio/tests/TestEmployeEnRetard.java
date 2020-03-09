package biblio.tests;

import java.time.LocalDate;
import java.time.Month;

import biblio.dao.*;
import biblio.domain.*;

public class TestEmployeEnRetard {

	public static void main(String[] args) throws BiblioException {
		
		ExemplairesDao exDao = new ExemplairesDao();
		UtilisateursDao utDao = new UtilisateursDao();		
		
		Employe employe = (Employe) utDao.findByKey(4);	 
		Exemplaire e1 = exDao.findByKey(1);
		Exemplaire e2 = exDao.findByKey(2);
		Exemplaire e3 = exDao.findByKey(3);
		Exemplaire e4 = exDao.findByKey(4);
		
		EmpruntEnCours empc1 = new EmpruntEnCours(LocalDate.of(2018, Month.FEBRUARY, 17), employe, e1);	
		EmpruntEnCours empc2 = new EmpruntEnCours(LocalDate.now(), employe, e2);
		EmpruntEnCours empc3 = new EmpruntEnCours(LocalDate.of(2019, Month.FEBRUARY, 17), employe, e3);	
		EmpruntEnCours empc4 = new EmpruntEnCours(LocalDate.of(2015, Month.FEBRUARY, 17), employe, e4);			
	
			employe.addEmpruntEnCours(empc1);
			employe.addEmpruntEnCours(empc2);
			employe.addEmpruntEnCours(empc3);
			employe.addEmpruntEnCours(empc4);	
			
		// affichage des emprunts
		System.out.println("Nombre d'emprunts de l'employé : " + employe.getEmpruntsEnCours().size());	
	    System.out.println("getEmpruntEnCours de l'adhérent a1 : " + employe.getEmpruntsEnCours());	
	    	

	}

}
