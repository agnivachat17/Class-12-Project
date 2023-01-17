/*
A Composite Magic number is a positive integer which is composite as well as a magic number.
Composite number : A composite number is a number which has more than 2 factors. For example : 10 Factors
are : 1,2,5,10. Magic number : A magic number is a number in which the eventual sum of the digits is equal to
1. For example:- 28 = 2+ 8 =10 = 1+0=1 Accept 2 positive integers m and n, where m is less than n as user input.
Display the number of composite magic integers that are in the range between m and n (both inclusive) and
output them along with the frequency, in the format specified below. Test your program with the sample data
and some random data:
Example 1:
INPUT:
m=10
n=100
OUTPUT:
THE COMPOSITE MAGIC INTEGERS ARE : 10,28,46,55,64,82,91,100
FREQUENCY OF COMPOSITE MAGIC INTEGERS IS :8
*/
import java.util.*;
public class CompositeMagic
{
    public static boolean isComposite(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
            if(n%i==0)
                c++;
        return (c>2);
    }
    /** public static boolean isMagic(int n)
    {
        if(n==1)
            return true;
        if(n<9)
            return false;
        int s=0;
        while(n>0)
        {
            s+=(n%10);
            n/=10;
        }
        return isMagic(s);
    }  */
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower limit");
        int x=sc.nextInt();
        System.out.println("Enter the upper limit");
        int y=sc.nextInt();
        System.out.println("All COMPOSITE MAGIC NUMBERS are:");
        int c=0;
        for(int i=x;i<=y;i++) 
          // if((isComposite(i)==true)&&(isMagic(i)==true))
           if((isComposite(i)==true)&&(i%9==1))

           {
               System.out.print(i+", ");
               c++;
           }
        System.out.println("\n FREQUENCY OF COMPOSITE MAGIC INTEGERS IS:" +c);       
    }
}
