import java.util.*;
class CaesarCipher
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a text: ");
        String str=sc.nextLine();
        int L=str.length();
        if(L<=3||L>=100)
        {
            System.out.println("INVALID LENGTH");
            return;
        }
        String s="";
        for(int i=0;i<L;i++)
        {
            char c=str.charAt(i);
            if((c>=65&&c<=77)||(c>=97&&c<=109))
            c=(char)(c+13);
            else if((c>=78&&c<=90)||(c>=110&&c<=122))
            c=(char)(c-13);
            s+=c;
        }
        System.out.println("The cipher text is: \n"+s);
    }
}