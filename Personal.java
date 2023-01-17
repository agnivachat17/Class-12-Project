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

//SuperClass
import java.util.*;
class Personal
{
    String name;
    long pan;
    double basic_pay;
    long acc_no;
    Personal(String na, long pa, double ba,long ac)
    {
        name=na;
        pan=pa;
        basic_pay=ba;
        acc_no=ac;
    }
    void display1()
    {
        System.out.println("Name:"+name);
        System.out.println("Pan.No:"+pan);
        System.out.println("Basic Salary:"+basic_pay);
        System.out.println("Account number:"+acc_no);
    }
}
