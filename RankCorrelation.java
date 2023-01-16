import java.util.*;
//program to check whether N pair of marks have positive or negative correlation between them
class RankCorrelation
{//start of class
    public static void main(String args[])
    {//start of main
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");
        int N=sc.nextInt();
        int arr[][]=new int[N][2];
        System.out.println("Enter N pairs of marks in Maths and Computer Science: ");
        for(int i=0;i<N;i++)
        {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        int sum=0, sum1=0, d;
        for(int i=0;i<N;i++)
        {
            d=arr[i][0]-arr[i][1];
            sum+=d*d;
        }
        double rho=(double)(1-((6*sum)/(N*(N*N-1))));//Spearman's correlation coefficient(Rho)
        System.out.println("Spearman's correlation coefficient(Rho): "+rho);
        for(int i=0;i<N-1;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                if((arr[i][0]>arr[j][0]&&arr[i][1]>arr[j][1])||(arr[i][0]<arr[j][0]&&arr[i][1]<arr[j][1]))
                d=2;
                else
                d=-2;
                sum+=d;
            }
            sum1+=sum;
        }
        double tao=(double)(sum1/(N*(N-1)));//Kendall's correlation coefficient(Tao)
        System.out.println("Kendall's correlation coefficient(Tao): "+tao);
        if(rho>0.0&&tao>0.0)//condition for positive correlation
        System.out.println("There exists a positive correlation between Maths and Computer Science.");
        else if(rho<0.0&&tao<0.0)//condition for negative correlation
        System.out.println("There exists a negative correlation between Maths and Computer Science.");
        else
        System.out.println("There exists no correlation between Maths and Computer Science.");
    }//end of main
}//end of class