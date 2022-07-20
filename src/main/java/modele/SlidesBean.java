package modele;

import java.sql.Date;

public class SlidesBean {
	
	private int idSlide;
	private String titre;
	private String image;
	private String url;
	
	public SlidesBean() {
		
	}

	public SlidesBean(int idSlide, String titre, String image, String url) {
		this.idSlide = idSlide;
		this.titre = titre;
		this.image = image;
		this.url = url;
	}

	public int getIdSlide() {
		return idSlide;
	}
	public void setIdSlide(int idSlide) {
		this.idSlide = idSlide;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	

}
