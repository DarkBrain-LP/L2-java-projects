class Livre{
    private String titre;
    private String auteur;
    private double prix;

    public Livre(String unTitre, String auteur, double lePrix){
        titre = unTitre;
        this.auteur = auteur;
        this.prix = lePrix;
    }

    // Setters
    // Getters

    public static void main(String[] args){
        Livre monLivre = new Livre("Enfant noir", "Camara Laye", 1500);

        System.out.println("Affichage du titre");
        System.out.println(monLivre.getTitre());

        System.out.println("Affichage de l'auteur");
        System.out.println(monLivre.getAuteur());

        System.out.println("Affichage du prix");
        System.out.println(monLivre.getPrix());

        System.out.println("Modification du prix");
        monLivre.setPrix(1500);
        
        System.out.println("Affichage du nouveau prix");
        System.out.println(monLivre.getPrix());
    }
}