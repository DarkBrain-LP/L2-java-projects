/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testHeritagePlusieursNiveaux;

import heritageAPlusieursNiveaux.*;


/**
 *
 * @author LENOVO
 */
public class Application {
    public static void main(String[] args){
        Etudiant et1 = new Etudiant("a001", 1, "YOVO", "Yawo Emmanuel");
        Etudiant et2 = new Etudiant("b002", 2, "AGBEYOME", "Koffivi Hugo");

        Employe e1 = new Employe(400000, 3, "GBODUI", "Roland-Joseph");
        Employe e2 = new Employe(300000, 3, "MODEDZI", "Julien");

        Professeur p1 = new Professeur("POO", 300000, 3, "N'SOUGAN", "Alexandre");
        Professeur p2 = new Professeur("BASES DE DONNEES", 300000, 3, "AZOTI", "Samuel");
        
        System.out.println(et1);
        System.out.println(et2);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(p1);
        System.out.println(p2);

    }
    
}
