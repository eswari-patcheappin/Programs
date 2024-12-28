public class Day57 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc= new Scanner (System.in);
        int N=sc.nextInt(), num=(2*N)-2;
        String S=sc.next();
        System.out.println();
        int val=0;
        int mat[][]=new int[N][N];
        if(S.equals("tl") || S.equals("br"))
        {
            int left=0, right=0;
            while(true)
            {
                int l=left,r=right;
                while(r>=0 && l>=0)
                {
                    if(S.equals("tl"))
                    {
                        mat[l][r]=val;
                    }
                    else
                    {
                        mat[l][r]=num;
                    }
                    l++;r--;
                    if(l>(N-1)||(r<0))
                    {
                        break;
                    }
                }
                if(left==(N-1))
                {
                    break;
                }
                if(right<N-1)
                {
                    right++;
                }
                else
                {
                    left++;
                }
                if(S.equals("tl"))
                {
                    val++;
                }
                else
                {
                    num--;
                }
            }
        }
        else if(S.equals("tr") || (S.equals("bl")))
        {
            int left=0, right=N-1;
            while(true)
            {
                int l=left,r=right;
                while(r<=(N-1) && l<=(N-1))
                {
                    if(S.equals("tr"))
                    {
                        mat[l][r]=val;
                    }
                    else
                    {
                        mat[l][r]=num;
                    }
                    l++;r++;
                    if(r==N || l==N)
                    {
                        break;
                    }
                }
                if(left==(N-1))
                {
                    break;
                }
                if(right>0)
                {
                    right--;
                }
                else
                {
                    left++;
                }
                if(S.equals("tr"))
                {
                    val++;
                }
                else
                {
                    num--;
                }
            }
        }
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
	}
}
