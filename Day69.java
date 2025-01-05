public class Day69 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        String s=sc.nextLine(), k=sc.nextLine();
        char S[]=s.toCharArray(), K[]=k.toCharArray(), tempK[]=k.toCharArray();
        Arrays.sort(tempK);
        int arr[]=new int[S.length], ind=0;
        for(int i=0;i<K.length;i++)
        {
            for(int j=0;j<tempK.length;j++)
            {
                if(K[i]==tempK[j])
                {
                    arr[ind++]=(j+1);
                }
            }
        }
        int count=0,val=0;
        int array[]=new int[S.length];
        for(int i=0;i<S.length;i++)
        {
            if(count<ind)
            {
                array[val++]=arr[count++];
            }
            else
            {
                count=0;
                array[val++]=arr[count++];
            }
        }
        for(int i=0;i<val-1;i++)
        {
            for(int j=0;j<val-i-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    char tem=S[j];
                    S[j]=S[j+1];
                    S[j+1]=tem;
                }
            }
        }
        System.out.println();
        for(int i=0;i<val;i++)
        {
            System.out.print(S[i]);
        }
	}
}
