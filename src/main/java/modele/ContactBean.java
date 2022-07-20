package modele;

public class ContactBean {
	
	private int idContact;
	private UtilisateursBean utilisateur;
	private String sujet;
	private String message;
	private int etat;
	private String email;
	
	public ContactBean() {
	
	}
	
	public ContactBean(UtilisateursBean utilisateur, String sujet, String message, int etat, String email) {
		this.utilisateur = utilisateur;
		this.sujet = sujet;
		this.message = message;
		this.etat = etat;
		this.email = email;
	}

	public ContactBean(int idContact, UtilisateursBean utilisateur, String sujet, String message, int etat,
			String email) {
		this.idContact = idContact;
		this.utilisateur = utilisateur;
		this.sujet = sujet;
		this.message = message;
		this.etat = etat;
		this.email = email;
	}


	
	public int getIdContact() {
		return idContact;
	}
	public void setIdContact(int idContact) {
		this.idContact = idContact;
	}
	public UtilisateursBean getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(UtilisateursBean utilisateur) {
		this.utilisateur = utilisateur;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
}
