package biblio.domain;

import java.time.LocalDate;

public class Personne {

	
	// VARIABLES
	
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private String sexe;
	
	
	// CONSTRUCTEURS
	
	public Personne() {
		super();
	}


	public Personne(String nom, String prenom, LocalDate dateNaissance, String sexe) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.sexe = sexe;
	}
	

	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}


	// GETTERS ET SETTERS
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}


	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	
	// METHODES
	
	@Override
	public String toString() {
		return "Personne [nom = " + nom + ", prenom = " + prenom + ", dateNaissance = " + dateNaissance + ", sexe = " + sexe + "]";
	}
	
	
}
