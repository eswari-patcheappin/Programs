import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        long sum1=0, sum2=0,sum=0;
        int M=sc.nextInt();
        for(int i=0;i<M;i++)
        {
            int num=sc.nextInt();
            sum1=(sum1*10)+num;
        }
        System.out.println();
        int N=sc.nextInt();
        for(int i=0;i<N;i++)
        {
            int num=sc.nextInt();
            sum2=(sum2*10)+num;
        }
        sum=sum1+sum2;
        String s=Long.toString(sum);
        char C[]=s.toCharArray();
        for(int i=0;i<C.length;i++)
        {
            System.out.print(C[i]+" ");
        }
	}
}
