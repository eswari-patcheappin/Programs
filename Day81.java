public class Day81 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        char mat[][]=new char[5][5];
        System.out.println();
        for(int i=0;i<5;i++)
        {
            String S[]=sc.nextLine().split("\\s+");
            for(int j=0;j<S.length;j++)
            {
                mat[i][j]=S[j].charAt(0);
            }
        }
        char S[]=sc.nextLine().toCharArray();
        for(int i=0;i<S.length-1;i++)
        {
            if(S[i]!=' ')
            {
                System.out.print(mat[(S[i]-'0')-1][(S[i+1]-'0')-1]+"");
                i++;
            }
            else
            {
                System.out.print(" ");
            }
        }
	}
}
