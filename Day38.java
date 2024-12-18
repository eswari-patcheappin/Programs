import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(), arr[]=new int[N], sum=0;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        if(sum%3!=0)
        {
            System.out.println("NO");
            return ;
        }
        int num=sum/3;
        int val=0, count=0;
        for(int i=0;i<N;i++)
        {
            val+=arr[i];
            if(val==num)
            {
                count++;
                val=0;
            }
        }
        if(count==3)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
	}
}
