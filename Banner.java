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