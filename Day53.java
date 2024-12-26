import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        char S[]=sc.nextLine().toCharArray();
        int N=sc.nextInt();sc.nextLine();
        System.out.println();
        for(int i=0;i<N;i++)
        {
            char str[]=sc.nextLine().toCharArray();
            ArrayList<Integer>set=new ArrayList<>();
            if(S.length!=str.length)
            {
                System.out.println("NO");
                continue;
            }
            for(int j=0;j<S.length;j++)
            {
                if(S[j]!=str[j])
                {
                    set.add(j);
                }
            }
            if(set.size()==0)
            {
                HashSet<Character>val=new HashSet<>();
                boolean flag=false;
                for(int j=0;j<str.length;j++)
                {
                    if(val.contains(str[j]))
                    {
                        flag=true;
                        break;
                    }
                    val.add(str[j]);
                }
                if(flag)
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
            }
            else if(set.size()==2)
            {
                int num1=set.get(0),num2=set.get(1);
                if(S[num1]==str[num2] && S[num2]==str[num1])
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
            }
            else
            {
                System.out.println("NO");
            }
        }
	}
}
