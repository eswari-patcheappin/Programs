import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int X=sc.nextInt(), Y=sc.nextInt(), Z=sc.nextInt();
        System.out.println();
        int min1=Math.min(X,Y), min2=Math.min(Y,Z), max1=Math.max(X,Y), max2=Math.max(Y,Z);
        ArrayList<Integer>set=new ArrayList<Integer>();
        for(int i=1;i<=min1;i++)
        {
            if(X%i==0 && Y%i==0)
            {
                set.add(i);
            }
        }
        for(int i=1;i<=min2;i++)
        {
            if(Y%i==0 && Z%i==0)
            {
                set.add(i);
            }
        }
        Collections.sort(set,Collections.reverseOrder());
        for(int esh:set)
        {
            System.out.print(esh+" ");
        }
	}
}
