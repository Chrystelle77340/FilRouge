package biblio.tests;

import biblio.domain.BiblioException;

import java.time.LocalDate;

import biblio.dao.*;
import biblio.domain.*;

public class TestAdherentTroisEmprunts {

	public static void main(String[] args) throws BiblioException {
		
		ExemplairesDao exDao = new ExemplairesDao();
		UtilisateursDao utDao = new UtilisateursDao();

		Adherent a1 = (Adherent) utDao.findByKey(1);
		Exemplaire e1 = exDao.findByKey(1);
		Exemplaire e2 = exDao.findByKey(2);
		Exemplaire e3 = exDao.findByKey(3);
		Exemplaire e4 = exDao.findByKey(4);
		EmpruntEnCours empc1 = new EmpruntEnCours(LocalDate.now(), a1, e1);
		EmpruntEnCours empc2 = new EmpruntEnCours(LocalDate.now(), a1, e2);
		EmpruntEnCours empc3 = new EmpruntEnCours(LocalDate.now(), a1, e3);

		// AJOUT DE 3 EMPRUNTS
		a1.addEmpruntEnCours(empc1);
		a1.addEmpruntEnCours(empc2);
		a1.addEmpruntEnCours(empc3);

		System.out.println(a1.isConditionsPretAcceptees());
		System.out.println("Nombre d'emprunts de l'adhérent a1 : " + a1.getEmpruntsEnCours().size());
		EmpruntEnCours empc4 = new EmpruntEnCours(LocalDate.now(), a1, e4);
		
		// AJOUT D'UN EMPRUNT
		a1.addEmpruntEnCours(empc4);
		System.out.println("Nombre d'emprunts après une tentative d'ajout d'un 4ème emprunt : " + a1.getEmpruntsEnCours().size());

	}

}
