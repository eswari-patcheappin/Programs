public class Day33 {
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
        int K=sc.nextInt()-1, num=0;
        System.out.println();
        boolean pre=true;
        for(int i=0;i<R;i++)
        {
            int start=num, end=-1, sum=0;
            if((num+K)<C && pre)
            {
                end=(num+K);
                num++;
                if(end==(C-1))
                {
                    pre=false;
                }
            }
            else if(num>1)
            {
                num--;
                start=num-1;
                end=(num+K)-1;
                if(start==0)
                {
                    pre=true;
                }
            }
            for(int j=start;j<=end;j++)
            {
                sum+=mat[i][j];
            }
            System.out.print(sum+" ");
        }
	}
}
