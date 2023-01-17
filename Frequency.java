/**
Input a paragraph containing ‘n’ number of sentences where (1 = &lt; n &lt; 4). The words are to be separated with
a single blank space and are in UPPERCASE. A sentence may be terminated either with a full stop ‘.’ Or a
question mark ‘?’ only. Any other character may be ignored. Perform the following operations:
(i) Accept the number of sentences. If the number of sentences exceeds the limit, an appropriate error message
must be displayed.
(ii) Find the number of words in the whole paragraph
(iii) Display the words in ascending order of their frequency. Words with same frequency may appear in any
order.
Example 1
INPUT: Enter number of sentences.
1
Enter sentences.
TO BE OR NOT TO BE.
OUTPUT:

Total number of words: 6
WORD FREQUENCY
OR 1
NOT 1
TO 2
BE 2
Example 3
INPUT : Enter number of sentences
5
OUTPUT:
INVALID ENTRY
*/
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
