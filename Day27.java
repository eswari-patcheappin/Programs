import java.util.HashMap;
import java.util.Scanner;

public class Day27 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt();
        HashMap<String,Integer> map=new HashMap<>();
        System.out.println();
        for(int i=0;i<N;i++)
        {
            int val=sc.nextInt();
            int count=map.containsKey(""+val)?map.get(""+val):0;
            map.put(""+val,count+1);
            int num=map.get(""+val);
            if(num==val)
            {
                System.out.print(val);
                break;
            }
            else
            {
                System.out.print(val+" ");
            }
        }
	}
}
