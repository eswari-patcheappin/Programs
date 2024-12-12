import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        char S[]=sc.nextLine().toCharArray();
        System.out.println();
        int len=S.length;
        while(true)
        {
            boolean flag=true;
            for(int i=0;i<len-1;i++)
            {
                String S1=Character.toString(S[i]), S2=Character.toString(S[i+1]);
                if( (S1.equalsIgnoreCase(S2)) && ((Character.isLowerCase(S[i]) && Character.isUpperCase(S[i+1])) || (Character.isUpperCase(S[i]) && Character.isLowerCase(S[i+1])) ))
                {
                    int count=0;
                    flag=false;
                    while(count<2)
                    {
                        for(int j=i;j<len-1;j++)
                        {
                            S[j]=S[j+1];
                        }
                        len--;
                        count++;
                    }
                }
            }
            if(flag)
            {
                break;
            }
        }
        if(len==0)
        {
            System.out.print("-1");
            return;
        }
        for(int i=0;i<len;i++)
        {
            System.out.print(S[i]);
        }
	}
}
