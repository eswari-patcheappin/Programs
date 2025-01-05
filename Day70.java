import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Day70 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int X=sc.nextInt(), Y=sc.nextInt(), N=sc.nextInt();
        BigDecimal x=new BigDecimal(X);
        BigDecimal y=new BigDecimal(Y);
        BigDecimal res=x.divide(y,N+1,RoundingMode.FLOOR);
        String val=res.toPlainString().split("\\.")[1];
        int Num=(val.charAt(N-1))-'0';
        System.out.print("\n"+Num);
	}
}
