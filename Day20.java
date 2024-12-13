import java.util.Scanner;

public class Day20 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        char S[]=sc.nextLine().toCharArray();
        int N=sc.nextInt(), max=Integer.MIN_VALUE;
        sc.nextLine();
        String str="";
        System.out.println();
        for(int i=0;i<N;i++)
        {
            String string=sc.nextLine();
            char s[]=string.toCharArray();
            int sum=0;
            for(int j=0;j<s.length;j++)
            {
                for(int k=0;k<S.length;k++)
                {
                    if(s[j]==S[k])
                    {
                        sum+=(k+1);
                    }
                }
            }
            if(max<sum)
            {
                max=sum;
                str=string;
            }
        }
        System.out.print(str);
    }
}
