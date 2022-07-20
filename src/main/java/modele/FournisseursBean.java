package modele;

public class FournisseursBean {
	
	private int idFournisseur;
	private String nom;
	
	public FournisseursBean() {
	
	}
	
	public FournisseursBean(int idFournisseur) {
		this.idFournisseur = idFournisseur;
	}

	public FournisseursBean(int idFournisseur, String nom) {
		this.idFournisseur = idFournisseur;
		this.nom = nom;
	}


	
	public int getIdFournisseur() {
		return idFournisseur;
	}
	public void setIdFournisseur(int idFournisseur) {
		this.idFournisseur = idFournisseur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
}
