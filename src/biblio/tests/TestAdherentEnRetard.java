package biblio.tests;

import biblio.domain.BiblioException;

import java.time.LocalDate;
import java.time.Month;

import biblio.dao.*;
import biblio.domain.*;


public class TestAdherentEnRetard {

	public static void main(String[] args) throws BiblioException {
		
		ExemplairesDao exDao = new ExemplairesDao();
		UtilisateursDao utDao = new UtilisateursDao();

		Adherent a1 = (Adherent) utDao.findByKey(1);

		Exemplaire e1 = exDao.findByKey(1);
		Exemplaire e2 = exDao.findByKey(2);

		EmpruntEnCours empc1 = new EmpruntEnCours(LocalDate.of(2020, Month.FEBRUARY, 17), a1, e1);
		
		EmpruntEnCours empc2 = new EmpruntEnCours(LocalDate.now(), a1, e2);
		
		// AJOUT D'UN EMPRUNT EN RETARD (impossible si enprunt precedent = enretard)
		a1.addEmpruntEnCours(empc1);
		
		// LES CONDITIONS NE SONT PAS ACCEPTEES
		System.out.println(a1.isConditionsPretAcceptees());
		
		// AJOUT D'UN SECOND EMPRUNT
		a1.addEmpruntEnCours(empc2);
		
		// affichage des emprunts

		System.out.println("getEmpruntEnCours de l'adhérent a1: " + a1.getEmpruntsEnCours());


	}

}
