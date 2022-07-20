package modele;

public class SousCategoriesBean {
	
	private int idSousCategorie;
	private String titreSousCategorie;
	private CategoriesBean categorie;
	
	public SousCategoriesBean() {
		
	}

	public SousCategoriesBean(int idSousCategorie, String titreSousCategorie, CategoriesBean categorie) {
		this.idSousCategorie = idSousCategorie;
		this.titreSousCategorie = titreSousCategorie;
		this.categorie = categorie;
	}

	public SousCategoriesBean(int idSousCategorie, String titreSousCategorie) {
		this.idSousCategorie = idSousCategorie;
		this.titreSousCategorie = titreSousCategorie;
	}

	public int getIdSousCategorie() {
		return idSousCategorie;
	}
	public void setIdSousCategorie(int idSousCategorie) {
		this.idSousCategorie = idSousCategorie;
	}
	public String getTitreSousCategorie() {
		return titreSousCategorie;
	}
	public void setTitreSousCategorie(String titreSousCategorie) {
		this.titreSousCategorie = titreSousCategorie;
	}
	public CategoriesBean getCategorie() {
		return categorie;
	}
	public void setCategorie(CategoriesBean categorie) {
		this.categorie = categorie;
	}
	
	
			
}
