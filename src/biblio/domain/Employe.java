package biblio.domain;

import java.time.LocalDate;
import java.util.ArrayList;

public class Employe extends Utilisateur {

	
	// VARIABLES
	
	private String codeMatricule;		// unique
	private EnumCategorieEmploye categorieEmploye;
	
	
	// CONSTRUCTEURS
	
	public Employe() {
		super();
	}
	
	
	public Employe(String nom, String prenom, LocalDate dateNaissance, String sexe, 
			int idUtilisateur, String pwd, String pseudonyme, 
			String codeMatricule, EnumCategorieEmploye categorieEmploye) {
		super(nom, prenom, dateNaissance, sexe, idUtilisateur, pwd, pseudonyme);
		this.codeMatricule = codeMatricule;
		this.categorieEmploye = categorieEmploye;
	}


	// GETTERS ET SETTERS
	
	public String getCodeMatricule() {
		return codeMatricule;
	}

	public void setCodeMatricule(String codeMatricule) {
		this.codeMatricule = codeMatricule;
	}

	
	public EnumCategorieEmploye getCategorieEmploye() {
		return categorieEmploye;
	}

	public void setCategorieEmploye(EnumCategorieEmploye categorieEmploye) {
		this.categorieEmploye = categorieEmploye;
	}


	// METHODES
	
	@Override
	public String toString() {
		return "Employe [codeMatricule = " + codeMatricule + ", categorieEmploye = " + categorieEmploye + "]";
	}
	
	
	


	public static void main(String[] args) {
		
		

	}
	

}
