import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int R=sc.nextInt(), C=sc.nextInt(), ind=0, row[]=new int[R*C], col[]=new int[R*C];sc.nextLine();
        char mat[][]=new char[R][C], arr[]=new char[R*C];
        System.out.println();
        for(int i=0;i<R;i++)
        {
            String S[]=sc.nextLine().split("\\s+");
            for(int j=0;j<C;j++)
            {
                mat[i][j]=S[j].charAt(0);
                if((i+1)%3==0 && (j+1)%3==0)
                {
                    arr[ind]=mat[i-1][j-1];
                    row[ind]=i-1;
                    col[ind++]=j-1;
                }
            }
        }
        for(int i=0;i<ind-1;i++)
        {
            for(int j=0;j<ind-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    int tem=row[j];
                    row[j]=row[j+1];
                    row[j+1]=tem;
                    tem=col[j];
                    col[j]=col[j+1];
                    col[j+1]=tem;
                }
            }
        }
        int num=0, esh=C/3;
        while(num<ind)
        {
            for(int k=num;k<num+esh;k++)
            {
                System.out.print(mat[row[k]-1][col[k]-1]+" "+mat[row[k]-1][col[k]]+" "+mat[row[k]-1][col[k]+1]+" ");
            }
            System.out.println();
            for(int k=num;k<num+esh;k++)
            {
                System.out.print(mat[row[k]][col[k]-1]+" "+mat[row[k]][col[k]]+" "+mat[row[k]][col[k]+1]+" ");
            }
            System.out.println();
            for(int k=num;k<num+esh;k++)
            {
                System.out.print(mat[row[k]+1][col[k]-1]+" "+mat[row[k]+1][col[k]]+" "+mat[row[k]+1][col[k]+1]+" ");
            }
            System.out.println();
            num+=esh;
        }
	}
}
