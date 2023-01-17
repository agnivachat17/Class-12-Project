/*
Wraparound Numbers
Let us consider each digit in a positive integer to be:
1. a &quot;place&quot; we can visit, and
2. an instruction telling us how many places to the right we should move (wrapping around to the leftmost digit
when necessary) to find the next place to visit.
For example, take the number 2635. Let us begin by visiting its leftmost digit, 2. It tells us that we should next
visit the digit two places to its right, which is the 3. The 3 tells us to move three places to the right, which
(wrapping around) lands us on the 6. We then move six places to the right (again wrapping around) to land on
the 5. Moving five places to the right (which involves wrapping around twice) lands us on the 2. Notice that we
are back to where we started and that every digit has been visited. This property characterizes the so-called
wraparound numbers. That is, a wraparound number is a positive integer having the property that, if we begin
by visiting its leftmost digit and proceed to visit its digits according to the rule we followed in the example
above, all digits will be visited, and, furthermore, the first digit to be visited for a second time will be the
leftmost one. Thus, 2635 is a wraparound number.
For another example, take 21674. It is not a wraparound number, because if we begin by visiting the 2, we will
next visit the 6, then the 7, then the 2, then the 6, then the 7, etc., etc., never having visited the 1 or the 4. As a
last example, take 12. It is not a wraparound number, because we would visit the 1, then the 2, and then the 2
again, failing to return to the leftmost digit.
You are to write a program that prompts the user to enter a positive integer and that responds by telling
whether or not it is a wraparound number. The program should terminate when the user enters the number 0.
Sample Program Execution:
Please enter a number:

2635
2635 IS a wraparound number.
Please enter a number: 21674
21674 IS NOT a wraparound number.
Please enter a number: 0
*/
import java.util.*;
class Wraparound
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        char ch[]={'0','1','2','3','4','5','6','7','8','9'};
        String str="";
        while(n!=0)
        {
            String s=Integer.toString(n);
            int l=s.length();
            A:for(int i=0;i<l; )
            {
                char c=s.charAt(i);
                for(int j=0;j<10;j++)
                {
                    if(c==ch[j])
                    {
                        if(j==0)
                        {
                            System.out.println(n+" IS NOT A WRAPAROUND NUMBER.");
                            break A;
                        }
                        i+=j;
                        while(i>=l)
                        i-=l;
                    }
                }
                if(str.length()==l)
                {
                    if(c==str.charAt(0))
                    {
                        System.out.println(n+" IS A WRAPAROUND NUMBER.");
                        break;
                    }
                    else
                    {
                        System.out.println(n+" IS NOT A WRAPAROUND NUMBER.");
                        break;
                    }
                }
                else
                {
                    for(int k=0;k<str.length();k++)
                    {
                        if(c==str.charAt(k))
                        {
                            System.out.println(n+" IS NOT A WRAPAROUND NUMBER.");
                            break A;
                        }
                    }
                    str+=c;
                }
            }
            System.out.print("Enter a number: ");
            n=sc.nextInt();
        }
    }
}
