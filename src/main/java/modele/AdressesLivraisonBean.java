package modele;

public class AdressesLivraisonBean {
	
	private int idAdresse;
	private UtilisateursBean utilisateur;
	private String adresse;
	private int codePostale;
	private String ville;
	private String pays;
	
	public AdressesLivraisonBean() {

	}
	
	public AdressesLivraisonBean(int idAdresse) {
		super();
		this.idAdresse = idAdresse;
	}

	public AdressesLivraisonBean(UtilisateursBean utilisateur, String adresse, int codePostale, String ville,
			String pays) {
		this.utilisateur = utilisateur;
		this.adresse = adresse;
		this.codePostale = codePostale;
		this.ville = ville;
		this.pays = pays;
	}

	public AdressesLivraisonBean(int idAdresse, UtilisateursBean utilisateur, String adresse, int codePostale,
			String ville, String pays) {
		this.idAdresse = idAdresse;
		this.utilisateur = utilisateur;
		this.adresse = adresse;
		this.codePostale = codePostale;
		this.ville = ville;
		this.pays = pays;
	}

	
	
	public int getIdAdresse() {
		return idAdresse;
	}
	public void setIdAdresse(int idAdresse) {
		this.idAdresse = idAdresse;
	}
	public UtilisateursBean getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(UtilisateursBean utilisateur) {
		this.utilisateur = utilisateur;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getCodePostale() {
		return codePostale;
	}
	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
	}
	public String getville() {
		return ville;
	}
	public void setville(String ville) {
		this.ville = ville;
	}
	public String getpays() {
		return pays;
	}
	public void setpays(String pays) {
		this.pays = pays;
	}	
	
	
}
