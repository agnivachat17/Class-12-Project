import java.util.*;
class Decoder
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the encoded message: ");
        String str=sc.nextLine();
        if(str.length()>=100)
        {
            System.out.println("INVALID SENTENCE");
            System.exit(0);
        }
        System.out.print("Enter the value of the shift: ");
        int n=sc.nextInt();
        if(n<1||n>26)
        {
            System.out.println("INVALID SHIFT VALUE");
            System.exit(0);
        }
        str=str.toUpperCase();
        str=str.trim();
        String w="";
        int j=6;
        char c;
        for(int i=0;i<str.length();i++)
        {
            if(i==j)
            {
                j+=7;
                continue;
            }
            c=convert(str.charAt(i),n);
            w+=c;
        }
        w=w.replace("QQ"," ");
        System.out.println("Decoded message: \n"+w);
    }
    public static char convert(char x, int y)
    {
        if(x+y>'Z')
        x=(char)('A'+(x+(y-1)-'Z'));
        else
        x=(char)(x+y);
        return x;
    }
}