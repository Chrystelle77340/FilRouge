package biblio.domain;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Adherent extends Utilisateur {

	
	// VARIABLES
	
	private String telephone;
	private static int nbMaxPrets = 3;
	private static int dureeMaxPrets = 15;
	
	//private boolean conditionsPretAcceptees;
	
	
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
	
	
	public Adherent(String nom, String prenom, int idUtilisateur) {
		super(nom, prenom, idUtilisateur);
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

//	public void setConditionsPretAcceptees(boolean conditionsPretAcceptees) {
//		this.conditionsPretAcceptees = conditionsPretAcceptees;
//	}
	
	
	// METHODES
	
	@Override
	public String toString() {
		return "Adherent [telephone = " + telephone + "]";
	}
	
	
	public static void setNbMaxPrets(Integer nbMaxPrets) {
		Adherent.nbMaxPrets = nbMaxPrets;
	}
	
	
	public static void setDureeMaxPrets(Integer dureeMaxPrets) {
		Adherent.dureeMaxPrets = dureeMaxPrets;
	}
	
	
	@Override
	public boolean isConditionsPretAcceptees() throws BiblioException {
		if (this.getNbRetards() == 0 && this.getNbEmpruntsEnCours() < 3){
			return true ;
		}
		else {
			try {
				throw new BiblioException("Prêt non accordé");
			} 
			catch (BiblioException e) {				
			}
		return false;
		}
	}
	
	
//	public boolean isPretEnRetard(EmpruntEnCours ep) {
//		boolean pretEnRetard = false;
//		if (ep != null && ep.getDateEmprunt() != null) {
//			LocalDate today = LocalDate.now();
//			LocalDate limite = ep.getDateEmprunt().plusDays(dureeMaxPrets);
//			if (limite.compareTo(today) < 0) {		// compareTo : return chiffre inférieur si date limite < today
//				pretEnRetard = true;				// si date limite < today, ça veut dire qu'on a dépassé la date limite, d'où retard
//			}
//		}
//		return pretEnRetard;
//	}
	
	
	@Override
	public void addEmpruntEnCours(EmpruntEnCours EmpruntEnCours) throws BiblioException {
		if(isConditionsPretAcceptees()){
			this.empruntsEnCours.add(EmpruntEnCours);
		}
}
	
	
	public int getNbRetards() {
		int  nbRetards = 0;
		for (EmpruntEnCours ep : this.getEmpruntsEnCours()){			
			int duree = (int) ChronoUnit.DAYS.between(ep.getDateEmprunt(), LocalDate.now());	
			if (duree > 15){
				nbRetards++;
			}
		}
		return nbRetards;
	}
	

}
