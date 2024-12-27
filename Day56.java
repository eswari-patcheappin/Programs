import java.util.Arrays;
import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(), arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println();
        int start=0,past=0;
        boolean flag=true;
        for(int j=0;j<N;j++)
        {
            if((j+1<N) && (arr[j+1]-arr[j]==1))
            {
                if(flag)
                {
                    past=j;
                    flag=false;
                }
                    
            }                
            else
            {
                if(!flag)
                {
                    start=j;
                    System.out.print(arr[past]+"-"+arr[start]);
                    if(j!=(N-1))System.out.print(",");
                }
                else
                {
                    System.out.print(arr[j]);
                    if(j!=(N-1))System.out.print(",");
                }
                flag=true;
            }
        }
	}
}
