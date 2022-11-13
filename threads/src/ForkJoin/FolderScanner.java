/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForkJoin;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class FolderScanner extends RecursiveTask<Long>{
    private Path path = null;
    private String filter = "*";
    private long result = 0;
    
    public FolderScanner(){}
    public FolderScanner(Path path, String filter){
        this.path = path;
        this.filter = filter;
    }
    
    public long sequentialScan() throws ScanException{
        if(this.path == null || path.equals("")){
            throw new ScanException("Impossible de reconnaitre le chemin. Il est"
                    + "peut-etre null ou vide");
        }
        
        System.out.println("Scan du dossier " + this.path + " a la recherche "
                + "des fichier portant l'extension " + this.filter);
        
        try(DirectoryStream<Path> pathList = Files.newDirectoryStream(this.path)){
            for(Path elmt : pathList){
                if(Files.isDirectory(elmt.toAbsolutePath())){
                    FolderScanner fd = new FolderScanner(elmt.toAbsolutePath(), this.filter);
                    this.result += fd.sequentialScan();
                }
            }
        } catch (IOException e) { e.printStackTrace(); }
        
        // Les elements correspondant à la recherche dans le repertoire meme
        try(DirectoryStream<Path> pathList = Files.newDirectoryStream(this.path, this.filter)){
            for(Path elmt : pathList)
                result ++;
            
        } catch(IOException e){ e.printStackTrace();}
        
        return result;
    }
    
    /*
    ** Méthode du traitement en mode parallele
    */
    
    public Long paralleleScan() throws ScanException, IOException{
        // Liste qui contiendra les taches
        List<FolderScanner> taskList = new ArrayList<FolderScanner>();
        
        if(this.path == null || path.equals("")){
            throw new ScanException("Impossible de reconnaitre le chemin. Il est"
                    + "peut-etre null ou vide");
        }
        
        System.out.println("Scan du dossier " + this.path + " a la recherche "
                + "des fichier portant l'extension " + this.filter);
        
        // On parcours le repertoir
        try(DirectoryStream<Path> list = Files.newDirectoryStream(this.path)){
            for(Path elmt : list){
                // Si nous sommes dans un dossiers, on créé une nouvelle tache
                // donc un new FolderScanner
                if(Files.isDirectory(elmt.toAbsolutePath())){
                    FolderScanner fds = new FolderScanner(elmt.toAbsolutePath(), this.filter);
                    // on l'ajoute alors à la liste des taches
                    taskList.add(fds);
                    
                    // Cette instruction lance l'action en tache de fond
                    fds.fork();
                }
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        
         // Les elements correspondant à la recherche dans le repertoire meme
        try(DirectoryStream<Path> pathList = Files.newDirectoryStream(this.path, this.filter)){
            for(Path elmt : pathList)
                result ++;
        } catch(IOException e){ 
            e.printStackTrace();
        }
        
        // On recupere le resultat de toutes les taches de fond
        for(FolderScanner f : taskList)
            this.result += f.join();
        
        return result;
    }
    
    /**
    * Méthode qui défini l'action à faire
    * dans notre cas, nous lan çons le scan en mode parallèles
    */
    protected Long compute(){
        long resultat = 0;
        try{
            resultat = this.paralleleScan();
        } catch(ScanException e){
            e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(FolderScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultat;
    }

    public long getResult() {
        return result;
    }
    
    
}
