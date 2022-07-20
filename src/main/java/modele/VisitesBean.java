package modele;

import java.util.Date;

public class VisitesBean {
	private int idVisite;
	private ProduitsBean produit;
	private UtilisateursBean utilisateur;
	private Date dateV;

	public VisitesBean() {
		
	}

	public VisitesBean(int idVisite, ProduitsBean produit, UtilisateursBean utilisateur, Date dateV) {
		this.idVisite = idVisite;
		this.produit = produit;
		this.utilisateur = utilisateur;
		this.dateV = dateV;
	}

	public int getIdVisite() {
		return idVisite;
	}
	public void setIdVisite(int idVisite) {
		this.idVisite = idVisite;
	}
	public ProduitsBean getProduit() {
		return produit;
	}
	public void setProduit(ProduitsBean produit) {
		this.produit = produit;
	}
	public UtilisateursBean getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(UtilisateursBean utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Date getDateV() {
		return dateV;
	}
	public void setDateV(Date dateV) {
		this.dateV = dateV;
	}
	

	
}
