import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt();
        sc.nextLine();
        String S[]=new String[N], S1[]=new String[N], S2[]=new String[N];
        System.out.println();
        for(int i=0;i<N;i++)
        {
            String s=sc.nextLine();
            S[i]=s;
            String str[]=s.split("\\.");
            S1[i]=str[0];
            S2[i]=str[1];
        }
        String C=sc.next();
        if(C.equalsIgnoreCase("N"))
        {
            for(int i=0;i<N-1;i++)
            {
                for(int j=0;j<N-i-1;j++)
                {
                    if(S1[j].compareTo(S1[j+1])>0)
                    {
                        String temp=S1[j];
                        S1[j]=S1[j+1];
                        S1[j+1]=temp;
                        temp=S[j];
                        S[j]=S[j+1];
                        S[j+1]=temp;
                    }
                }
            }
        }
        else
        {
            for(int i=0;i<N-1;i++)
            {
                for(int j=0;j<N-i-1;j++)
                {
                    if(S2[j].compareTo(S2[j+1])>0)
                    {
                        String temp=S2[j];
                        S2[j]=S2[j+1];
                        S2[j+1]=temp;
                        temp=S[j];
                        S[j]=S[j+1];
                        S[j+1]=temp;
                    }    
                }
            }
        }
        for(int i=0;i<N;i++)
        {
            System.out.println(S[i]);
        }
	}
}
