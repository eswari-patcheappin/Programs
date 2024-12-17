import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        char S[]=sc.nextLine().toCharArray();
        int len=S.length, arr[]=new int[len];
        System.out.println();
        for(int i=0;i<len;i++)
        {
            int num=sc.nextInt();
            for(int j=0;j<=i;j++)
            {
                int temp=num;
                while(temp>0)
                {
                    if(S[j]=='z')
                    {
                        S[j]='a';
                    }
                    else if(S[j]=='Z')
                    {
                        S[j]='A';
                    }
                    else
                    {
                        S[j]++;
                    }
                    temp--;
                }
                if(i==(len-1))
                {
                    System.out.print(S[j]);
                }
            }
        }
	}
}
