import java.util.Scanner;

public class Day52 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt();sc.nextLine();
        System.out.println();
        for(int i=0;i<N;i++)
        {
            String S[]=sc.nextLine().split("\\s+");
            long min=Long.MAX_VALUE;
            boolean flag=true;
            for(int j=0;j<S.length;j++)
            {
                char C[]=S[j].toCharArray();
                long num=0;
                for(int k=0;k<C.length;k++)
                {
                    if(Character.isDigit(C[k]))
                    {
                        num=(num*10)+(C[k]-'0');
                    }
                }
                if(min>num && num!=0)
                {
                    flag=false;
                    min=num;
                }
            }
            if(flag)
            {
                System.out.println("-1");
            }
            else
            {
                System.out.println(min);
            }
        }
	}
}
