import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int arr1[]=new int[3], arr2[]=new int[3];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i==0)
                {
                    arr1[j]=sc.nextInt();
                }
                else
                {
                    arr2[j]=sc.nextInt();
                }
            }
        }
        int N=sc.nextInt(), arr[]=new int[N];
        int eB=0,eF=0,yB=0,yF=0;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)
            {
                if(arr[i]>0)
                {
                    eB++;
                }
                else
                {
                    eF++;
                }
            }
            else
            {
                if(arr[i]>0)
                {
                    yB++;
                }
                else
                {
                    yF++;
                }
            }
        }
        double eCash=(double)arr1[0]/(eB+eF), eGold=(double)arr1[1]/eF, eLand=(double)arr1[2]/eB ,yCash=(double)arr2[0]/(yB+yF), yGold=(double)arr2[1]/yF, yLand=(double)arr2[2]/yB,  dummy=0.0;
        System.out.println();
        for(int i=0;i<N;i++)
        {
            System.out.print(arr[i]+" ");
            if(arr[i]%2==0)
            {
                if(arr[i]>0)
                {
                    System.out.printf("%.2f %.2f %.2f\n",eCash,dummy,eLand);
                }
                else
                {
                    System.out.printf("%.2f %.2f %.2f\n",eCash,eGold,dummy);
                }
            }
            else
            {
                if(arr[i]>0)
                {
                    System.out.printf("%.2f %.2f %.2f\n",yCash,dummy,yLand);
                }
                else
                {
                    System.out.printf("%.2f %.2f %.2f\n",yCash,yGold,dummy);
                }
            }
        }
        
	}
}
