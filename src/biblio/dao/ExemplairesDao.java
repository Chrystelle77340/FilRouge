package biblio.dao;

import java.time.LocalDate;
import java.time.Month;

import biblio.domain.Exemplaire;

public class ExemplairesDao {

	
	private Exemplaire[] exemplairesDB = { new Exemplaire(1, LocalDate.of(2015, Month.MARCH, 01), "isbn1"),
			new Exemplaire(2, LocalDate.of(2016, Month.APRIL, 02), "isbn2"),
			new Exemplaire(3, LocalDate.of(2007, Month.MAY, 03), "isbn3"),
			new Exemplaire(4, LocalDate.of(2018, Month.JUNE, 04), "isbn4") };

	public  Exemplaire findByKey(int idExemplaire) {
		for (Exemplaire exemplaire : exemplairesDB) {
			if (exemplaire.getIdExemplaire() == idExemplaire)
				return exemplaire;
		}
		return null;
	}
	

}
