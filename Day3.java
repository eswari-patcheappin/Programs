import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt();
        System.out.println();
        for(int j=1;;j++)
        {
            int count=0;
            char S[]=Integer.toBinaryString(j).toCharArray();
            for(int i=0;i<S.length;i++)
            {
                if(S[i]=='1')
                {
                    count++;
                }
            }
            if(count+j==N && count!=0)
            {
                System.out.print("NO");
                return;
            }
            if((count+j)>N)
            {
                break;
            }
        }
        System.out.print("YES");
	}
}
