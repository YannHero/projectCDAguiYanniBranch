package modele;

import java.time.LocalDate;

public class CommandesBean {
	
	private int idCommande;
	private UtilisateursBean utilisateur;
	private LocalDate dateC;
	private double total;
	private AdressesLivraisonBean adresse;
	private int etat;
	
	public CommandesBean() {
	
	}
	
	public CommandesBean(int idCommande) {
		this.idCommande = idCommande;
	}

	public CommandesBean(UtilisateursBean utilisateur, LocalDate dateC, double total, AdressesLivraisonBean adresse,
			int etat) {
		this.utilisateur = utilisateur;
		this.dateC = dateC;
		this.total = total;
		this.adresse = adresse;
		this.etat = etat;
	}

	public CommandesBean(int idCommande, UtilisateursBean utilisateur, LocalDate dateC, double total,
			AdressesLivraisonBean adresse, int etat) {
		this.idCommande = idCommande;
		this.utilisateur = utilisateur;
		this.dateC = dateC;
		this.total = total;
		this.adresse = adresse;
		this.etat = etat;
	}

	
	
	public int getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}
	public UtilisateursBean getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(UtilisateursBean utilisateur) {
		this.utilisateur = utilisateur;
	}
	public LocalDate getDateC() {
		return dateC;
	}
	public void setDateC(LocalDate dateC) {
		this.dateC = dateC;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public AdressesLivraisonBean getAdresse() {
		return adresse;
	}
	public void setAdresse(AdressesLivraisonBean adresse) {
		this.adresse = adresse;
	}
	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}
	
	
}
