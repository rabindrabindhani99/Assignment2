import java.util.Scanner;

public class Assignment2_1_v
{
    public static void main(String[] args)
    {
        long n,r,sum_e=0,sum_o=0;
        float avg_e,avg_o,diff,count_e=0,count_o=0;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=scan.nextLong();
        while(n>0)
        {
            r=n%10;
            if(r%2==0 && r%4!=0 || r==0)
            {
                sum_e+=r;
                count_e++;
            }
            if(r%2!=0 && r%3!=0)
            {
                sum_o+=r;
                count_o++;
            }
            n=n/10;
        }
        System.out.println("================================");
        avg_e=sum_e/count_e;
        avg_o=sum_o/count_o;
        System.out.println("Avg e: "+avg_e);
        System.out.println("Avg o: "+avg_o);
        diff=avg_e-avg_o;
        System.out.println("Difference: "+diff);
    }
}
