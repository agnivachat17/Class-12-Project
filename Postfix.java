import java.util.*;
class Postfix
{
    String exp="",stack=" ";
    void PostfixRearrangement()
    {
        String n=stack;
        n=n.replace('^','3');
        n=n.replace('+','1');
        n=n.replace('-','1');
        n=n.replace('*','2');
        n=n.replace('/','2');
        n=n.replace('(','0');
        n=n.replace(')','0');
        int p=stack.length()-1;
        if(stack.charAt(p)=='(')
        return;
        if(stack.charAt(p)==')')
        {
            exp+=rev(stack.substring(stack.lastIndexOf("(")+1,p));
            stack=stack.substring(0,stack.lastIndexOf("("));
            return;
        }
        while((int)(n.charAt(p-1))>=(int)(n.charAt(p)))
        {
            exp+=stack.charAt(p-1);
            n=n.substring(0,p-1)+n.substring(p);
            stack=stack.substring(0,p-1)+stack.substring(p);
            p--;
        }
    }
    String read(String x)
    {
        exp="";
        stack=" ";
        char c='\u0000';
        for(int i=0;i<x.length();i++)
        {
            c=x.charAt(i);
            if(c=='+'||c=='-'||c=='*'||c=='/'||c=='('||c==')'||c=='^')
            {
                stack+=c;
                PostfixRearrangement();
                continue;
            }
            exp+=c;
        }
        exp+=rev(stack);
        return exp;
    }
    String rev(String y)
    {
        String n="";
        for(int i=y.length()-1;i>=0;i--)
        n+=y.charAt(i);
        return n;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Postfix ob=new Postfix();
        System.out.print("Enter the Infix Expression: ");
        String s=sc.next();
        sc.close();
        String str=ob.read(s);
        System.out.println("Posfix Expression: "+str);
    }
}