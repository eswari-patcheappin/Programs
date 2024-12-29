import java.util.HashSet;
import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(), arr[]=new int[N], val[]=new int[N], ind=0, temp[]=new int[N];
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
            int num=arr[i], sum=0;
            while(num>0)
            {
                sum+=num%10;
                num/=10;
            }
            temp[i]=sum;
            if(set.contains(sum))
            {
                val[ind++]=sum;
            }
            set.add(sum);
        }
        for(int i=0;i<ind;i++)
        {
            for(int j=i+1;j<ind;j++)
            {
                if(val[i]==val[j])
                {
                    for(int k=j;k<ind-1;k++)
                    {
                        val[k]=val[k+1];
                    }
                    ind--;j--;
                }
            }
        }
        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                if(arr[i]<arr[j])
                {
                    int tem=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                    tem=temp[i];
                    temp[i]=temp[j];
                    temp[j]=tem;
                }
            }
        }
        if(ind==0)
        {
            System.out.print("-1");
            return;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ind;i++)
        {
            int sum=0,count=0;
            for(int j=0;j<N;j++)
            {
                if(val[i]==temp[j])
                {
                    count++;
                    sum+=arr[j];
                }
                if(count==2)
                {
                    break;
                }
            }
            if(sum>max)
            {
                max=sum;
            }
        }
        System.out.print(max);
	}
}
