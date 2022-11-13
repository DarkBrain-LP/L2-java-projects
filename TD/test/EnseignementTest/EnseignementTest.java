/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnseignementTest;
import Etablissement.*;
import java.util.ArrayList;

/**
 *
 * @author M@nU_LP
 */
public class EnseignementTest {
    public static void main(String[] arggs){
        ArrayList<Personne> ar = new ArrayList();
        
        Etudiant et = new Etudiant("YOVO", "Yawo Emmanuel", "Kagomé", "Lomé", "Ingénieur des Travaux informatiques");
        ar.add(et);
        Etudiant et2 =  new Etudiant("FIOKLOU", "Donia", " ", "Lomé", "Ingénieur des Travaux informatiques");
        Enseignant prof = new Enseignant("BATAZI", "???", "...", "Lomé", "Programmation Orientée Objet");
        ar.add(prof);
        Secretaire sec = new Secretaire("AMOUZOU", "Afi MHD", "Agoè", "Lomé", "B007");
        ar.add(sec);
        
        
        Personne.nbPersonne();
            
        for(Personne p : ar){
            p.ecrirePersonne();
        }
            
        
        
    }
}
