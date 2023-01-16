import java.util.*;
import java.io.*;
class SentenceSort
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.print("Enter the no. of sentences: ");
        int n=sc.nextInt();
        String str="", s;
        System.out.println("Enter the sentences: ");
        for(int i=1;i<=n;i++)
        {
            s=br.readLine();
            str+=s+" ";
        }
        str=(str.trim()).toUpperCase();
        StringTokenizer st=new StringTokenizer(str," .!?");
        n=st.countTokens();
        String arr[]=new String[n];
        String w="";
        System.out.println("The sentence: \n"+str+"\nNumber of words: "+n);
        for(int i=0;i<n;i++)
        arr[i]=st.nextToken();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    w=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=w;
                }
            }
        }
        System.out.println("The sorted sentence: ");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        int c=1;
        System.out.println("\nFrequency of each word: ");
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i].compareTo(arr[j])==0)
                c++;
            }
            System.out.println(arr[i]+": "+c);
            i+=c-1;
            c=1;
        }
    }
}