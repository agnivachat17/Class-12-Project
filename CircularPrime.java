/*
A Circular Prime is a prime number that remains prime under cyclic shifts of its digits. When
the leftmost digit is removed and replaced at the end of the remaining string of digits, the generated number is
still prime. The process is repeated until the original number is reached again. A number is said to be prime if
it has only two factors I and itself.
Example: 131 311 113 Hence, 131 is a circular prime.
Test your program with the sample data and some random data:
Example 1
INPUT :
N = 197
OUTPUT:
197
971
719
197 IS A CIRCULAR PRIME
*/
import java.util.*;
public class CircularPrime
{
    public static int countDigits(int n)
    {
        int c=0, m=n;
        while(m>0)
        {
            c++;
            m=m/10;
        } 
        return c;
    }
    public static boolean isPrime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
            if(n%i==0)
                c++;
        return (c==2);
    }
    public static int getNext(int n)
    {
        int c= countDigits(n);
        int a=n/(int)(Math.pow(10,(c-1)));
        return (((n%(int)(Math.pow(10,(c-1))))*10)+a);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int m=sc.nextInt();
        int n=m; 
        boolean flag= true;
        System.out.println();
        for(int i=0; i<countDigits(n); i++)
        {
            System.out.println(n);
            if(isPrime(n)==false)
            {   System.out.println(n+" is not a prime number");
                System.out.println("Hence "+m+" is not Circular Prime");
                flag=false;
                break;
            }
            else
            {
                n=getNext(n);
            }
        }
        if(flag==true)
            System.out.println(m+" is a Circular Prime number");
    }
}
