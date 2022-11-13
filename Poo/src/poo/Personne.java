/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author LENOVO
 */
public class Personne {
    private String nom;
    private int age;
    private double[] comptes;

    /* Constructeurs */
    
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public Personne(String nom, int age, double[] comptes) {
        this.nom = nom;
        this.age = age;
        this.comptes = new double[comptes.length];
        
        for(int i = 0; i < comptes.length; i++)
            this.comptes[i] = comptes[i]; 
        
        System.out.println("Une personne vient d'etre créée");
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
    public String afficher2(){
        String ret = "Mon nom est " + nom + " et mon age est " + age;
        for(int i = 0; i < comptes.length; i++){
            ret += "\nMon solde " + (i+1) + " est : " + comptes[i];
        }
        return ret;
    }
    public void diviserParDeux(){
        for(int i = 0; i < comptes.length; i++)
            comptes[i] /= 2;
    }
    
     public static void main(String[]args){
         double[] solde = new double[4];
         double[] s = new double[4];
         s[0] = 125000000;
         s[1] = 200000000;
         s[2] = 400000000;
         s[3] = 250000000;
         Personne moi = new Personne("M@nU_LP", 18, s);
         Personne elle = new Personne("LENOVO", 19, s);
         System.out.println("YOYOYO MLP sur le ring");
         System.out.println(moi.afficher2());
         System.out.println(elle.afficher2());
         moi.diviserParDeux();
         System.out.println(moi.afficher2());
         System.out.println(elle.afficher2());
     }
}
