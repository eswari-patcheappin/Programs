import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        String S=sc.nextLine();
        char C[]=S.toCharArray();
        long N=0;
        for(int i=0;i<C.length;i++)
        {
            N+=(C[i]-'0');
        }
        long num=Long.parseLong(S),num1=num-1,num2=num+1;
        if(num%N!=0)
        {
            System.out.print("-1");
            return;
        }
        while(true)
        {
            String s=Long.toString(num1);
            char c[]=s.toCharArray();
            long n=0;
            for(int i=0;i<c.length;i++)
            {
                n+=(c[i]-'0');
            }
            if(num1==0 || num1%n!=0)
            {
                num1++;
                break;
            }
            num1--;
        }
        num1=(num1==0)?1:num1;
        while(true)
        {
            String s=Long.toString(num2);
            char c[]=s.toCharArray();
            long n=0;
            for(int i=0;i<c.length;i++)
            {
                n+=(c[i]-'0');
            }
            if(num2%n==0)
            {
                num2++;
            }
            else
            {
                num2--;
                break;
            }
        }
        if(num1==num && num2==num)
        {
            System.out.print("-1");
            sc.close();
            return;
        }
        long cc=0,cs=0;
        for(long i=num1;i<=num2;i++)
        {
            cs++;
            if(i==num)
            {
                cc=cs;
            }
        }
        System.out.print(cs+" "+cc);
	}
}
