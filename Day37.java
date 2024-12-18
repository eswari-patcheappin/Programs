public class Day37 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(), arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        int B=sc.nextInt(),val[]=new int[B];
        for(int i=1,j=0;i<=B;i++,j++)
        {
            val[j]=i;
        }
        System.out.println();
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<B;j++)
            {
                if(arr[i]==val[j])
                {
                    System.out.print((j+1)+" ");
                    int temp=val[j];
                    for(int k=j;k>=1;k--)
                    {
                        val[k]=val[k-1];
                    }
                    val[0]=temp;
                }
            }
        }
	}
}
