package modele;

import java.util.Date;

public class RecherchesBean {
	
	private int idRecherche;
	private UtilisateursBean utilisateur;
	private String motClef;
	private Date dateR;
	
	public RecherchesBean() {
	}


	public RecherchesBean(int idRecherche, UtilisateursBean utilisateur, String motClef, Date dateR) {
		this.idRecherche = idRecherche;
		this.utilisateur = utilisateur;
		this.motClef = motClef;
		this.dateR = dateR;
	}

	public int getIdRecherche() {
		return idRecherche;
	}
	public void setIdRecherche(int idRecherche) {
		this.idRecherche = idRecherche;
	}
	public UtilisateursBean getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(UtilisateursBean utilisateur) {
		this.utilisateur = utilisateur;
	}
	public String getMotClef() {
		return motClef;
	}
	public void setMotClef(String motClef) {
		this.motClef = motClef;
	}
	public Date getDateR() {
		return dateR;
	}
	public void setDateR(Date dateR) {
		this.dateR = dateR;
	}
	
	
					

}
