public class Day31 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt();
        boolean flag[]=new boolean[N+1];
        for(int i=2;i<=N;i++)
        {
            flag[i]=true;
        }
        for(int i=2;i*i<=N;i++)
        {
            if(flag[i])
            {
                for(int j=i*i;j<=N;j+=i)
                {
                    flag[j]=false;
                }
            }
        }
        int arr[]=new int[N+1],ind=0;
        for(int i=2;i<=N;i++)
        {
            if(flag[i])
            {
                arr[ind++]=i;
            }
        }
        for(int i=0;i<ind;i++)
        {
            for(int j=i+1;j<ind;j++)
            {
                if(Math.abs(arr[i]-arr[j])==6)
                {
                    System.out.println(arr[i]+" "+arr[j]);
                    break;
                }
                if(Math.abs(arr[i]-arr[j])>6)
                {
                    break;
                }
            }
        }
    }
}
