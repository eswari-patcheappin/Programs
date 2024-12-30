public class Day61 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int L=sc.nextInt(), B=sc.nextInt();sc.nextLine();
        char mat[][]=new char[L][B];
        for(int i=0;i<L;i++)
        {
            String S[]=sc.nextLine().split("\\s+");
            for(int j=0;j<S.length;j++)
            {
                mat[i][j]=S[j].charAt(0);
            }
        }
        char C=sc.next().charAt(0);
        System.out.println();
        int green=0, red=0, blue=0;
        for(int i=0;i<L;i++)
        {
            for(int j=0;j<B;j++)
            {
                if((C=='G' && mat[i][j]=='B') || (C=='G' && mat[i][j]=='R'))
                {
                    green++;
                }
                else if(C=='R' && mat[i][j]=='G')
                {
                    if(C=='R')
                        red++;
                }
                else if(C=='R' && mat[i][j]=='B')
                {
                    boolean flag=false;
                    if(i>0 && mat[i-1][j]=='R')
                        flag=true;
                    else if(i<(L-1) && mat[i+1][j]=='R')
                        flag=true;
                    else if(j>0 && mat[i][j-1]=='R')
                        flag=true;
                    else if(j<(B-1) && mat[i][j+1]=='R')
                        flag=true;
                    if(flag)
                    {
                        green++;
                        red++;
                    }
                }
                else if(C=='B' && mat[i][j]=='R')
                {
                    boolean flag=false;
                    if(i>0 && mat[i-1][j]=='B')
                    {
                        flag=true;
                    }
                    else if(i<(L-1) && mat[i+1][j]=='B')
                    {
                        flag=true;
                    }
                    else if(j>0 && mat[i][j-1]=='B')
                    {
                        flag=true;
                    }
                    else if(j<(B-1) && mat[i][j+1]=='B')
                    {
                        flag=true;
                    }
                    if(flag)
                    {
                        green++;
                        blue++;
                    }
                }
                else if(C=='B' && mat[i][j]=='G')
                {
                    blue++;
                }
            }
        }
        System.out.println("R "+red+"\nG "+green+"\nB "+blue);
	}
}
