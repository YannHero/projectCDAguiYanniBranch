package modele;

import java.time.LocalDate;

public class EntreesEnStockBean {
	
	private int idEntree;
	private FournisseursBean fournisseur;
	private ProduitsBean produit;
	private LocalDate dateE;
	private int quantite;
	
	public EntreesEnStockBean() {
		
	}
	
	public EntreesEnStockBean(FournisseursBean fournisseur, ProduitsBean produit, LocalDate dateE, int quantite) {
		this.fournisseur = fournisseur;
		this.produit = produit;
		this.dateE = dateE;
		this.quantite = quantite;
	}

	public EntreesEnStockBean(int idEntree, FournisseursBean fournisseur, ProduitsBean produit, LocalDate dateE,
			int quantite) {
		this.idEntree = idEntree;
		this.fournisseur = fournisseur;
		this.produit = produit;
		this.dateE = dateE;
		this.quantite = quantite;
	}



	public int getIdEntree() {
		return idEntree;
	}
	public void setIdEntree(int idEntree) {
		this.idEntree = idEntree;
	}
	public FournisseursBean getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(FournisseursBean fournisseur) {
		this.fournisseur = fournisseur;
	}
	public ProduitsBean getProduit() {
		return produit;
	}
	public void setProduit(ProduitsBean produit) {
		this.produit = produit;
	}
	public LocalDate getDateE() {
		return dateE;
	}
	public void setDateE(LocalDate dateE) {
		this.dateE = dateE;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	

}
