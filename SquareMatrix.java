import java.io.*;
import java.util.*;
class SquareMatrix
{
public static void main(String args[])
{
int A[][],B[];
Scanner sc=new Scanner(System.in);
System.out.print("Enter value of M = ");
int M=sc.nextInt();
if(M<4 && M>10)
{
System.out.println("Invalid");
}
else
{
A=new int[M][M];
int N=(int)Math.pow((M-2),2);
B=new int[N];
//Loop for entering data
for(int i=0;i<M;i++)
{
for(int j=0;j<M;j++)
{
System.out.print("Enter a number :");
A[i][j]=sc.nextInt();
}
}
//Loop to find b[]'s element
int k=0;
for(int i=0;i<M;i++)
{
for(int j=0;j<M;j++)
{
if(i!=0 && j!=0 &&i!=(M-1) && j!= (M-1))
{
B[k]=A[i][j];k++;
}
}
}
//Loop to sort B[]
for(int i=0;i<N-1;i++)
{
for(int j=0;j<N-i-1;j++)
{
if(B[j]>B[j+1])
{
int k2=B[j];
B[j]=B[j+1];
B[j+1]=k2;
}
}
}
//Loop to print original data
System.out.println("ORIGINAL MATRIX");
for(int i=0;i<M;i++)
{
for(int j=0;j<M;j++)
{
System.out.print(A[i][j]+"\t");
}
System.out.println();
}
//LOOP TO REARRANGED MATRIXS
int arr[][]=new int[M][M];
int z=0;
for(int i=0;i<M;i++)
{
for(int j=0;j<M;j++)
{
if(i!=0 && j!=0 && i!=(M-1)&& j!= (M-1))
{
arr[i][j]=B[z];
z++;
}
else
arr[i][j]=A[i][j];
}
}
System.out.println("REARRANGED ELEMENT");
for(int i=0;i<M;i++)
{
for(int j=0;j<M;j++)
{
System.out.print(arr[i][j]+"\t");
}
System.out.println();
}
//Loop to form diagonal element
String ar[][]=new String[M][M];
int k3=0;
for(int i=0;i<M;i++)
{
for(int j=0;j<M;j++)
{
if(i!=0 && j!=0 && i!=(M-1)&& j!= (M-1))
{
ar[i][j]=String.valueOf(B[k3]);
k3++;
}
else
ar[i][j]=" ";
}
}
ar[0][0]=String.valueOf(A[0][0]);
ar[0][M-1]=String.valueOf(A[0][M-1]);
ar[M-1][0]=String.valueOf(A[M-1][0]);
ar[M-1][M-1]=String.valueOf(A[M-1][M-1]);
System.out.println("DIAGONAL ELEMENT");
for(int i=0;i<M;i++)
{
for(int j=0;j<M;j++)
{
System.out.print(ar[i][j]+"\t");
}
System.out.println();
}
//To find the sum of diagonal
int a=M-1,b=0,sum=0;;
for(int i=0;i<M;i++)
{
for(int j=0;j<M;j++)
{
if(i==j)
{
sum=sum+Integer.valueOf(A[i][j]);
}
if(i==b && j==a)
{
sum=sum+Integer.valueOf(A[i][j]);
a--;b++;
}
}
}
System.out.println("Sum="+sum);
}
}
}