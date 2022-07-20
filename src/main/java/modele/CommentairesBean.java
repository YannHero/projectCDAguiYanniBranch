package modele;

public class CommentairesBean {
	
	private int idCommentaire;
	private String commentaire;
	private int note;
	private ProduitsBean produit;
	private UtilisateursBean utilisateur;
	
	public CommentairesBean() {
	
	}
		
	public CommentairesBean(String commentaire, int note, ProduitsBean produit, UtilisateursBean utilisateur) {
		super();
		this.commentaire = commentaire;
		this.note = note;
		this.produit = produit;
		this.utilisateur = utilisateur;
	}

	public CommentairesBean(int idCommentaire, String commentaire, int note, ProduitsBean produit,
			UtilisateursBean utilisateur) {
		super();
		this.idCommentaire = idCommentaire;
		this.commentaire = commentaire;
		this.note = note;
		this.produit = produit;
		this.utilisateur = utilisateur;
	}



	public int getIdCommentaire() {
		return idCommentaire;
	}
	public void setIdCommentaire(int idCommentaire) {
		this.idCommentaire = idCommentaire;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
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
