import java.util.*;
class MCQ_Answers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of participants: ");
        int N=sc.nextInt();
        if(N<=3||N>=11)
        {
            System.out.println("INPUT SIZE OUT OF RANGE");
            return;
        }
        char arr[][]=new char[N][5];
        char key[]=new char[5];
        System.out.println("Enter the answers of each participant: ");
        for(int i=0;i<N;i++)
        {
            System.out.print("Participant "+(i+1)+":\t");
            for(int j=0;j<5;j++)
            {
                arr[i][j]=sc.next().charAt(0);
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.print("Enter the answer key: ");
        for(int i=0;i<5;i++)
        {
            key[i]=sc.next().charAt(0);
            System.out.print("\t");
        }
        int scores[]=new int[N];
        int s=0, high=0;
        System.out.println("Scores: ");
        for(int i=0;i<N;i++)
        {
            System.out.print("Participant "+(i+1)+"= ");
            for(int j=0;j<5;j++)
            {
                if(arr[i][j]==key[j])
                s++;
            }
            System.out.println(s);
            scores[i]=s;
            if(s>high)
            high=s;
            s=0;
        }
        System.out.println("Highest Score: "+high);
        System.out.println("Participants having highest score: ");
        for(int i=0;i<N;i++)
        {
            if(scores[i]==high)
            System.out.println("Participant "+(i+1));
        }
    }
}