public class Day46 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        String vowel[]={"aeiou", "aeio", "aeiu", "aeou", "aiou", "eiou", "aei", "aeo", "aeu", "aio", "aiu", "aou", "eio", "eou", "iou", "ae", "ai", "ao", "au", "ei", "eo", "eu", "io", "iu", "ou", "a", "e", "i", "o", "u"};
        int N=sc.nextInt(), ind=0, arr[]=new int[N];sc.nextLine();
        String S[]=new String[N], S1[]=new String[N], S2[]=new String[N];
        System.out.println();
        for(int i=0;i<N;i++)
        {
            String str=sc.nextLine(),s="";
            char C[]=str.toCharArray();
            for(int j=0;j<C.length;j++)
            {
                if(isVowel(C[j]))
                {
                    C[j]=Character.toLowerCase(C[j]);
                    s+=C[j];
                }
            }
            if(s.equals(""))
            {
                arr[ind]=0;
                S1[ind]="No vowels";
                S2[ind++]=str;
            }
            else
            {
                char temp[]=s.toCharArray();
                Arrays.sort(temp);
                String string=String.valueOf(temp);
                for(int j=0;j<vowel.length;j++)
                {
                    if(string.contains(vowel[j]))
                    {
                        arr[ind]=vowel[j].length();
                        S1[ind]=vowel[j];S2[ind++]=str;
                       break;
                    }
                }
            }
        }
        LinkedHashSet<String>set=new LinkedHashSet<>();
        for(int i=0;i<ind;i++)
        {
            for(int j=i+1;j<ind;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    String tem=S1[i];
                    S1[i]=S1[j];
                    S1[j]=tem;
                    tem=S2[i];
                    S2[i]=S2[j];
                    S2[j]=tem;
                }
                if(S1[i].compareTo(S1[j])>0)
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    String tem=S1[i];
                    S1[i]=S1[j];
                    S1[j]=tem;
                    tem=S2[i];
                    S2[i]=S2[j];
                    S2[j]=tem;
                }
            }
            set.add(S1[i]);
        }
        for(String val:set)
        {
            System.out.print(val+" - ");
            boolean flag=true;
            for(int j=0;j<ind;j++)
            {
                if(val.equals(S1[j]))
                {
                    if(flag)
                    {
                        System.out.print(S2[j]);
                        flag=false;
                    }
                    else
                    {
                        System.out.print(", "+S2[j]);
                    }
                }
            }
            System.out.println();
        }
	}
	public static boolean isVowel(char C)
	{
	    C=Character.toLowerCase(C);
	    return (C=='a' || C=='e' || C=='i' || C=='o' || C=='u');
	}
