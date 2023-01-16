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