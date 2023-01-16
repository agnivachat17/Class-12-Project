import java.util.*;
class FiboPrime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int j=0, fibb=0;
        for(int i=4; ;i++)
        {
            if(isPrime(Fibo(i),2))
            {
                j++;
                if(j==n)
                {
                    fibb=Fibo(i);
                    break;
                }
            }
        }
        System.out.println("nth Fibonacci Prime number: "+fibb);
    }
    public static int Fibo(int x)
    {
        if(x==1)
        return 0;
        else if(x==2)
        return 1;
        else 
        return Fibo(x-1)+Fibo(x-2);
    }
    public static boolean isPrime(int y, int z)
    {
        if(z==y)
        return true;
        else if(y%z==0)
        return false;
        else 
        return isPrime(y,z+1);
    }
}