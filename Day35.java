import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        char S[]=sc.nextLine().toCharArray();
        Map<Integer,String> map = new HashMap<Integer,String>();
        System.out.println();
        map.put(0,"abcdef");
        map.put(1,"bc");
        map.put(2,"abdeg");
        map.put(3,"abcdg");
        map.put(4,"bcfg");
        map.put(5,"acdfg");
        map.put(6,"acdefg");
        map.put(7,"abc");
        map.put(8,"abcdefg");
        map.put(9,"abcdfg");
        char ss[]=map.get(S[0]-'0').toCharArray();
        for(int i=0;i<ss.length;i++)
        {
            System.out.print(ss[i]+" ");
        }
        System.out.println();
        for(int i=0;i<S.length;i++)
        {
            HashSet<Character> set= new HashSet<>();
            if(i!=(S.length)-1)
            {
                int last=i+1;
                char S1[]=map.get(S[i]-'0').toCharArray();
                char S2[]=map.get(S[last]-'0').toCharArray();
                for(int j=0;j<S1.length;j++)
                {
                    if(set.contains(S1[j]))
                    {
                        set.remove(S1[j]);
                    }
                    else
                    {
                        set.add(S1[j]);
                    }
                }
                for(int j=0;j<S2.length;j++)
                {
                    if(set.contains(S2[j]))
                    {
                        set.remove(S2[j]);
                    }
                    else
                    {
                        set.add(S2[j]);
                    }
                }
            }
            else
            {
                char s[]=map.get(S[i]-'0').toCharArray();
                for(int j=0;j<s.length;j++)
                {
                    set.add(s[j]);
                }
            }
            boolean flag=true;
            for(Character esh:set)
            {
                flag=false;
                System.out.print(esh+" ");
            }
            if(flag)
            {
                System.out.print("-1");
            }
            System.out.println();
        }
	}
}
