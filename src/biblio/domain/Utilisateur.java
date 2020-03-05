package biblio.domain;

import java.time.LocalDate;
import java.util.ArrayList;

public class Utilisateur extends Personne {

	
	// VARIABLES
	
	private int idUtilisateur;		// unique
	private String pwd;
	private String pseudonyme;
	
	private ArrayList <EmpruntEnCours> empruntsEnCours = new ArrayList <EmpruntEnCours>();
	
	private ArrayList <EmpruntArchive> empruntsArchives = new ArrayList <EmpruntArchive>();
	
	
	// CONSTRUCTEURS
	
	public Utilisateur() {
		super();
	}
	
	
	public Utilisateur(String nom, String prenom, LocalDate dateNaissance, String sexe, 
			int idUtilisateur, String pwd, String pseudonyme) {
		super(nom, prenom, dateNaissance, sexe);
		this.idUtilisateur = idUtilisateur;
		this.pwd = pwd;
		this.pseudonyme = pseudonyme;
	}

	
	public Utilisateur(String nom, String prenom, int idUtilisateur) {
		super(nom, prenom);
		this.idUtilisateur = idUtilisateur;
	}

	
	// GETTERS ET SETTERS

	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	
	public String getPseudonyme() {
		return pseudonyme;
	}

	public void setPseudonyme(String pseudonyme) {
		this.pseudonyme = pseudonyme;
	}


	public ArrayList <EmpruntEnCours> getEmpruntsEnCours() {
		return empruntsEnCours;
	}


	public void setEmpruntsEnCours(ArrayList <EmpruntEnCours> empruntsEnCours) {
		this.empruntsEnCours = empruntsEnCours;
	}

	
	public ArrayList <EmpruntArchive> getEmpruntsArchives() {
		return empruntsArchives;
	}

	public void setEmpruntsArchives(ArrayList <EmpruntArchive> empruntsArchives) {
		this.empruntsArchives = empruntsArchives;
	}

	
	// METHODES
	
	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur = " + idUtilisateur + ", pwd = " + pwd + ", pseudonyme = " + pseudonyme + 
				", empruntsEnCours = " + empruntsEnCours + ", empruntsArchives = " + empruntsArchives + "]";
	}
	
	public void addEmpruntEnCours(EmpruntEnCours ep) {
		empruntsEnCours.add(ep);
	}
	

	public int getNbEmpruntsEnCours() {
		return 0;
	}
	
	
	
	public static void main(String[] args) {
		
		
		
	}

	

	
}
