import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(), K=sc.nextInt(), count=0;
        System.out.println();
        for(int i=1;i<=N;i++)
        {
            char C[]=Integer.toString(i).toCharArray();
            int sum=0;
            for(int j=0;j<C.length;j++)
            {
                sum+=C[j]-'0';
            }
            if(sum%K==0)
            {
                count++;
            }
        }
        System.out.print(count);
	}
}
