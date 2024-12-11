import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        char S[]=sc.nextLine().toCharArray();
        System.out.println();
        int max=Integer.MIN_VALUE;
        String s1="",s2="";
        for(int i=0;i<S.length-1;i++)
        {
            String S1="", S2="";
            int count1=0, count2=0;
            for(int j=0;j<=i;j++)
            {
                if(S[j]=='0')
                {
                    count1++;
                }
                S1+=S[j];
            }
            for(int j=i+1;j<S.length;j++)
            {
                if(S[j]=='1')
                {
                    count2++;
                }
                S2+=S[j];
            }
            int num=Integer.parseInt(count1+""+count2);
            if(num>max)
            {
                max=num;
                s1=S1;s2=S2;
            }
        }
        sc.close();
        System.out.print(s1+" "+s2);
	}
}
