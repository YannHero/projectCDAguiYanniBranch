package modele;

public class ImagesBean {
	
	private int idImage;
	private ProduitsBean produit;
	private String url;
	
	public ImagesBean() {
	
	}


	public ImagesBean(int idImage, ProduitsBean produit, String url) {
		this.idImage = idImage;
		this.produit = produit;
		this.url = url;
	}

	public int getIdImage() {
		return idImage;
	}
	public void setIdImage(int idImage) {
		this.idImage = idImage;
	}
	public ProduitsBean getProduit() {
		return produit;
	}
	public void setProduit(ProduitsBean produit) {
		this.produit = produit;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
				
}
