import java.util.ArrayList;
import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(), K=sc.nextInt(), len=Integer.toString(K).length();
        String str=Integer.toString(K);
        System.out.println();
        ArrayList<Character>set=new ArrayList<>();
        for(int i=0;i<=N;i++)
        {
            char C[]=Integer.toString(i).toCharArray();
            for(int j=0;j<C.length;j++)
            {
                set.add(C[j]);
            }
        }
        int start=0, end=len;
        while(end<set.size())
        {
            String S="";
            for(int i=start;i<end;i++)
            {
                S+=set.get(i);
            }
            if(S.equals(str))
            {
                for(int i=start;i<end;i++)
                {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            start++;end++;
        }
	}
}
