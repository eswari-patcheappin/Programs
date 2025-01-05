import java.util.Scanner;

public class Day71 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int R=sc.nextInt(), C=sc.nextInt(), count=0;sc.nextLine();
        char mat[][]=new char[R][C];
        for(int i=0;i<R;i++)
        {
            String S[]=sc.nextLine().split("\\s+");
            for(int j=0;j<S.length;j++)
            {
                mat[i][j]=S[j].charAt(0);
            }
        }
        System.out.println();
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                if(mat[i][j]=='W')
                {
                    for(int x=-1;x<=1;x++)
                    {
                        for(int y=-1;y<=1;y++)
                        {
                            if(x==0 && y==0) continue;
                            int num1=i+x, num2=j+y;
                            if(num1>=0 && num1<R && num2>=0 && num2<C && mat[num1][num2]=='C')
                            {
                                mat[num1][num2]='.';
                            }
                        }
                    }
                }
            }
        }
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                if(mat[i][j]=='C')
                {
                    count++;
                }
            }
        }
        if(count==0)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print(count);
        }
	}
}
