class EquationSecondDegre {
    private int a;
    private int b;
    private int c;
    private float r1;
    private float r2;
    private float delta;
    
    public EquationSecondDegre(int x1, int x2, int x3) 
    {
       a = x1;
       b = x2;
       c = x3;
       delta = (b * b) - (4 * a * c);
    }
    
    public String afficheDiscriminant()
    {
        String resultat1;
        resultat1 = " Le discriminant est : " + delta;
        return resultat1;
    }
    
    public void resoudre()
    {
        if (delta > 0)
        {
            r1 = (float) (( -b - Math.sqrt(delta)) / (2 * a));
            r1 = (float) (( -b + Math.sqrt(delta)) / (2 * a));
        }
        else
            r1 = r2 = b / (2 * a);
    }
    
    public String afficheSolutions()
    {
        String resultat3 = null;
        if (a == 0)
            System.out.println("L'équation n'est pas du 2nd degré");
        else 
        {
            if (delta <0)
                resultat3 = "Slutions imaginaires";
            if (delta > 0)
                resultat3 = " Solution 1 : " + r1 + " Solution 2 : " + r2 ;
            if (delta == 0) 
                resultat3 = " Solution 1 : " + r1 + " Solution 2 : " + r1 ;
        }
        return resultat3;
    }
    
}
