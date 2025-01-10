import java.util.Scanner;

public class Day82 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt(), arr[]=new int[N];
        System.out.println();
        boolean pre=true;
        for(int i=0;i<N;i++)
        {
            int num=sc.nextInt();
            char S[]=Integer.toBinaryString(num).toCharArray();
            int left=0, right=S.length-1;
            boolean flag=true;
            while(left<right)
            {
                if(S[left]!=S[right])
                {
                    flag=false;
                    break;
                }
                left++;right--;
            }
            if(flag)
            {
                pre=false;
                System.out.print(num+" ");
            }
        }
        if(pre)
        {
            System.out.print("-1");
        }
	}
}
