public class Day63 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        long N=sc.nextLong(), T=sc.nextLong(), K=sc.nextLong();
        long len=Long.toString(N).length();
        System.out.println();
        long res=N;
        for(int i=1;i<=T;i++)
        {
            long pos=(K*i-1)%len;
            long val=(int)Math.pow(10,len-pos-1);
            res+=val;
        }
        System.out.print(res);
	}
}
