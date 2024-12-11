import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        char S[]=sc.nextLine().toCharArray();
        int len=S.length;
        while(len>0)
        {
            HashSet<Character>set=new HashSet<>();
            for(int i=0;i<len;i++)
            {
                set.add(S[i]);
            }
            ArrayList<Character> list=new ArrayList<>(set);
            Collections.sort(list);
            for(Character i:list)
            {
                System.out.print(i);
                for(int j=0;j<len;j++)
                {
                    if(S[j]==i)
                    {
                        for(int k=j;k<len-1;k++)
                        {
                            S[k]=S[k+1];
                        }
                        len--;break;
                    }
                }
            }
        }
        sc.close();
	}
}
