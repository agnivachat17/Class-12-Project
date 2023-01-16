import java.util.Scanner;
class LexographicalOrder
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="";
        int l=0;
        System.out.println("Enter any sentence terminating by either “.”,”!” or “?” ");   
        do{
            l++;
            if(l>1)
            {    System.out.println("Sentence should terminate by either “.”,”!” or “?” ");
                 System.out.println();
                 System.out.println("TRY AGAIN");
            }
            s=sc.nextLine();
        }while(".,!?".indexOf(s.charAt(s.length()-1))==-1);
        s=s.trim()+" ";
        String st=s.substring(0,(s.length()-2));
        int len=st.length();
        int k=0;
        String temp="";
        String w[]=st.split(" ");
        int c= w.length;
        System.out.println("Length: "+c);
        // code for arranging the list of words in 'w' using bubble sorting technique
        for(int i=0;i<c-1;i++)
        {
            for(int j=0;j<c-i-1;j++)
            {
                // code to compare two words to find which appears before the other in dictionary order
                if(w[j].compareToIgnoreCase(w[j+1])>0)    
                {
                    // swap the contents between jth and (j+1)th element within the array
                    temp=w[j];
                    w[j]=w[j+1];
                    w[j+1]=temp;
                }
            }
        }
        String newsent="";
        // loop to form the new sentence containing the sorted list
        for(int i=0;i<c;i++)
            newsent+=w[i]+" ";            
        System.out.println("Rearranged Sentence:"); // displays the new sentence
        System.out.print(newsent); // displays the new sentence
    }
}