import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int R=sc.nextInt(), C=sc.nextInt(), mat[][]=new int[R][C];
        System.out.println();
        for(int i=0;i<R;i++)
        {
            boolean pre=true;
            int arr[]=new int[R*C], ind=0;
            for(int j=0;j<C;j++)
            {
                mat[i][j]=sc.nextInt();
                int num1=mat[i][j], num2=-1;
                if(j!=0)
                {
                    num2=mat[i][j-1];
                }
                int n1=num1,n2=num2;
                boolean flag=true;
                if(j!=0){
                    while(num2!=0)
                    {
                        int temp=num2;
                        num2=num1%num2;
                        num1=temp;
                    }
                    if(num1==1)
                    {
                        pre=false;
 arr[ind++]=n2;
arr[ind++]=n1;
                    }
                }
            }
            if(pre)
            {
                System.out.print("-1");
            }
            else{
for(int j=0;j<ind-1;j++)
{
if(arr[j]==arr[j+1])
{
for(int k=j;k<ind-1;k++)
{
arr[k]=arr[k+1];
}
ind--;
}
for(int j=0;j<ind;j++)
{
System.out.print(arr[j]+" ");
}
}
                          }
            System.out.println();
        }
	}
}
