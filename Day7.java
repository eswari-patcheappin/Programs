import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(), X=sc.nextInt(), arr[]=new int[N];
        long count=0;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println();
        while(true)
        {
            count++;
            if(count%X==0)
            {
                int temp[]=arr.clone();
                for(int i=0;i<N;i++)
                {
                    if(arr[i]==1)
                    {
                        temp[(i-1+N)%N]=1;
                        temp[(i+1+N)%N]=1;
                    }
                }
                arr=temp;
                boolean flag=true;
                for(int i=0;i<N;i++)
                {
                    if(arr[i]==0)
                    {
                        flag=false;
                        break;
                    }
                }
                if(flag)
                {
                    System.out.println(count);
                    break;
                }
            }
        }
        sc.close();
	}
}
