import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        String s=sc.nextLine();
        char S[]=s.toCharArray();
        int N=sc.nextInt();sc.nextLine();
        System.out.println();
        for(int i=0;i<N;i++)
        {
            String str=sc.nextLine();
            int max=Math.min(s.length(),str.length()), ind=0;
            for(int j=1;j<=max;j++)
            {
                if(s.substring(s.length()-j).equals(str.substring(0,j)))
                {
                    ind=j;
                }
            }
            if(ind>0)
            {
                System.out.println(s+str.substring(ind));
            }
            else
            {
                System.out.println("-1");
            }
        }
	}
}
