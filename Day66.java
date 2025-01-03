public class Day66 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int R=sc.nextInt(), C=sc.nextInt();sc.nextLine();
        char mat[][]=new char [R][C];
        for(int i=0;i<R;i++)
        {
            String S[]=sc.nextLine().split("\\s+");
            for(int j=0;j<C;j++)
            {
                mat[i][j]=S[j].charAt(0);
            }
        }
        int K=sc.nextInt(), N=sc.nextInt();
        System.out.println();
        int sum=0;
        String ma[][]=new String[R][C];
        for(int i=R-1;i>=0;i--)
        {
            int count=0, val=0;
            boolean flag=true;
            for(int j=C-1;j>=0;j--)
            {
                if(mat[i][j]=='P' && flag)
                {
                    if(count<K)
                    {
                        count++;
                    }
                    else
                    {
                        count=0;
                        if(sum<N)
                        {
                            val++;
                            sum++;
                        }
                        else
                        {
                            flag=false;
                        }
                        count++;
                    }
                }
                if(!flag)
                {
                    break;
                }
            }
            if(count==K && sum<N)
            {
                val++;
                sum++;
            }
            count=0;
            for(int j=C-1;j>=0;j--)
            {
                if(mat[i][j]=='P')
                {
                    if(count<K)
                    {
                        count++;
                    }
                    else
                    {
                        count=0;
                        count++;
                        val--;
                    }
                    if(val>0)
                    {
                        ma[i][j]=Integer.toString(count);
                    }
                    else
                    {
                        ma[i][j]=Character.toString(mat[i][j]);
                    }
                }
                else
                {
                    ma[i][j]=Character.toString(mat[i][j]);
                }
            }
        }
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                System.out.print(ma[i][j]+" ");
            }
            System.out.println();
        }
	}
}
