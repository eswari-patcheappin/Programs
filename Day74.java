import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        String s1=sc.nextLine(), s2=sc.nextLine();
        char S1[]=s1.toCharArray(), S2[]=s2.toCharArray();
        int min=S1.length<=S2.length?S1.length:S2.length, ind=0;
        char arr1[]=new char [min], arr2[]=new char [min];
        if(s1.equals(s2))
        {
            System.out.print("YES");
            return ;
        }
        System.out.println();
        for(int i=0;i<min;i++)
        {
            if(S1[i]!=S2[i])
            {
                arr1[ind]=S1[i];
                arr2[ind++]=S2[i];
            }
        }
        if(ind==2)
        {
            char num1=arr1[0], num2=arr2[0], num3=arr1[1], num4=arr2[1];
            if(num1==num4 && num2==num3)
            {
                System.out.print("YES");
            }
            else
            {
                System.out.print("NO");
            }
        }
        else
        {
            System.out.print("NO");
        }
	}
}
