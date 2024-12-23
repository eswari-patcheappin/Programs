public class Day47 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        char S[]=sc.nextLine().toCharArray();
        int ind=-1;
        for(int j=S.length-2;j>=0;j--)
        {
            if(S[j]==S[S.length-1])
            {
                ind=j;
                break;
            }
        }
        System.out.println();
        if(ind==-1)
        {
            System.out.print(ind);
        }
        else
        {
            for(int i=ind;i<S.length;i++)
            {
                System.out.print(S[i]);
            }
        }
	}
}
