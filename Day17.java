import java.util.Arrays;
import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(), K=sc.nextInt(), arr[]=new int[K], res=0;
        Arrays.fill(arr,0);
        System.out.println();
        for(int i=0;i<N;i++)
        {
            int num=sc.nextInt()-1;
            for(int j=num;j<K;j++)
            {
                if(arr[j]==0)
                {
                    arr[j]=1;
                }
                else
                {
                    arr[j]=0;
                }
            }
        }
        for(int i=K-1,j=0;i>=0;i--,j++)
        {
            int val=(int)Math.pow(2,j);
            res+=val*arr[i];
        }
        System.out.print(res);
	}
}
