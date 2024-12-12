import java.util.Arrays;
import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int R=sc.nextInt(), C=sc.nextInt(), Q=sc.nextInt(), mat[][]=new int[R][C];
        sc.nextLine();
        for(int[] row:mat)
        {
            Arrays.fill(row,0);
        }        
System.out.println();
        for(int i=0;i<Q;i++)
        {
            char S[]=sc.next().toCharArray();
            boolean flag=true, pre=true;
            int num1=0,num2=0;
            char c1=' ',c2=' ';
            for(int j=0;j<S.length;j++)
            {
                if(Character.isDigit(S[j]))
                {
                    if(flag)
                    {
                        num1=(num1*10)+(S[j]-'0');
                    }
                    else
                    {
                        num2=(num2*10)+(S[j]-'0');
                        pre=false;
                    }
                }
                else
                {
                    if(pre)
                    {
                        c1=S[j];
                        flag=false;
                    }
                    else
                    {
                        c2=S[j];
                    }
                }
            }
            num1=num1!=0?--num1:-1;num2=num2!=0?--num2:-1;
            if(num1>=0 && c1!=' ' && num2==-1)
            {
                if(c1=='r')
                {
                    for(int j=0;j<C;j++)
                    {
                        mat[num1][j]++;
                    }
                }
                else if(c1=='c')
                {
                    for(int j=0;j<R;j++)
                    {
                        mat[j][num1]++;
                    }
                }
            }
            else 
            {
                if(c1=='r' && c2=='c')
                {
                    mat[num1][num2]++;
                }
                else 
                {
                    mat[num2][num1]++;
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
