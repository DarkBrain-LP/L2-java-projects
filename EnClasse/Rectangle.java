class Rectangle
{
    // Attributs
    private double longueur, largeur;

    /* Constructeur */
    public Rectangle(){};

    public Rectangle(double une_longueur, double une_largeur)
    {
        longueur = une_longueur;
        largeur = une_largeur;
    }

    public Rectangle(Rectangle une_rectangle)
    {
        longueur = une_rectangle.longueur;
        largeur = une_rectangle.largeur;
    }

    /* Getters */
    public double getLongueur()
    {
        return longueur;
    }

    public double getLargeur()
    {
        return largeur;
    }

    /* Setters */
    public void setLongueur(double une_longueur)
    {
        longueur = une_longueur;
    }

    public void setLargeur(double une_largeur)
    {
        largeur = une_largeur;
    }

    /* Autres méthodes */
    public double perimetre()
    {
        return (longueur + largeur) * 2;
    }

    public double demiPerimetre()
    {
        return longueur + largeur;
    }

    public double aire()
    {
        return longueur * largeur;
    }
    
 public static void main(String[] args)
    {
       // System.out.print("Hello World :) !!!");
        Rectangle rectangle1=new Rectangle(16,13);
         System.out.println("Affichage du rectangle1");
        System.out.println(rectangle1.getLongueur());
        System.out.println("Affichage du demi_perimetre");
         System.out.println(rectangle1.demiPerimetre());

         Rectangle rectangle2=new Rectangle();
         System.out.println("Affichage du rectangle 2");
        System.out.println(rectangle2.getLongueur());
 rectangle2.setLargeur(8);
 System.out.println("Affichage du rectangle 2 apres modification");
        System.out.println(rectangle2.getLargeur());

    }

}