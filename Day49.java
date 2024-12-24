public class Day49 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt();sc.nextLine();
        long arr[]=new long[N];
        char S[]=new char [N];
        System.out.println();
        for(int i=0;i<N;i++)
        {
            char C[]=sc.next().toCharArray();
            long num=0;
            char alp='-';
            for(int j=0;j<C.length;j++)
            {
                if(Character.isDigit(C[j]))
                {
                    num=(num*10)+(C[j]-'0');
                }
                else
                {
                    alp=C[j];
                }
            }
            arr[i]=num;S[i]=alp;
        }
        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                if(S[i]>S[j])
                {
                    char temp=S[i];
                    S[i]=S[j];
                    S[j]=temp;
                    long tem=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                }
                if(S[i]==S[j])
                {
                    if(arr[i]>arr[j])
                    {
                        long temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            System.out.print(arr[i]+" ");
        }
	}
}
