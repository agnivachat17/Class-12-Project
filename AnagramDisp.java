import java.util.*; // import the java.util package for the Scanner class

class Anagram 
{ 
    static int count=0; // initialize a static counter variable to keep track of the number of anagrams
    
    public void anagm(String st, int s, int end) 
    { 
        // st: the input word
        // s: the start index of the characters to be used in generating anagrams
        // end: the end index of the characters to be used in generating anagrams
        
        if (s==end) 
        { 
            // base case: if the start index equals the end index, then the word has been fully permuted
            // print the word and increment the anagram count
            System.out.println(st); 
            count++;
        }
        else 
        {
            for (int i=s;i<= end;i++) 
            { 
                // for each character in the word, starting from the start index
                // swap the character at the start index with the current character
                st = swap(st,s, i); 
                // call the anagm method again with the updated word, and the next index as the start index
                anagm(st,s + 1, end); 
                // undo the swap to generate new permutations
                st = swap(st,s, i);
            } 
        }
    }
    
    public String swap(String a,int i,int j) 
    { 
        // helper method to swap characters at given indices in a word
        char[] ch = a.toCharArray(); 
        char temp = ch[i]; 
        ch[i] = ch[j]; 
        ch[j] = temp; 
        // convert the character array back to a string and return it
        return String.valueOf(ch); 
    }
    
    public static void main(String[] args) 
    {
        Scanner in =new Scanner(System.in);
        // take input from the user
        System.out.println("Enter a word");
        String str =in.next();
        int l=str.length();
        if(l<=7) {
            // if the length of the word is less than or equal to 7
            System.out.println("Anagram of "+str+" is:-");
            Anagram a = new Anagram(); 
            // create an instance of the Anagram class
            // call the anagm method to generate anagrams
            a.anagm(str,0,l - 1); 
            // print the total number of anagrams
            System.out.println("Possible anagrams="+count);
        }
    }
}
