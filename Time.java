import java.util.*;
class Time
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number between 1 and 12(both inclusive): ");
        int a=sc.nextInt();
        while(a<1||a>12)
        {
            System.out.print("INVALID INPUT. Enter a number between 1 and 12(both inclusive): ");
            a=sc.nextInt();
        }
        System.out.print("Enter a number between 0 and 59(both inclusive): ");
        int b=sc.nextInt();
        while(b<0||b>59)
        {
            System.out.print("INVALID INPUT. Enter a number between 0 and 59(both inclusive): ");
            b=sc.nextInt();
        }
        int n=b;
        String arr[]={"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty",
                      "twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine"};
        if(b>30)
        {
            if(a==12)
            a=1;
            else
            a++;
            n=60-b;
        }
        String s1="", s2="", str="";
        s1=arr[a-1];
        s2=arr[n-1];
        if(b==0)
        str=s1+" o' clock";
        else if(b==15)
        str="quarter past "+s1;
        else if(b==30)
        str="half past "+s1;
        else if(b==45)
        str="quarter to "+s1;
        else if(b<30)
        str=s2+" minutes past "+s1;
        else
        str=s2+" minutes to "+s1;
        System.out.println(str);
    }
}