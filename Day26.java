import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt();
        sc.nextLine();
        String name[]=new String[N];
        int aca[]=new int[N], sport[]=new int[N], ind=0;
        System.out.println();
        for(int i=0;i<N;i++)
        {
            String S[]=sc.nextLine().split(" ");
            int n1=Integer.parseInt(S[1]), n2=Integer.parseInt(S[2]);
            if(n1>=3 && n2>=8)
            {
                name[ind]=S[0];
                aca[ind]=n1;sport[ind++]=n2;
            }
        }
        if(ind==0)
        {
            System.out.println("-1");
            return ;
        }
        for(int i=0;i<ind-1;i++)
        {
            for(int j=0;j<ind-i-1;j++)
            {
                if(name[j].compareTo(name[j+1])>0)
                {
                    String temp=name[j];
                    name[j]=name[j+1];
                    name[j+1]=temp;
                    int tem=aca[j];
                    aca[j]=aca[j+1];
                    aca[j+1]=tem;
                    tem=sport[j];
                    sport[j]=sport[j+1];
                    sport[j+1]=tem;
                }
            }
        }
        for(int i=0;i<ind-1;i++)
        {
            for(int j=0;j<ind-i-1;j++)
            {
                if(aca[j]<aca[j+1])
                {
                    int temp=aca[j];
                    aca[j]=aca[j+1];
                    aca[j+1]=temp;
                    temp=sport[j];
                    sport[j]=sport[j+1];
                    sport[j+1]=temp;
                    String tem=name[j];
                    name[j]=name[j+1];
                    name[j+1]=tem;
                }
                if(aca[j]==aca[j+1])
                {
                    if(sport[j]<sport[j+1])
                    {
                        int temp=aca[j];
                        aca[j]=aca[j+1];
                        aca[j+1]=temp;
                        temp=sport[j];
                        sport[j]=sport[j+1];
                        sport[j+1]=temp;
                        String tem=name[j];
                        name[j]=name[j+1];
                        name[j+1]=tem;
                    }
                }
            }
        }
        for(int i=0;i<ind;i++)
        {
            System.out.println(name[i]);
        }
	}
}
