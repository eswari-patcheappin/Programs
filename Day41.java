public class Day41 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        System.out.println();
        String S[]=new String[12];
        double N[]=new double[12];
        for(int i=0;i<12;i++)
        {
            S[i]=sc.next();
            N[i]=sc.nextDouble();
            sc.nextLine();
        }
        for(int i=0;i<12-1;i++)
        {
            for(int j=0;j<12-1-i;j++)
            {
                if(N[j]<N[j+1])
                {
                    double temp=N[j];
                    N[j]=N[j+1];
                    N[j+1]=temp;
                    String tem=S[j];
                    S[j]=S[j+1];
                    S[j+1]=tem;
                }
            }
        }
        for(int i=0;i<6;i++)
        {
            System.out.println(S[i]+" "+N[i]);
        }
	}
}
