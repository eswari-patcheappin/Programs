public class Day14 {
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
        System.out.println();
        boolean flagRow=true, flagCol=true;
        int row=R/2,col=C/2;
        if(R%2==0)
        {
            row+=1;
        }
        for(int i=0,j=R-1;i<row;i++,j--)
        {
            for(int k=0;k<C;k++)
            {
                if(mat[i][k]!=mat[j][k])
                {
                    flagRow=false;
                    break;
                }
            }
            if(!flagRow)
            {
                break;
            }
        }
        if(C%2==0)
        {
            col+=1;
        }
        for(int i=0;i<R;i++)
        {
            for(int j=0,k=C-1;j<col;j++,k--)
            {
                if(mat[i][j]!=mat[i][k])
                {
                    flagCol=false;
                    break;
                }
            }
            if(!flagCol)
            {
                break;
            }
        }
        if(flagRow && flagCol)
        {
            System.out.println("Both");
        }
        else if(flagRow && !flagCol)
        {
            System.out.println("Horizontally Symmetric");
        }
        else if(flagCol && !flagRow)
        {
            System.out.println("Vertically Symmetric");
        }
        else
        {
            System.out.println("-1");
        }
	}
}
