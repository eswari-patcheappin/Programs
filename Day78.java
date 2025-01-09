public class Day78 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int R=sc.nextInt(), C=sc.nextInt(), mat[][]=new int[R][C];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        int K=sc.nextInt();
        System.out.println();
        for(int i=0,k=(R-1)-(K-1);i<K;i++,k++)
        {
            for(int j=0,l=(C-1)-(K-1);j<K;j++,l++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[k][l];
                mat[k][l]=temp;
                temp=mat[i][l];
                mat[i][l]=mat[k][j];
                mat[k][j]=temp;
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
