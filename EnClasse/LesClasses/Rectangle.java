class Rectangle
{
	private double longueur;
	private double largeur;

	public Rectangle(){}

	public Rectangle(double uneLongueur, double uneLargeur)
	{
		longueur=uneLongueur;
		largeur=uneLargeur;
	}

	public double getLongueur()
	{
		return longueur;
	}

	public double getLargeur()
	{
		return largeur;
	}

	public void setLongueur(double uneLongueur)
	{
		longueur=uneLongueur;
	}

	public void setLargeur(double uneLargeur)
	{
		largeur=uneLargeur;
	}


	private double DemiPerimetre()
	{
		return longueur+largeur;
	}

	private double Perimetre()
	{
		return (longueur+largeur)*2;
	}

	private double Aire()
	{
		return longueur*largeur;
	}

	public static void main(String[] args) 
	{
	   /*System.out.println("Hello world");	
	   System.out.print("Hello world");*/
	   Rectangle rectangle1= new Rectangle(15,23);
	    System.out.println("AFFICHAGE 1");	
	    System.out.println(rectangle1.getLongueur()	);
	    System.out.println(rectangle1.Perimetre()	);

	     Rectangle rectangle2= new Rectangle();
	     System.out.println("affichage du rectangle 2");	
	     System.out.println(rectangle2.getLargeur()	);

	     rectangle2.setLargeur(14);
	     System.out.println("affichage du rectangle 2 apres modification");	
	     System.out.println(rectangle2.getLargeur()	);

	}
}