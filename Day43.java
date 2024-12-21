import java.util.Scanner;

public class Day43 {
public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(), arr1[]=new int[N], arr2[]=new int[N], min[]=new int[N];
        for(int j=0;j<2;j++)
        {
            for(int i=0;i<N;i++)
            {
                if(j==0)
                {
                    arr1[i]=sc.nextInt();
                }
                else
                {
                    arr2[i]=sc.nextInt();
                    min[i]=Math.abs(arr1[i]-arr2[i]);
                }
            }
        }
        int K=sc.nextInt();
        int sum=0,start=0,max=0;
        System.out.println();
        for(int i=0;i<N;i++)
        {
            sum+=min[i];
            if(sum>K)
            {
                sum-=min[start];
                start++;
            }
            max=Math.max(max,i-start+1);
        }
        System.out.print(max);
	}
}
