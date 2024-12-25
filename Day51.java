import java.util.Scanner;

public class Day51 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(), arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        int D=sc.nextInt(), count=0;
        long sum=0;
        System.out.println();
        for(int i=0;i<N;i++)
        {
            int len=Integer.toString(arr[i]).length();
            if((count+len)<=D)
            {
                sum+=arr[i];
                System.out.print(arr[i]+" ");
                count+=len;
            }
            else
            {
                System.out.println(sum);
                i--;
                sum=0;
                count=0;
            }
        }
        System.out.println(sum);
}
