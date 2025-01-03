import java.util.Scanner;

public class Day68 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int R=sc.nextInt(), C=sc.nextInt(), mat[][]=new int[R][C];
        System.out.println();
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<C;i++)
        {
            if(i%2==0)
            {
                for(int j=R/2,k=0;j<R;j++,k++)
                {
                    int temp=mat[k][i];
                    mat[k][i]=mat[j][(C-1)-i];
                    mat[j][(C-1)-i]=temp;
                }
            }
        }
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
	}
}
