public class Day59 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        String s=sc.nextLine();
        char S[]=s.toCharArray(), temp[]=s.toLowerCase().toCharArray();
        System.out.println();
        int past=-1;
        boolean flag=true;
        for(int i=0;i<S.length;i++)
        {
            if((S[i]>='a' && S[i]<='z') || (S[i]>='A' && S[i]<='Z'))
            {
                if(flag)
                {
                    past=i;
                    System.out.print(S[i]);
                    flag=false;
                }
                else
                {
                    int num=(temp[past]-'a')+1;
                    past=i;
                    char c=temp[i];
                    while(num>0)
                    {
                        if(c<'z')
                        {
                            c++;
                        }
                        else
                        {
                            c='a';
                        }
                        num--;
                    }
                    if(Character.isUpperCase(S[i]))
                    {
                        S[i]=Character.toUpperCase(c);
                    }
                    else
                    {
                        S[i]=c;
                    }
                    System.out.print(S[i]);
                }
            }
            else
            {
                System.out.print(S[i]);
            }
        }
	}
}
