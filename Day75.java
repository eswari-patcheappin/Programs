public class Day75 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        String S[]=sc.nextLine().split("\\s+");
        HashSet<Character>set=new HashSet<>();
        System.out.println();
        for(int i=0;i<S.length;i++)
        {
            set.add(S[i].charAt(0));
        }
        ArrayList<Character>val=new ArrayList<>(set);
        Collections.sort(val);
        int max=Integer. MIN_VALUE;
        for(char esh:val)
        {
            String es=esh+"";
            int count=0;
            for(int i=0;i<S.length;i++)
            {
                int num=S[i].indexOf(es);if(num==0)
                {
                  count++;  
                }
            }
            if(count>max)
            {
                max=count;
            }
        }
        int len=S[0].length();
        for(int i=0;i<max;i++)
        {
            for(char esh:val)
            {
                boolean flag =true;
                for(int j=0;j<S.length;j++)
                {
                    char C=S[j].charAt(0);
                    if(esh==C)
                    {
                        System.out.print(S[j]);
                        S[j]=".";
                        flag=false;
                        break;
                    }
                }
                if(flag)
                {
                    for(int j=0;j<len;j++)
                    {
                       System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
	}
}
