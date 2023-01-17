/*
The names of the teams participating in a competition should be displayed on a banner
vertically, to accommodate as many teams as possible in a single banner. Design a program to accept the names
of N teams, where 2 &lt; N &lt; 9 and display them in vertical order, side by side with a horizontal tab (i.e. eight
spaces). Test your program for the following data and some random data:
Example 1:
INPUT:
N = 3
Team 1: Emus
Team 2: Road Rols
Team 3: Coyote
OUTPUT:
E R C
m o o
u a y
s d o
    t
  R e
  o
  l
  s
*/
import java.util.*;
class Banner
{   
    public static void main(String args[]) 
    {
        int n,max=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of teams: ");
        n=sc.nextInt();       
        if(n<=2||n>=9) 
        {
            System.out.println("INVALID INPUT");
            return;
        }
        String arr[]=new String[n];
        sc.nextLine();
        for(int i=0;i<n;i++) 
        {
            System.out.print("Team "+(i+1)+":");
            arr[i]=sc.nextLine();
            if(arr[i].length()>max) 
                max=arr[i].length();
        }
        for(int i=0;i<max;i++) 
        {
            for(int j=0;j<n;j++) 
            {
                if(i>=arr[j].length())
                    System.out.print("\t");
                else
                    System.out.print(arr[j].charAt(i) + "\t");
            }
            System.out.println();
        }
    }
}
