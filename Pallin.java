import java.util.*;
class Pallin
{
    public static String getRev(String str)
    {
        String nstr="";
        for (int i=0; i<str.length(); i++)
            nstr= str.charAt(i)+nstr; 
        return nstr;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="";
        int l=0,c=0;
        System.out.println("Enter any sentence terminating by either '.','!' or '?' ");   
        do{
            l++;
            if(l>1)
            {    System.out.println("Sentence should terminate by either '.','!' or '?' ");
                 System.out.println();
                 System.out.println("INPUT AGAIN NOW");
            }
            s=sc.nextLine();
        }while(".,!?".indexOf(s.charAt(s.length()-1))==-1);
        s.trim();
        s=s.replace('.',' ');
        s=s.replace('!',' ');
        s=s.replace('?',' ');
        String a="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                a=a+ch;   
            }
            else
            {
                if(getRev(a).compareTo(a)==0)
                {
                    System.out.print(a+" ");
                    c++;
                }
                a="";
            }
        }
        System.out.println();
        System.out.println("Number of pallindromic words: "+c);
    }
}