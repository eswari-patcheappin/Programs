import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(), arr[]=new int[N], val[]=new int[10001], ind=0;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        int K=sc.nextInt(),count=0;
        System.out.println();
        for(int i=1;i<N;i++)
        {
            int num=arr[i]-arr[i-1];
            if(num>1)
            {
                for(int j=1;j<num;j++)
                {
                    count++;
                    val[ind++]=arr[i-1]+j;
                    if(count==K)
                    {
                        break;
                    }
                }
                if(count==K)
                {
                    break;
                }
            }
        }
        if(count!=K)
        {
            System.out.print("-1");
            return ;
        }
        for(int i=0;i<ind;i++)
        {
            System.out.print(val[i]+" ");
        }
	}
}
