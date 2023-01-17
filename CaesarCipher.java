/*
Caesar Cipher is an encryption technique which is implemented as ROT13 (‘rotate by 13
places’). It is a simple letter substitution cipher that replaces a letter with the letter 13 places after it in the
alphabets, with the other characters remaining unchanged.
Write a program to accept a plain text of length L, where L must be greater than 3 and less than 100.
Encrypt the text if valid as per the Caesar Cipher.
Test your program with the sample data and some random data:
Example 1
INPUT : Hello! How are you?
OUTPUT :
The cipher text is:
Uryyb? Ubj ner lbh?
*/
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
