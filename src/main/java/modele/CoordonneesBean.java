package modele;

public class CoordonneesBean {
	
	private int idCoordonnee;
	private String nom;
	private String adresse;
	private String telephone;
	private String email;
	private String logo;
	
	public CoordonneesBean() {
		
	}
	
	public CoordonneesBean(String nom, String adresse, String telephone, String email, String logo) {
		this.nom = nom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
		this.logo = logo;
	}

	public CoordonneesBean(int idCoordonnee, String nom, String adresse, String telephone, String email, String logo) {
		this.idCoordonnee = idCoordonnee;
		this.nom = nom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
		this.logo = logo;
	}



	public int getIdCoordonnee() {
		return idCoordonnee;
	}
	public void setIdCoordonnee(int idCoordonnee) {
		this.idCoordonnee = idCoordonnee;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	
	
	
}
