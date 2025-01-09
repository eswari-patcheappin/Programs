import java.util.Scanner;

public class Day80 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int R=sc.nextInt(), C=sc.nextInt(), cap[][]=new int[R][C], water[][]=new int[R][C];
        for(int k=0;k<2;k++)
        {
            for(int i=0;i<R;i++)
            {
                for(int j=0;j<C;j++)
                {
                    if(k==0)
                    {
                        cap[i][j]=sc.nextInt();
                    }
                    else
                    {
                        water[i][j]=sc.nextInt();
                    }
                }
            }
        }
        int drop=sc.nextInt();
        int start=R-1,end=0;
        while(end<=C-1)
        {
            int t1=start, t2=end, tank=drop;
            while(t1<R && t2<C)
            {
                int gap=cap[t1][t2]-water[t1][t2];
                if(tank>=gap)
                {
                    water[t1][t2]+=gap;
                    tank-=gap;
                }
                else if(tank<gap && tank!=0)
                {
                    water[t1][t2]+=tank;
                    tank=0;
                }
                if(t1<R)
                {
                    t1++;
                    t2++;
                }
                else
                {
                    t2++;
                }
            }
            if(start>0)
            {
                start--;
            }
            else
            {
                end++;
            }
        }
        System.out.println();
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                System.out.print(water[i][j]+" ");
            }
            System.out.println();
        }
	}
}
