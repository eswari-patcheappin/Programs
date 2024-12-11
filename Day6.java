import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(), arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        int K=sc.nextInt();
        for(int i=1;i<=K;i++)
        {
            int ind=-1;
            if(arr[0]<arr[1])
            {
                ind=0;
            }
            else
            {
                ind=1;
            }
            int num=arr[ind];
            for(int j=0;j<N-1;j++)
            {
                if(j>=ind)
                {
                    arr[j]=arr[j+1];
                }
            }
            arr[N-1]=num;
        }
        sc.close();
        for(int j=0;j<N;j++)
        {
            System.out.print(arr[j]+" ");
        }
	}
}
