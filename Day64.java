import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        char S[]=sc.nextLine().toCharArray();
        int N=sc.nextInt(), ind=0;
        System.out.println();
        for(int i=0;i<N;i++)
        {
            boolean flag=false;
            int val=-1;
            for(int j=0;j<N+i;j++)
            {
                if(j<(N-(i+1)))
                {
                    System.out.print("*");
                }
                else if(i==0 || i%2!=0)
                {
                    if(ind<S.length)
                    {
                        System.out.print(S[ind++]);
                    }
                    else
                    {
                        System.out.print("#");
                    }
                }
                else
                {
                    if(!flag)
                    {
                        flag=true;
                        val=j;
                    }
                }
            }
            if(flag)
            {
                int esh=(N+i)-val, hello=0;
                while(esh>0)
                {
                    esh--;
                    if(ind<S.length)
                    {
                        ind++;
                    }
                    else
                    {
                        hello++;
                    }
                }
                int ee=ind;
                for(int j=val, count=0;j<N+i;j++, count++)
                {
                    if(count<hello)
                    {
                        System.out.print("#");
                    }
                    else
                    {
                        System.out.print(S[--ee]);
                    }
                }
            }
            System.out.println();
        }
	}
}
