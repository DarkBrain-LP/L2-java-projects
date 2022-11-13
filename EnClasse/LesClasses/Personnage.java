class Personnage {
    //Declaration de l'en-tête

	//Declaration des attributs
	private String nom;
	private double force;
	private int localisation;
	private double experience;
	private double degat = 0;
	
	//Declaration des méthodes 
	
	//Constructeur par defaut
	
	public Personnage (){}
	
	//Constructeur parametré
	
	public Personnage (String nom, double force, int alocalisation, double experience){
		this.nom = nom;
		this.force = force;
		this.localisation = localisation;
		this.experience = experience ;	
		
	}
	
	//Constructeur par recopie
	public Personnage (Personnage p){
		this.nom = p.nom;
		this.force = p.force;
		this.localisation = p.localisation;
		this.experience = 1 ;
		this.degat = 0;		
		
	}
	
	
	
	//Les get
	public String getNom(){
		return nom;		
	}
	
	public double getForce(){
		return force;
	}
	
	public int getLocalisation(){
		return localisation;
	}
	
	public double getExperience(){
		return experience;
	}
	
	public double getDegat(){
		return degat;
	}
	
	//Les Set
	public void setNom(String nom){
		this.nom = nom;
	}
	
	public void setForce(double laforce){
		force = laforce;
	}
	
	public void setLocalisation(int lalocalisation){
		localisation = lalocalisation;
	}
	
	public void setExperience(double lexperience){
		experience = lexperience;
	}
	
	public void setDegat(double degat){
		this.degat = degat;
	}
	
	//Methode afficher
	public String afficher(){
		String resultat;
		resultat = "Le nom est : "+ this.nom + " La force "+ force + " La localisation " + localisation + " L'experience "+ experience+ " Le degat "+ degat ;
		return resultat;
	}
	
	//Methode frapper
	public void frapper(Personnage lepersonnage){
		
		double degatinflige=this.force/10;
 		
		lepersonnage.degat=lepersonnage.degat+degatinflige;
		
		this.experience = this.experience + (lepersonnage.experience/2);
		
	}
	
	
	//Methode principal
	public static void  main(String[] args){
		
		//System.out.println("Voici notre  classe en Java");
		
		Personnage p1 = new Personnage();
		//Personnage (String lenom, double laforce, int lalocalisation, double lexperience)
		Personnage p2 = new Personnage("Augustin", 12, 9, 20);
		System.out.println("Affichage de p1");
		System.out.println(p1.getNom());
		
		p1.setNom("Manu");
		p1.setForce(100);
		p1.setLocalisation(20);
		p1.setExperience(300);
		
		System.out.println("Affichage de p1 apres modification");
		System.out.println(p1.getNom());
		System.out.println(p1.afficher());
		
		System.out.println("Affichage de p2");
		System.out.println(p2.getNom());
		System.out.println(p2.afficher());
		
		
		//p2.frapper(p1)
		p2.frapper(p1);
		
		System.out.println("Affichage objet p1 apres etre frappe par p2");
		System.out.println(p1.afficher());
		
		System.out.println("Affichage objet p2 apres avoir frappe par p1");
		System.out.println(p2.afficher());		
		
		//Creation d'un objet avec le constructeur par recopie
		Personnage p3 = new Personnage(p2);
		System.out.println("Affichage objet p3 ");
		System.out.println(p3.afficher());		
		
		
	}
}
