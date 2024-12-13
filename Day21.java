import java.util.Arrays;
import java.util.Scanner;

public class Day21 {
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner (System.in);
		int N=sc.nextInt(), K=sc.nextInt(), arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
		    arr[i]=sc.nextInt();
		}
		int num=0;
		System.out.println();
		boolean flag=true;
		while(flag)
		{
		    int a[]=new int[K], ind=0;
    		for(int i=num,count=1;count<=K && i<N;i++,count++)
    		{
    		    a[ind++]=arr[i];
    		   if(i==(N-1))
    		   {
    		       flag=false;
    		   }
    		}
    		Arrays.sort(a);
    		System.out.println(a[ind-2]+" "+a[ind-1]);
    		num++;
		}
	}
}
