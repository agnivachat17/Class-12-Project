import java.util.*;
class Prefix
{
    String exp="",stack=" ";
    void PrefixRearrangement()
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
        while((int)(n.charAt(p-1))>(int)(n.charAt(p)))
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
                PrefixRearrangement();
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
        Prefix ob=new Prefix();
        System.out.print("Enter the Infix expression: ");
        String s=sc.next();
        sc.close();
        s=ob.rev(s);
        s=s.replace('(','0');
        s=s.replace(')','(');
        s=s.replace('0',')');
        String str=ob.read(s);
        str=ob.rev(str);
        System.out.println("Prefix Expression: "+str);
    }
}