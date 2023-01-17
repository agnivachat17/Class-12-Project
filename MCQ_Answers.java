/*
The result of a quiz competition is to be prepared as follows:
The quiz has five questions with four multiple choices (A, B, C, D), with each question carrying 1 mark for the
correct answer. Design a program to accept the number of participants N such that N must be greater than 3
and less than 11. Create a double dimensional array of size (Nx5) to store the answers of each participant row-
wise.
Calculate the marks for each participant by matching the correct answer stored in a single dimensional array
of size 5. Display the scores for each participant and also the participant(s) having the highest score.
Example 1
INPUT : N = 5
Participant 1 D A B C C
Participant 2 A A D C B
Participant 3 B A C D B
Participant 4 D A D C B
Participant 5 B C A D D
Key: B C D A A
OUTPUT :
Scores :
Participant 1 = 0
Participant 2 = 1
Participant 3 = 1
Participant 4 = 1
Participant 5 = 2
Highest score: Participant 5
*/

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
