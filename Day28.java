import java.util.HashSet;
import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(), ind=0, temp[]=new int[N], val=0;
        sc.nextLine();
        HashSet<String> set = new HashSet<String>(), pre=new HashSet<String>();
        String S1[]=new String[N], S2[]=new String[N];
        for(int i=0;i<N;i++)
        {
            String s1=sc.next(),s2=sc.next();
            S2[i]=s2;
            if(pre.contains(s1))
            {
                continue;
            }
            else
            {
                S2[val++]=s2;
                set.add(s2);
                pre.add(s1);
            }
        }
        for(String esh: set)
        {
            int count=0;
            for(int j=0;j<val;j++)
            {
                if(esh.equals(S2[j]))
                {
                    count++;
                }
            }
            S1[ind]=esh;temp[ind++]=count;
        }
        for(int i=0;i<ind-1;i++)
        {
            for(int j=0;j<ind-i-1;j++)
            {
                char c1=S1[j].charAt(0), c2=S1[j+1].charAt(0);
                if(c1>c2)
                {
                    String tem=S1[j];
                    S1[j]=S1[j+1];
                    S1[j+1]=tem;
                    int te=temp[j];
                    temp[j]=temp[j+1];
                    temp[j+1]=te;
                }
            }
        }
        for(int i=0;i<ind-1;i++)
        {
            for(int j=0;j<ind-i-1;j++)
            {
                if(temp[j]<temp[j+1])
                {
                    int tem=temp[j];
                    temp[j]=temp[j+1];
                    temp[j+1]=tem;
                    String te=S1[j];
                    S1[j]=S1[j+1];
                    S1[j+1]=te;
                }
            }
        }
        System.out.println(ind);
        for(int i=0;i<ind;i++)
        {
            System.out.println(S1[i]+" "+temp[i]);
        }
	}
}
