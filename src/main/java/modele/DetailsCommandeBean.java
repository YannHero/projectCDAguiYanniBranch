package modele;

public class DetailsCommandeBean {
	
	private int idDetailsCommande;
	private CommandesBean commande;
	private ProduitsBean produit;
	private int quantite;
	private Double prix;
	
	public DetailsCommandeBean() {
		
	}
		
	public DetailsCommandeBean(CommandesBean commande, ProduitsBean produit, int quantite, Double prix) {
		super();
		this.commande = commande;
		this.produit = produit;
		this.quantite = quantite;
		this.prix = prix;
	}

	public DetailsCommandeBean(int idDetailsCommande, CommandesBean commande, ProduitsBean produit, int quantite,
			Double prix) {
		super();
		this.idDetailsCommande = idDetailsCommande;
		this.commande = commande;
		this.produit = produit;
		this.quantite = quantite;
		this.prix = prix;
	}



	public int getIdDetailsCommande() {
		return idDetailsCommande;
	}
	public void setIdDetailsCommande(int idDetailsCommande) {
		this.idDetailsCommande = idDetailsCommande;
	}
	public CommandesBean getCommande() {
		return commande;
	}
	public void setCommande(CommandesBean commande) {
		this.commande = commande;
	}
	public ProduitsBean getProduit() {
		return produit;
	}
	public void setProduit(ProduitsBean produit) {
		this.produit = produit;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}

	
}
