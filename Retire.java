/**
A class Personal contains employee details and another class Retire calculates the employee’s
Provident Fund and Gratuity. The details of the two classes are given below:
Class name : Personal
Data Members:
Name : stores the employee name
Pan : stores the employee PAN number
basic_pay : stores the employee basic salary (in decimals)
acc_no : stores the employee bank account number
Member functions:
Personal( …. ) : parameterized constructor to assign value to data members
void display( ) : to display the employee details
Class name : Retire
Data Members:
Yrs : stores the employee years of service
Pf : stores the employee provident fund amount ( in decimals )
Grat : stores the employee gratuity amount ( in decimals )
Member functions:
Retire (….) : parameterized constructor to assign value to data members of both the classes.
void provident( ) : calculates the PF as (2% of the basic pay) * years
of service.
void gratuity( ) : calculates the gratuity as 12 months salary, if the years of service is more or equal to 10 years
else the gratuity amount is nil.
void display1( ) : Displays the employee details along with the PF (Provident Fund ) and gratuity amount.
Specify the class Personal giving details of the constructor and member functions void display( ). Using the
concept of inheritance, specify the class Retire giving details of constructor, and the member functions void
provident( ), void gratuity( ) and the void display1( ). The main function need not be written.
*/

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
 
