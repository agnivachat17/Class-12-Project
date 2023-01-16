import java.util.*;
class Encrypter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence to be encrypted: ");
        String str=sc.nextLine();
        str=str.trim()+" ";
        str=str.toUpperCase();
        System.out.println("Enter the value of shift: ");
        int n=sc.nextInt();
        if(n<1||n>26)
        {
            System.out.println("INVALID SHIFT VALUE");
            System.exit(0);
        }
        str=str.replace(" ","QQ");
        String w="";
        int j=6;
        char c;
        for(int i=0;i<str.length();i++)
        {
            if(i==j)
            {
                j+=6;
                w+=" ";
            }
            c=convert(str.charAt(i),n);
            w+=c;
        }
        System.out.println("Encrypted message: \n"+w);
    }
    public static char convert(char x, int y)
    {
        if(x-y<'A')
        x=(char)('Z'-(y-1-(x-'A')));
        else
        x=(char)(x-y);
        return x;
    }
}