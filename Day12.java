import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        String S[]=sc.nextLine().split("\\s+"), str[]=new String[S.length];
        int arr[]= new int[S.length];
        System.out.println();
        for(int i=0;i<S.length;i++)
        {
            char C[]=S[i].toCharArray();
            int num=0;
            boolean pre=false, flag=true;
            String ss="";
            for(int j=0;j<C.length;j++)
            {
                if(Character.isDigit(C[j]) && flag)
                {
                    num=(num*10)+(C[j]-'0');
                    pre=true;
                }
                else if(pre && Character.isLetter(C[j]))
                {
                    pre=false;
                    flag=false;
                    ss+=C[j];
                }
                else
                {
                    ss+=C[j];
                }
            }
            str[i]=ss;arr[i]=num;
        }
        for(int i=0;i<S.length;i++)
        {
            for(int j=i+1;j<S.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    String tem=str[i];
                    str[i]=str[j];
                    str[j]=tem;
                }
            }
            System.out.print(str[i]+" ");
        }
	}
}
