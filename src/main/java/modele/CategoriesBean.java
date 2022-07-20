package modele;

public class CategoriesBean {
	
	private int idCategorie;
	private String titreCategorie;
	
	public CategoriesBean() {
	
	}

	public CategoriesBean(int idCategorie, String titreCategorie) {
		this.idCategorie = idCategorie;
		this.titreCategorie = titreCategorie;
	}
	
	public CategoriesBean(String titreCategorie) {
		this.titreCategorie = titreCategorie;
	}

	
	
	public int getIdCategorie() {
		return idCategorie;
	}
	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}
	public String getTitreCategorie() {
		return titreCategorie;
	}
	public void setTitreCategorie(String titreCategorie) {
		this.titreCategorie = titreCategorie;
	}
	
	
}
