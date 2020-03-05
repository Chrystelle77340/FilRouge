package biblio.domain;

import java.time.LocalDate;

public class Adherent extends Utilisateur {

	
	// VARIABLES
	
	private String telephone;
	private static final int nbMaxPrets = 3;
	private static final int dureeMaxPrets = 15;
	
	private boolean conditionsPretAcceptees;
	
	
	// CONSTRUCTEURS
	
	public Adherent() {
		super();
	}


	public Adherent(String nom, String prenom, LocalDate dateNaissance, String sexe,
			int idUtilisateur, String pwd, String pseudonyme,
			String telephone) {
		super(nom, prenom, dateNaissance, sexe, idUtilisateur, pwd, pseudonyme);
		this.telephone = telephone;
		
	}
	
	
	// GETTERS ET SETTERS
	
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public static int getNbmaxprets() {
		return nbMaxPrets;
	}

	public static int getDureemaxprets() {
		return dureeMaxPrets;
	}
	
	
	public boolean isConditionsPretAcceptees() {
		return conditionsPretAcceptees;
	}

	public void setConditionsPretAcceptees(boolean conditionsPretAcceptees) {
		this.conditionsPretAcceptees = conditionsPretAcceptees;
	}
	
	
	// METHODES
	
	@Override
	public String toString() {
		return "Adherent [telephone = " + telephone + "]";
	}
	
//	public boolean isConditionsPretAcceptees(Adherent adherent) {
//		conditionsPretAcceptees = true;
//		if (nbMaxPrets > 3 && adherent.isPretEnRetard(adherent.))
//		return false;
//	}
	
	
	public boolean isPretEnRetard(EmpruntEnCours ep) {
		boolean pretEnRetard = false;
		if (ep != null && ep.getDateEmprunt() != null) {
			LocalDate today = LocalDate.now();
			LocalDate limite = ep.getDateEmprunt().plusDays(dureeMaxPrets);
			if (limite.compareTo(today) < 0) {		// compareTo : return chiffre inférieur si date limite < today
				pretEnRetard = true;				// si date limite < today, ça veut dire qu'on a dépassé la date limite, d'où retard
			}
		}
		return pretEnRetard;
	}
	
//	public int getNbRetards() {
//		return nbRetards;
//	}
	
	
	public static void main(String[] args) {
		
		

	}


	


}
