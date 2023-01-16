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