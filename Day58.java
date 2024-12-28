import java.util.Arrays;
import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(), arr[]=new int[N], max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i=0;i<N-1;i++)
        {
            int num = arr[i+1]-arr[i];
            if(max<num)
            {
                max=num;
            }
        }
        System.out.print(max);
	}
}
