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