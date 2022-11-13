class Livre{
    private String titre;
    private String auteur;
    private double prix;
    public Livre(String unTitre,String auteur,double lePrix){
        this.titre = unTitre;
        this.auteur = auteur;
        this.prix = lePrix;
    }
    //set
    //get
    
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    //set
    public String getAuteur() {
        return auteur;

        
    }

    public String getTitre() {
        return titre;
    }

    public double getPrix() {
        return prix;
    }
    public static void main(String[] args) {
        Livre monLivre = new Livre("Enfant noir","Camara laye",1500);
        System.out.println("Affichage du texte");
        System.out.println(monLivre.getTitre());
        System.out.println(monLivre.getauteur());
        System.out.println(monLivre.getPrix());
        System.out.println("Modification du prix");
        monLivre.setPrix(25000);
        System.out.println("Affichage nouveau prix ");
        System.out.println(monLivre.getPrix());

        
    }
}