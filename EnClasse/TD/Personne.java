class Personne 
{
    private String nom;
    private int age;
    private double[] comptes;

    /* Constructeurs */
    public Personne(String nom, int age, double[] comptes) {
        this.nom = nom;
        this.age = age;
        this.comptes = comptes;
    }

    /* Les Getteurs */
    public String getNom(){
        return nom;
    }
    public int getAge(){
        return age;
    }
    public double[] getComptes() {
        return comptes;
    }

    /* Les setteurs */
    public void setNom(String leNom){
        nom = leNom;
    }
    public void setAge(int lAge){
        age = lAge;
    }

    public void setComptes(double[] comptes) {
        this.comptes = comptes;
    }
    
    /* Les fonctions qui permettrons d'afficher Mon nom est : ... et mon age est : ... */
    public String afficher(){
        return "Mon nom est " + nom + " et mon age est " + age ;
    }
    public void afficher2(){
        System.out.println("Mon nom est " + nom + " et mon age est " + age);
    }


    

    /* La methode main */
    public static void main(String[] args){
        Personne personne1 = new Personne("M@nU_LP", 18, {12, 14});
    }
}