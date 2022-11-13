package EnClasse;

class Compte{
    private double solde;

    public Compte() {
    }

    public Compte(double solde) {
        this.solde = solde;
    }
    public Compte(Compte unCompte){
        this.solde = unCompte.solde;
    }
    
    public void afficher(){
        System.out.println("Le solde est " + ((this.solde >= 2)?"crediteur de "+solde+" FCFA":"debiteur de "+(-solde)+" FCFA"));
    }
    
    public void deposer(double montant){
        this.solde += montant;
        System.out.println("Le solde vient d'etre debiter de "+montant);
    }
    
    public void retirer(double montant){
        this.solde -= montant;
        System.out.println("Le solde vient d'etre crediter de "+montant);
    }
    
    public void virerVerser(double montant, Compte unCompte){
        this.retirer(montant);
        unCompte.deposer(montant);
    }
    
    
    public static void main(String[] args){
        Compte vide = new Compte();
        Compte initialise = new Compte(15000);
        
        vide.deposer(5000);
        initialise.deposer(15000);
        initialise.retirer(20000);
        initialise.virerVerser(25000, vide);
        
        vide.afficher();
        initialise.afficher();
        
        
        Compte[] tabComptes = new Compte[10];
        
        for(int i = 1; i <= tabComptes.length; i++){
            tabComptes[i].deposer(15000 + i*1000);
        }
        
        for(int i = 1; i < tabComptes.length; i++){
            for(int j = i + 1; j <= tabComptes.length; j ++)
                tabComptes[i].virerVerser(1700, tabComptes[j]);
        }
    }
}