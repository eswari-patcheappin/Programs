public class Day39 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt();
        HashSet<Integer>set=new HashSet<>();
        long sum=0;
        boolean flag=false;
        for(int i=0;i<N;i++)
        {
            int num=sc.nextInt();
            char S[]=Integer.toString(num).toCharArray();
            boolean pre=true;
            for(int j=0;j<S.length;j++)
            {
                if(!set.contains(S[j]-'0'))
                {
                    pre=false;
                }
                set.add(S[j]-'0');
            }
            if(pre)
            {
                sum+=num;
                flag=true;
            }
        }
        System.out.println(flag?sum:-1);
	}
}
