import java.util.Arrays;
import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(), D=(int)Math.pow(2,N)-1;
        System.out.println();
        for(int i=0;i<=D;i++)
        {
            String S=Integer.toBinaryString(i);
            char C[]=S.toCharArray();
            int arr[]=new int[N], len=(int)Math.log10(Long.parseLong(S))+1, ind=0;
            Arrays.fill(arr,0);
            if(i!=0)
            {
                for(int j=0;j<N;j++)
                {
                    if(j<(N-len))
                    {
                        arr[j]=0;
                    }
                    else
                    {
                        arr[j]=C[ind++]-'0';
                    }
                }
            }
            for(int j=0;j<N;j++)
            {
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
	}
}
