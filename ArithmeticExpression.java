import java.util.*;
public class ArithmeticExpression
{
    public static String extract(String n,int c)
    {
        n=n.trim();
        n=n+" ";
        String temp="";
        int c1=0;
        for(int i=0;i<n.length();i++)
        {
            char ch=n.charAt(i);
            if(ch!=' ')
                temp=temp+ch;
            else
            {
                c1++;
                if(c==c1)
                    return temp;
                temp="";
            }
        }
        return "WRONG INPUT";
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String nw[]={"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        String op[]={"PLUS", "MINUS", "TIMES", "DIVIDED-BY"};
        int nd[]={0,1,2,3,4,5,6,7,8,9};
        System.out.println("Enter an arithmetic expression written in English");
        String ae=sc.nextLine();
        ae=ae.toUpperCase();
        ae=ae.trim();
        int a=0,b=0;
        boolean flag=false;          
        for(int i=0;i<=9;i++)
        {
            if((extract(ae,1).equals(nw[i]))==true)
            {
                a=nd[i];
                flag=true;
            }               
            if((extract(ae,3).equals(nw[i]))==true)
            {
                b=nd[i];
                flag=true;
            }               
        }
        if(flag==false)
        {
            System.out.println("WRONG INPUT");
            return;
        }            
        if(extract(ae,2).equals("PLUS"))        
            System.out.println(a+b);
        else if(extract(ae,2).equals("MINUS"))        
            System.out.println(a-b);
        else if(extract(ae,2).equals("TIMES"))        
            System.out.println(a*b);
        else if(extract(ae,2).equals("DIVIDED-BY"))
        {
            if(b==0)
            {
                System.out.println("Division by zero is not possible");
                return;
            }
            else
                System.out.println(a/b);
        }
        else
            System.out.println("WRONG INPUT");
    }
}