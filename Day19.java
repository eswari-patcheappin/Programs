public class Day19 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(), count=0;
        char  S[]=Integer.toBinaryString(N).toCharArray();
        for(int i=0;i<S.length;i++)
        {
            if(S[i]=='1')
            {
                count++;
            }
        }
        System.out.println();
        for(int i=N+1;;i++)
        {
            char C[]=Integer.toBinaryString(i).toCharArray();
            int one=0;
            for(int j=0;j<C.length;j++)
            {
                if(C[j]=='1')
                {
                    one++;
                }
            }
            if(one==count)
            {
                System.out.print(i);
                break;
            }
        }
	}
}
