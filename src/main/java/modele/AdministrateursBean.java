package modele;

public class AdministrateursBean {
	
	private int idAdministrateur;
	private String nom;
	private String email;
	private String motDePasse;
	private String privileges;
	
	public AdministrateursBean() {
	
	}
		
	public AdministrateursBean(String nom, String email, String motDePasse, String privileges) {
		super();
		this.nom = nom;
		this.email = email;
		this.motDePasse = motDePasse;
		this.privileges = privileges;
	}

	public AdministrateursBean(int idAdministrateur, String nom, String email, String privileges) {
		super();
		this.idAdministrateur = idAdministrateur;
		this.nom = nom;
		this.email = email;
		this.privileges = privileges;
	}

	
	
	
	public int getIdAdministrateur() {
		return idAdministrateur;
	}
	public void setIdAdministrateur(int idAdministrateur) {
		this.idAdministrateur = idAdministrateur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
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
	public String getPrivileges() {
		return privileges;
	}
	public void setPrivileges(String privileges) {
		this.privileges = privileges;
	}	
	
	
	
}
