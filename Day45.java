import java.util.LinkedHashSet;
import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt();sc.nextLine();
        int arr[]=new int[N], ind=0;
        String S[]=new String [N];
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        for(int i=0;i<N;i++)
        {
            S[i]=sc.next();
            arr[i]=sc.nextInt();
            sc.nextLine();
        }
        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    String tem=S[i];
                    S[i]=S[j];
                    S[j]=tem;
                }
                if(arr[i]==arr[j] && (S[i].compareTo(S[j])>0))
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    String tem=S[i];
                    S[i]=S[j];
                    S[j]=tem;
                }
            }
            set.add(arr[i]);
        }
        System.out.println();
        for(int num:set)
        {
            System.out.print(num+" ");
            boolean flag=true;
            for(int j=0;j<N;j++)
            {
                if(num==arr[j])
                {
                    if(flag)
                    {
                        System.out.print(S[j]);
                        flag=false;
                    }
                    else
                    {
                        System.out.print(", "+S[j]);
                    }
                }
            }
            System.out.println();
        }
	}
}
