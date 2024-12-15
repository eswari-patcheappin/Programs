import java.util.Scanner;

public class Day32 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(), R=sc.nextInt(), A=64;
        System.out.println();
        for(int i=1;i<=R;i++)
        {
            char val=(char)(A+N);
            for(int j=1;j<=i;j++)
            {
                System.out.print(val+" ");
                if(val!='Z')
                {
                    val++;
                }
                else
                {
                    val='A';
                }
            }
            System.out.println();
        }
	}
}
