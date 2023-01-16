import java.util.*;
class MatrixOperations
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of matrix between 3 and 10(both non-inclusive): ");
        int n=sc.nextInt();
        while(n<=3&&n>=10)
        {
            System.out.print("INVALD INPUT. Enter size of matrix between 3 and 10(both non-inclusive): ");
            n=sc.nextInt();
        }
        int arr[][]=new int[n][n];
        int brr[]=new int[n*n];
        int k=0;
        System.out.println("Enter the elements of the matrix(non-negative): ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
                while(arr[i][j]<0)
                {
                    System.out.print("INVALID INPUT. Enter element(non-negative): ");
                    arr[i][j]=sc.nextInt();
                }
                if(i!=0&&i!=(n-1)&&j!=0&&j!=(n-1))
                {
                    brr[k]=arr[i][j];
                    k++;
                }
            }
        }
        System.out.println("Original Matrix: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            System.out.print(arr[i][j]+" ");
            System.out.println();
        }
        int temp=0;
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<k-i-1;j++)
            {
                if(brr[j]>brr[j+1])
                {
                    temp=brr[j];
                    brr[j]=brr[j+1];
                    brr[j+1]=temp;
                }
            }
        }
        k=0;
        int sum1=0, sum2=0;
        int crr[]=new int[n];
        int drr[]=new int[n];
        System.out.println("Rearranged Matrix: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=0&&i!=(n-1)&&j!=0&&j!=(n-1))
                {
                    arr[i][j]=brr[k];
                    k++;
                }
                if(i==j)
                {
                    sum1+=arr[i][j];
                    crr[i]=arr[i][j];
                }
                if((i+j)==(n-1))
                {
                    sum2+=arr[i][j];
                    drr[i]=arr[i][j];
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Sum of Diagonals in Rearranged Matrix: \n"+crr[0]);
        for(int i=1;i<crr.length;i++)
        System.out.print("+"+crr[i]);
        System.out.println("="+sum1);
        System.out.print(drr[0]);
        for(int i=1;i<drr.length;i++)
        System.out.print("+"+drr[i]);
        System.out.println("="+sum1);
    }
}