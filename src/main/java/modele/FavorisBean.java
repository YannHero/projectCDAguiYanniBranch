package modele;

public class FavorisBean {
	
	private int idFavori;
	private ProduitsBean produit;
	private UtilisateursBean utilisateur;
	
	public FavorisBean() {
		
	}

	public FavorisBean(int idFavori, ProduitsBean produit, UtilisateursBean utilisateur) {
		this.idFavori = idFavori;
		this.produit = produit;
		this.utilisateur = utilisateur;
	}

	public int getIdFavori() {
		return idFavori;
	}
	public void setIdFavori(int idFavori) {
		this.idFavori = idFavori;
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
	

}
