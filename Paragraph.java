import java.util.*;
import java.io.*;
class Paragraph
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of sentence: ");
        int n=sc.nextInt();
        if(n<1||n>=4)
        {
            System.out.println("INVALID ENTRY");
            System.exit(0);
        }
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("Enter the sentences in uppercase: ");
        String str=br.readLine();
        str=str.trim()+" ";
        int a=0, b=0;
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(Character.isLetter(c)&&Character.isLowerCase(c))
            {
                System.out.println("INVALID ENTRY");
                System.exit(0);
            }
            if(c==' ')
            a++;
            if(c=='.'||c=='?')
            b++;
        }
        if(b!=n)
        {
            System.out.println("INVALID ENTRY");
            System.exit(0);
        }
        System.out.println("Number of words in the whole paragraph: "+a);
        String w="";
        String word[]=new String[a];
        b=0;
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c!=' ')
            w+=c;
            else
            {
                c=w.charAt(w.length()-1);
                if(!(Character.isLetter(c)))
                w=w.substring(0,w.length()-1);
                word[b++]=w;
                w="";
            }
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a-i-1;j++)
            {
                if(word[j].compareTo(word[j+1])>0)
                {
                    w=word[j];
                    word[j]=word[j+1];
                    word[j+1]=w;
                }
            }
        }

        int freq[]=new int[a];
        String word2[]=new String[a];
        b=0;
        a=0;
        int max=0;
        for(int i=0;i<a; )
        {
            w=word[i];
            while(word[++i]==w)
            b++;
            freq[a]=b;
            word2[a++]=w;
            if(b>max)
            max=b;
            b=0;
        }
        System.out.println("WORD\t\tFREQUENCY");
        for(int i=max;i>=1;i++)
        {
            for(int j=0;j<a;j++)
            {
                if(freq[a]==max)
                System.out.println(word2[a]+"\t\t"+freq[a]);
            }
        }
    }
}