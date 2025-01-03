import java.util.Scanner;

public class Day67 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(), arr[]=new int[N], val=0;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<N;i++)
        {
            int start=arr[i];
            for(int j=i+1;j<N;j++)
            {
                if(start>arr[j])
                {
                    for(int k=j+1;k<N;k++)
                    {
                        if(arr[j]>arr[k])
                        {
                            val++;
                        }
                    }
                }
            }
        }
        System.out.print(val);
	}
}
