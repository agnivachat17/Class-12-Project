import java.util.*;
class Matrix
{
    public static void main(String[]args)throws InputMismatchException
    {
        int M, i, j, k, t;
        Scanner sc = new Scanner(System.in);
        int l=0;
        System.out.println("Enter no of rows for a square matrix: ");
        do{
            l++;
            if(l>1)
            {    System.out.println("OUT OF RANGE...It must be greater than 2 and less than 20");
                 System.out.println();
                 System.out.println("INPUT AGAIN NOW");
            }
            M= sc.nextInt();
        }while(M<=2 || M>=20);           
        int A[][] = new int [M][M];
        System.out.println("Enter "+(M*M) + " elements: ");
        for(i=0;i < M;i++)
        {
              for(j=0;j < M;j++)
            {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("ORIGINAL MATRIX");
        for(i=0;i < M;i++)
        {
             for(j=0;j < M;j++)
            {
                System.out.print(A[i][j]+" ");
             }
            System.out.println();
        }
        for(j=0, k = M-1; j < M/2; j++, k--)
         {
            for(i=0;i < M; i++)
            {
                //swap the elements like lateral inversion
                t = A[i][j];
                A[i][j] = A[i][k];
                A[i][k] = t;
             }
        }
        System.out.println("MIRROR IMAGE MATRIX");
        for(i=0;i < M;i++)
        {
               for(j=0;j < M;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }//END OF MAIN
}//END OF CLASS