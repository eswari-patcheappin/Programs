import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day54 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(), arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        int T=sc.nextInt(), start=-1, end=-1;
        for(int i=0;i<N;i++)
        {
            if(arr[i]==T)
            {
                if(start==-1)
                {
                    start=i;
                }
                end=i;
            }
        }
        if(start==end || start==-1 || end==-1)
        {
            System.out.print("-1");
            return;
        }
        ArrayList<Integer>set=new ArrayList<>();
        for(int i=start+1;i<end;i++)
        {
            set.add(arr[i]);
        }
if(set.isEmpty())
{
System.out.print("-1");
return ;
}
        Collections.sort(set);
        for(int esh:set)
        {
            System.out.print(esh+" ");
        }
	}
}
