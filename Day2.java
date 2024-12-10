import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int K=sc.nextInt(),arr[]=new int[K];
        for(int i=0;i<K;i++)
        {
            arr[i]=sc.nextInt();
        }
        int N=sc.nextInt(), mat[][]=new int[N/2][2];
        System.out.println();
        int num=1,ind=0;
        for(int i=0;i<N/2;i++)
        {
            for(int j=0;j<2;j++)
            {
                mat[i][j]=num;
                num++;
            }
        }
        for(int k=0;k<K;k++)
        {
            for(int i=0;i<N/2;i++)
            {
                for(int j=0;j<2;j++)
                {
                    if(mat[i][j]==arr[k])
                    {
                        mat[i][j]=-1;
                        break;
                    }
                }
            }
        }
        int count=0;
        sc.close();
        for(int i=0;i<N/2;i++)
        {
            for(int j=0;j<2;j++)
            {
                if(mat[i][j]!=-1 && j==0 && mat[i][j+1]!=-1)
                {
                    count++;
                }
                if(mat[i][j]!=-1 && i<((N/2)-1) && mat[i+1][j]!=-1)
                {
                    count++;
                }
            }
        }
        System.out.print(count);
	}
}
