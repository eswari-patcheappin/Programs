public class Day55 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        char S[]=sc.nextLine().toCharArray();
        int len=S.length, perfect=(int)Math.sqrt(len);
        System.out.println();
        int start=1,ind=0;
        while(true)
        {
            int num=(perfect-start), count=0, val=0;
            start+=2;
            String str="";
            String string[]=new String [4];
            for(int i=ind;i<S.length;i++)
            {
                count++;
                if(count<=num)
                {
                    str+=S[i];
                }
                else
                {
                    string[val]=str;
                    str="";
                    val++;
                    str+=S[i];
                    count=0;
                    count++;
                }
                if(val==4)
                {
                    ind=i;
                    break;
                }
            }
            if(num==1)
            {
                string[val++]=str;
            }
            char ss[]=string[0].toCharArray();
            for(int i=0;i<ss.length;i++)
            {
                System.out.print(string[0].charAt(i)+""+string[1].charAt(i)+""+string[2].charAt(i)+""+string[3].charAt(i));
            }
            if(num==1 || ind==S.length-1)
            {
                break;
            }
        }
        if(perfect%2!=0)
        {
            System.out.print(S[S.length-1]);
        }
	}
}
