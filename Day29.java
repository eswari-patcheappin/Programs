import java.util.Scanner;

public class Day29 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        String S=sc.nextLine();
        char s[]={'a','b','c','d','e'}, str[]=S.toCharArray();
        System.out.println();
        boolean flag=true;
        while(true)
        {
            int ind=0,count=0,val=0;
            for(int j=0;j<str.length;j++)
            {
                if(str[j]==s[ind])
                {
                    if(ind<s.length-1)
                    {
                        ind++;
                    }
                    else
                    {
                        str[j]='.';
                        count++;
                        break;
                    }
                    str[j]='.';
                    count++;
                }
            }
            if(count!=5)
            {
                if(count!=0)
                {
                    flag=false;
                }
                break;
            }
        }
        if(flag)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}
