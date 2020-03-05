package biblio.domain;

import java.time.LocalDate;

public class EmpruntArchive {

	
	// VARIABLES
	
	private LocalDate dateEmprunt;
	private LocalDate dateRestitutionEff;
	
	private Utilisateur utilisateur;		// 1 seul utilisateur  par EmpruntEnCours
	
	private Exemplaire exemplaire;			// 1 seul exemplaire par EmpruntEnCours
	
	
	// CONSTRUCTEURS
	
	public EmpruntArchive() {
		super();
	}

	
	public EmpruntArchive(LocalDate dateEmprunt, LocalDate dateRestitutionEff, Utilisateur utilisateur, Exemplaire exemplaire) {
		super();
		this.dateEmprunt = dateEmprunt;
		this.dateRestitutionEff = dateRestitutionEff;
		this.utilisateur = utilisateur;
		this.exemplaire = exemplaire;
	}
	
	
	// GETTERS ET SETTERS
	
	public LocalDate getDateEmprunt() {
		return dateEmprunt;
	}

	public void setDateEmprunt(LocalDate dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	
	public LocalDate getDateRestitutionEff() {
		return dateRestitutionEff;
	}

	public void setDateRestitutionEff(LocalDate dateRestitutionEff) {
		this.dateRestitutionEff = dateRestitutionEff;
	}
	
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	
	public Exemplaire getExemplaire() {
		return exemplaire;
	}


	public void setExemplaire(Exemplaire exemplaire) {
		this.exemplaire = exemplaire;
	}


	// METHODES
	
	@Override
	public String toString() {
		return "EmpruntArchive [dateEmprunt = " + dateEmprunt + ", dateRestitutionEff = " + dateRestitutionEff + 
				" utilisateur = " + utilisateur + ", exemplaire = " + exemplaire + "]";
	}


	
	
	
	public static void main(String[] args) {
		
		

	}

	
}
