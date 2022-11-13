public class Batiment {
    	private String adresse;
	private int nbpiece;
	private String proprietaire;

	public Batiment(){}
	public Batiment(String adresse, int nbpiece, String proprietaire){
		this.adresse=adresse;
		this.nbpiece=nbpiece;
		this.proprietaire=proprietaire;
	}

	public String getAdresse(){
		return adresse;
	}
	public int getNbpiece(){
		return nbpiece;
	}
	public String getProprietaire(){
		return proprietaire;
	}

	public void setAdresse(String uneadresse){
		adresse=uneadresse;
	}
	public void setNbpiece(int lenbpiece){
		nbpiece=lenbpiece;
	}
	public void setProprietaire(String leproprietaire){
		proprietaire=leproprietaire;
	}

	public String afficher(){
		return "Le batiment de M."+ proprietaire +"situé à "+ adresse +
		"compte en tout "+ nbpiece +"pieces";
	}
    
}
