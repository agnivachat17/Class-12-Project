import java.util.*;
public class Encrypt
{
    public static void main(String srgs[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Ciphertext:");
        String ct=sc.nextLine();
        ct=ct.toUpperCase();
        System.out.println("Enter the encryption key:");
        String ek=sc.nextLine();
        ek=ek.toUpperCase();
        ct=ct.trim();
        ek=ek.trim();
        String st="";
        int c=0,g=0,k=0;
        char ch=' ';
        for(int i=0;i<ct.length();i++)
        {
            ch=ct.charAt(i);
            if(Character.isLetter(ch)==true)
            {
                g=(int)ch+(int)((ek.charAt(c))-64);
                ch=(g>90)?(char)((g-90)+64):(char)g;
                c++;
                c=(c>3)?0:c;            
            }
            st=st+ch;
        }
        System.out.println("Plaintext: "+st);
    }
}