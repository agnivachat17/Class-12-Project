import java.util.*;
public class Frequency
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of sentences.");
        int n = in.nextInt();
        in.nextLine();        
        if (n < 1 || n > 3) {
            System.out.println("Invalid Entry");
            return;
        }        
        System.out.println("Enter sentences.");
        String Str = in.nextLine();
        Str = Str.toUpperCase();        
        StringTokenizer st = new StringTokenizer(Str, " .?");
        int c = st.countTokens();       
        System.out.println();
        System.out.println("Total number of words: " + c);       
        String wrd[] = new String[c];
        int freq[] = new int[c];
        int idx = 0;       
        for (int i = 0; i < c; i++) 
        {
            String word = st.nextToken();
            int j = 0;
            for (j = 0; j < idx; j++) 
            {
                if (wrd[j].equals(word)) 
                {
                    freq[j]++;
                    break;
                }
            }
            if (j == idx) 
            {
                wrd[idx] = word;
                freq[idx]++;
                idx++;
            }
        }
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (freq[j] > freq[j + 1]) {
                    int t = freq[j];
                    freq[j] = freq[j+1];
                    freq[j+1] = t;
                    
                    String temp = wrd[j];
                    wrd[j] = wrd[j+1];
                    wrd[j+1] = temp;
                }
            } 
        }
        System.out.println("Word\tFrequency");
        for (int i = 0; i < idx; i++) {
            System.out.println(wrd[i] + "\t" + freq[i]);
        }
    }
}