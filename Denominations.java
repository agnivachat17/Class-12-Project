import java.util.*;
class Denominations
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an amount(upto 5 digits): ");
        int n=sc.nextInt();
        while((n<0)||(countDigits(n)>5))
        {
            System.out.print("INVALID INPUT. Enter an amount(upto 5 digits): ");
            n=sc.nextInt();
        }
        int arr[]={1000,500,100,50,20,10,5,2,1};
        int a=n, b=n, c=0, sum=0;
        String str="";
        while(b!=0)
        {
            c=b%10;
            switch(c)
            {
                case 1: str="ONE "+str; break;
                case 2: str="TWO "+str; break;
                case 3: str="THREE "+str; break;
                case 4: str="FOUR "+str; break;
                case 5: str="FIVE "+str; break;
                case 6: str="SIX "+str; break;
                case 7: str="SEVEN "+str; break;
                case 8: str="EIGHT "+str; break;
                case 9: str="NINE "+str; break;
                case 0: str="ZERO "+str; 
            }
            b/=10;
        }
        System.out.println(str);
        if(n!=0)
        {
            System.out.println("DENOMINATIONS: ");
            for(int i=0;i<9;i++)
            {
                c=a/arr[i];
                a%=arr[i];
                sum+=c;
                if(c>0)
                System.out.println(arr[i]+" x "+c+" = "+(arr[i]*c));
            }
        }
        System.out.println("TOTAL: "+n);
        System.out.println("TOTAL NUMBER OF NOTES: "+sum);
    }
    public static int countDigits(int x)
    {
        int c=0;
        while(x!=0)
        {
            x/=10;
            c++;
        }
        return c;
    }
}