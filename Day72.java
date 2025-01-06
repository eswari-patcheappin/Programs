public class Day72 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int R=sc.nextInt(), C=sc.nextInt();sc.nextLine();
        char mat[][]=new char[R][C];
        for(int i=0;i<R;i++)
        {
            String S[]=sc.nextLine().split("\\s+");
            for(int j=0;j<C;j++)
            {
                mat[i][j]=S[j].charAt(0);
            }
        }
        System.out.println();
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                if(mat[i][j]=='+')
                {
                    if(i>0 && mat[i-1][j]=='P')
                    {
                        mat[i-1][j]='*';
                    }
                    if(j<C-1 && mat[i][j+1]=='P')
                    {
                        mat[i][j+1]='*';
                    }
                    if(j>0 && mat[i][j-1]=='P')
                    {
                        mat[i][j-1]='*';
                    }
                    if(i<R-1 && mat[i+1][j]=='P')
                    {
                        mat[i+1][j]='*';
                    }
                }
                else if(mat[i][j]=='x')
                {
                    if(i>0 && j>0 && mat[i-1][j-1]=='P')
                    {
                        mat[i-1][j-1]='*';
                    }
                    if(i>0 && j<C-1 && mat[i-1][j+1]=='P')
                    {
                        mat[i-1][j+1]='*';
                    }
                    if(i<R-1 && j>0 && mat[i+1][j-1]=='P')
                    {
                        mat[i+1][j-1]='*';
                    }
                    if(i<R-1 && j<C-1 && mat[i+1][j+1]=='P')
                    {
                        mat[i+1][j+1]='*';
                    }
                }
            }
        }
        int count=0;
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                if(mat[i][j]=='P')
                {
                    count++;
                }
            }
        }
        System.out.print(count);
	}
}
