//SubClass
class Retire extends Personal
{
    double basic_pay;
    int yrs;
    double pf;
    double g;
    long a;
    public Retire(String nnn,long p, double b,long a, int y)
    {
        super(nnn,p,b,a);
        basic_pay=b;
        yrs=y;
        pf=0;
        g=0;
    }
    public void provident( )
    {
        pf=((2.0/100.0)*basic_pay*yrs);
    }
    public void gratuity( )
    {
        if(yrs>=10)
            g=basic_pay*12;
        else
            g=0;
    }
    public void display( )
    {
    super.display1();
    provident(); gratuity ();
    System.out.println("PF Amount: "+pf);
    System.out.println("Gratuity: "+g);
    }
}
 