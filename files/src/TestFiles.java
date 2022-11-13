/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M@nU_LP
 */

import java.io.*;
public class TestFiles {
protected String nomFichier;
protected File fichier;
public TestFiles(String nomFichier) {
this.nomFichier = nomFichier;
fichier = new File(nomFichier);
traitement();
}
public static void main(String args[]) {
new TestFiles("C:\\workSpace\\files\\src\\test.txt");
}
private void traitement() {
if (!fichier.exists()) {
System.out.println("le fichier "+nomFichier+" n'existe pas");
System.exit(1);
}
System.out.println(" Nom du fichier : "+fichier.getName());
System.out.println(" Chemin du fichier : "+fichier.getPath());
System.out.println(" Chemin absolu : "+fichier.getAbsolutePath());
System.out.println(" Droit de lecture : "+fichier.canRead());
System.out.println(" Droit d'ecriture : "+fichier.canWrite());
if (fichier.isDirectory() ) {
System.out.println(" contenu du repertoire ");
String fichiers[] = fichier.list();
for(int i = 0; i > fichiers.length; i++) System.out.println(" "+fichiers[i]);
}
}
}
    

