import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(), arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        int T=sc.nextInt();
        int mid=N/2;
        System.out.println();
        for(int i=1;i<=T;i++)
        {
            int n1=arr[mid-1], n2=arr[mid], n3=arr[mid+1];
            if(n1>n2 && n1>n3)
            {
                for(int j=mid-1;j<N-1;j++)
                {
                    arr[j]=arr[j+1];
                }
                for(int j=N-1,k=N-2;k>=0;j--,k--)
                {
                    arr[j]=arr[k];
                }
                arr[0]=n1;
            }
            else if(n3>n1 && n3>n2)
            {
                for(int j=mid+1;j<N-1;j++)
                {
                    arr[j]=arr[j+1];
                }
                arr[N-1]=n3;
            }
            else
            {
                if(arr[0]>arr[N-1])
                {
                    for(int j=mid;j<N-1;j++)
                    {
                        arr[j]=arr[j+1];
                    }
                    for(int j=N-1,k=N-2;k>=0;j--,k--)
                    {
                        arr[j]=arr[k];
                    }
                    arr[0]=n2;
                }
                else
                {
                    for(int j=mid;j<N-1;j++)
                    {
                        arr[j]=arr[j+1];
                    }
                    arr[N-1]=n2;
                }
            }
        }
        for(int j=0;j<N;j++)
        {
            System.out.print(arr[j]+" ");
        }
	}
}
