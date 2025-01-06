import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(), max=Integer.MIN_VALUE, index=0;
        System.out.println();
        for(int i=0;i<N;i++)
        {
            int num=sc.nextInt(), count=0;
            for(int j=1;j<=num;j++)
            {
                if(num%j==0)
                {
                    count++;
                }
            }
            if(count>max)
            {
                max=count;
                index=num;    
            }
        }
        System.out.print(index+" "+max);
	}
}
