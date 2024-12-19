import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int n1=sc.nextInt(), n2=sc.nextInt();
        String X=Integer.toBinaryString(n1), Y=Integer.toBinaryString(n2);
        String S1=X+Y,S2=Y+X;
        int dec1=Integer.parseInt(S1,2), dec2=Integer.parseInt(S2,2);
        System.out.println(Math.max(dec1,dec2));
	}
}
