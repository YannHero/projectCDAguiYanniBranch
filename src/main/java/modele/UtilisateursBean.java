package modele;

import java.util.Date;

public class UtilisateursBean {
	
	private int idUtilisateur;
	private String nom;
	private String prenom;
	private Date dateInscription;
	private String email;
	private String motDePasse;
	
	public UtilisateursBean() {
		
	}

	public UtilisateursBean(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public UtilisateursBean(String nom, String prenom, String email, String motDePasse) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.motDePasse = motDePasse;
	}

	public UtilisateursBean(int idUtilisateur, String nom, String prenom, Date dateInscription, String email) {
		this.idUtilisateur = idUtilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.dateInscription = dateInscription;
		this.email = email;
	}

	public UtilisateursBean(int idUtilisateur, String nom, String prenom, Date dateInscription, String email, String motDePasse) {
		this.idUtilisateur = idUtilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.dateInscription = dateInscription;
		this.email = email;
		this.motDePasse = motDePasse;
	}

	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
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
	public Date getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
						
}
