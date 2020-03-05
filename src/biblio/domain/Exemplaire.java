package biblio.domain;

import java.time.LocalDate;
import java.util.ArrayList;

public class Exemplaire {

	
	// VARIABLES
	
	private int idExemplaire;		// unique
	private LocalDate dateAchat;
	private EnumStatusExemplaire status;
	private String isbn;
	
	private EmpruntEnCours empruntEnCours;			// 1 seul empruntEnCours par Exemplaire
	
	private ArrayList <EmpruntArchive> empruntsArchives = new ArrayList <EmpruntArchive>();
	
	
	// CONSTRUCTEURS
	
	public Exemplaire() {
		super();
	}
	
	
	public Exemplaire(int idExemplaire, LocalDate dateAchat, EnumStatusExemplaire status, String isbn, EmpruntEnCours empruntEnCours) {
		super();
		this.idExemplaire = idExemplaire;
		this.dateAchat = dateAchat;
		this.status = status;
		this.isbn = isbn;
		this.empruntEnCours = empruntEnCours;
	}
	
	
	// GETTERS ET SETTERS
	
	public int getIdExemplaire() {
		return idExemplaire;
	}

	public void setIdExemplaire(int idExemplaire) {
		this.idExemplaire = idExemplaire;
	}

	
	public LocalDate getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(LocalDate dateAchat) {
		this.dateAchat = dateAchat;
	}

	
	public EnumStatusExemplaire getStatus() {
		return status;
	}

	public void setStatus(EnumStatusExemplaire status) {
		this.status = status;
	}

	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	

	public EmpruntEnCours getEmpruntEnCours() {
		return empruntEnCours;
	}


	public void setEmpruntEnCours(EmpruntEnCours empruntEnCours) {
		this.empruntEnCours = empruntEnCours;
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
		return "Exemplaire [idExemplaire = " + idExemplaire + ", dateAchat = " + dateAchat + ", status = " + status + ", isbn = " + isbn + 
				", empruntEnCours = " + empruntEnCours + ", empruntsArchives = " + empruntsArchives + "]";
	}

	
	
	
	public static void main(String[] args) {
		
		

	}


}
