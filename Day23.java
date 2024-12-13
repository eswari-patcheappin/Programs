import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        String D[]=sc.nextLine().split("-");
        int day=Integer.parseInt(D[0]), month=Integer.parseInt(D[1]), year=Integer.parseInt(D[2]), dayCount[]={31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println();
        if(year%100==0 && year%400!=0)
        {
            
        }
        else if(year%4==0 || year%400==0)
        {
            dayCount[1]=29;
        }
        month--;
        int days=day+1;
        for(int i=1;i<=days;i++)
        {
            if(i<=day || days<=dayCount[month])
            {
                System.out.printf("%02d-%02d-%04d\n",i,month+1,year);
            }
            else 
            {
                if(days>dayCount[month])
                {
                    days=1;
                    if(month!=11)
                    {
                        days=1;
                        month++;
                    }
                    else
                    {
                        month=0;year++;
                    }
                }
                System.out.printf("%02d-%02d-%04d",days,month+1,year);
            }
        }
	}
}
