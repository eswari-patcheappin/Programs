import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(), tank[]=new int[N], arr[]=new int[N];
        for(int i=0;i<=1;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(i==0)
                {
                    tank[j]=sc.nextInt();
                }
                else
                {
                    arr[j]=sc.nextInt();
                }
            }
        }
        int count=0, scount=0;
        while(true)
        {
            for(int i=0;i<N;i++)
            {
                if(arr[i]>tank[i])
                {
                    count++;
                }
                if(arr[i]==tank[i])
                {
                    scount++;
                }
                arr[i]++;
            }
            if(scount==N)
            {
                break;
            }
        }
        System.out.print(count);
	}
}
