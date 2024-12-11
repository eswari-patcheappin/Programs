import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(), X=sc.nextInt(), arr[]=new int[N], count=0;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println();
        while(true)
        {
            count++;
            int sCount=0;
            if(count%X==0)
            {
                if(arr[0]==1 && arr[N-1]!=1)
                {
                    if(arr[0]==1)
                    {
                        arr[N-1]=1;
                        arr[1]=1;
                    }
                }
                else if(arr[N-1]==1)
                {
                    arr[0]=1;
                    arr[N-2]=1;
                }
                for(int i=1;i<N-1;i++)
                {
                    if(arr[i]==1)
                    {
                        boolean flag=false;
                        if(arr[i+1]!=1)
                        {
                            flag=true;
                        }
                        arr[i-1]=1;
                        arr[i+1]=1;
                        if(flag)
                        {
                            i++;
                        }
                    }
                }
            }
            for(int i=0;i<N;i++)
            {
                if(arr[i]==1)
                {
                    sCount++;
                }            
            }
            if(sCount==N)
            {
                break;
            }
            sc.close();
        }
        System.out.println(count);
	}
}
