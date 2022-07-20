package modele;

public class ProduitsBean {

	private int idProduit;
	private String titre;
	private String description;
	private Double prix;
	private String image;
	private SousCategoriesBean sousCategorie;
	private int stock;
	private int stockMinimum;

	public ProduitsBean() {

	}

	public ProduitsBean(int idProduit) {
		this.idProduit = idProduit;
	}

	public ProduitsBean(int idProduit, String titre, Double prix, String image) {
		this.idProduit = idProduit;
		this.titre = titre;
		this.prix = prix;
		this.image = image;
	}

	public ProduitsBean(int idProduit, String titre, String description, Double prix, String image, SousCategoriesBean sousCategorie, int stock, int stockMinimum) {
		this.idProduit = idProduit;
		this.titre = titre;
		this.description = description;
		this.prix = prix;
		this.image = image;
		this.sousCategorie = sousCategorie;
		this.stock = stock;
		this.stockMinimum = stockMinimum;
	}

	public ProduitsBean(String titre, double prix, String image, String description, int stock, int stockMinimum) {
		this.titre = titre;
		this.description = description;
		this.prix = prix;
		this.image = image;
		this.stock = stock;
		this.stockMinimum = stockMinimum;
	}

	public int getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public SousCategoriesBean getSousCategorie() {
		return sousCategorie;
	}
	public void setSousCategorie(SousCategoriesBean sousCategorie) {
		this.sousCategorie = sousCategorie;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getStockMinimum() {
		return stockMinimum;
	}
	public void setStockMinimum(int stockMinimum) {
		this.stockMinimum = stockMinimum;
	}



}