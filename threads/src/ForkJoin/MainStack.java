/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForkJoin;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ForkJoinPool;

/**
 *
 * @author LENOVO
 */
public class MainStack {
    public static void main(String[] args){
        Path path = Paths.get("D:\\info");
        String filter = "*.py";
        
        FolderScanner fds = new FolderScanner(path, filter);
        // Récupération du nombre de processeurs
        int processor = Runtime.getRuntime().availableProcessors();
        // Création du pool de threads pour les fonds de tâche
        ForkJoinPool pool = new ForkJoinPool(processor);
        
        long beginningTime = System.currentTimeMillis();
        pool.invoke(fds);
        long endingTime = System.currentTimeMillis();
            
        System.out.println("Il y a " + fds.getResult() + " fichiers python dans le "
                + "dossier " + path);
        System.out.println("La recherche de ces fichiers a duré " + 
                (endingTime - beginningTime) + " millisecondes");
        
    }
}
