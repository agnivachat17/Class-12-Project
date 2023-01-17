/*
Develop a program that accepts as input two strings, the first of which is ciphertext (i.e., an
encoded message) and the second of which is a key that can be used to decode it, and that produces as output
the plaintext (i.e., the original message).
The key is a string of four uppercase letters. To decode the first letter of ciphertext, &quot;add&quot; it (see explanation
below) to the first letter of the key. Similarly, to decode the second, third, and fourth letters of ciphertext,
&quot;add&quot; them to the second, third, and fourth, respectively, letters of the key. Beginning with the fifth letter of
ciphertext, use the four letters of the key once more, in the same way. (Thus, the first letter of the key is used
for decoding the 1st, 5th, 9th, etc., letters of ciphertext, the second letter of the key is used for decoding the 2nd,
6th, 10th, etc., letters of ciphertext, and similarly for the third and fourth letters of the key.)
To &quot;add&quot; two letters together, add their numeric values together (using A=1, B=2, C=3, ..., Z=26), subtract 26 if
the result is greater than 26, and then find the letter having the corresponding numeric value. For example, E +
C = H (corresponding to 5 + 3 = 8) and E + X = C (corresponding to 5 + 24 - 26 = 3).
Ciphertext given as input will not include lower case letters. It may, however, include spaces and punctuation
marks (e.g., periods, commas, etc.). Upper case letters are to be decoded as described above. Any other
characters are assumed to be their own codes. (E.g., The result of decoding a comma is a comma.)
The program should accept input and provide output in the format shown below, repeating until a null string is
entered for a message.
Sample Program Execution:
Enter Ciphertext: EN UC ENDVCQG!
Enter Key: BALL
Plaintext: GO GO GOPHERS!
*/import java.util.*;
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
