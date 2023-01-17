/**
Design a program which accepts your date of birth in dd mm yyyy format. Check whether the date
entered is valid or not. If it is valid, display “VALID DATE”, also compute and display the day number of the
year for the date of birth. If it is invalid, display “INVALID DATE” and then terminate the program.
Test your program for the given sample data and some random data.
Input:
Enter your date of birth in dd mm yyyy format
05
01
2010
Output:
VALID DATE
5
Input:
Enter your date of birth in dd mm yyyy format
03
04
2010
Output:
VALID DATE
93
Input:
Enter your date of birth in dd mm yyyy format
34
06
2010
Output:
INVALID DATE
*/
import java.util.*;
class DayNumber
{
    public static void main(String args[]) throws InputMismatchException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your date of birth in dd mm yyyy format :");
        int d=sc.nextInt();
        int m=sc.nextInt();
        int y=sc.nextInt();
        int dom[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if(y%400==0 || (y%100!=0 && y%4==0))
            dom[1]=29;
        if(d<=dom[m-1])
        {
            System.out.println("VALID DATE ");
            int i,s=0;
            for(i=0;i< m-1;i++)
                s=s+dom[i];
            s+=d;
            System.out.print(s);
        }
        else
            System.out.println("INVALID DATE");        
    }
}    
