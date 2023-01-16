import java.util.*;
class Anagram
{
    static int count=0;
    public void anagm(String st, int s, int end) 
    { 
        if (s==end)
        {
            System.out.println(st); 
            count++;
        }
        else 
        {
            for (int i=s;i<= end;i++) 
            {
                st = swap(st,s, i); 
                anagm(st,s + 1, end); 
                st = swap(st,s, i);
            } 
        }
    }
    public String swap(String a,int i,int j) 
    { 
        char[] ch = a.toCharArray(); 
        char temp = ch[i]; 
        ch[i] = ch[j]; 
        ch[j] = temp; 
        return String.valueOf(ch); 
    }
    public static void main(String[] args) 
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a word");
        String str =in.next();
        int l=str.length();
        if(l<=7)
        {
            System.out.println("Anagram of "+str+" is:-");
            Anagram a = new Anagram(); 
            a.anagm(str,0,l - 1); 
            System.out.println("Possible anagrams="+count);
        }
    }
}