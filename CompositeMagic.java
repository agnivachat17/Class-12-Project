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