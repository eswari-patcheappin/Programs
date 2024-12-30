import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int R=sc.nextInt(), C=sc.nextInt();sc.nextLine();
        char mat[][]=new char[R][C];
        int num=0;
        System.out.println();
        boolean flag=true;
        for(int i=0;i<R;i++)
        {
            String S[]=sc.nextLine().split("\\s+");
            for(int j=0;j<S.length;j++)
            {
                mat[i][j]=S[j].charAt(0);
                if(j<=num && flag)
                {
                    System.out.print(mat[i][j]);
                }
                else if((C-(num+1))<=j && !flag)
                {
                    System.out.print(mat[i][j]);
                }
            }
            if(flag)
            {
                flag=false;
            }
            else
            {
                flag=true;
            }
            if(num<C-1)
            {
                num++;
            }
            System.out.println();
        }
	}
}
