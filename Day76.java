import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        long N=sc.nextLong(), num=0, temp=N*N, val=0;
        System.out.println();
        for(int i=0;i<N;i++)
        {
            boolean flag=true;
            for(int j=0;j<N;j++)
            {
                if(i%2==0)
                {
                    num+=N;
                    System.out.print(num+" ");
                }
                else
                {
                    if(flag)
                    {
                        val=num+temp;
                        num=val;
                        flag=false;
                    }
                    else
                    {
                        val-=N;
                    }
                    System.out.print(val+" ");
                }
            }
            System.out.println();
        }
	}
}
