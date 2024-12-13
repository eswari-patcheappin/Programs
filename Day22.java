import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt();
        char S[]=Integer.toHexString(N).toUpperCase().toCharArray();
        System.out.println();
        for(int i=0;i<S.length;i++)
        {
            if(S[i]=='0')
            {
                S[i]='O';
            }
            else if(S[i]=='1')
            {
                S[i]='L';
            }
            else if(S[i]!='A' && S[i]!='B' && S[i]!='C' && S[i]!='D' && S[i]!='E' && S[i]!='F' && S[i]!='O' && S[i]!='L')
            {
                System.out.print("-1");
                return;
            }
        }
        String str=new String(S);
        System.out.print(str);
	}
}
