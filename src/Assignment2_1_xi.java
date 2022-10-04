import java.util.Scanner;

public class Assignment2_1_xi
{
    public static void main(String[] args)
    {
        long n,r1,r2,sum_e=0,sum_o=0,diff;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=scan.nextLong();

        while (n>0)
        {
            for(int i=0;i<n;i++)
            {
                r1=n%10;
                n=n/10;
                r2=n%10;
                if(r1%2==0 && r2%2==0 && r1!= 2 && r2!=2 && r1!=6 && r2!=6)
                {
                    sum_e=sum_e+r1*r2;
                }
                if(r1%2!=0 && r2%2!=0 && r1!= 3 && r2!=3 && r1!=7 && r2!=7)
                {
                    sum_o=sum_o+r1*r2;
                }

            }
        }
        diff=sum_e-sum_o;
        System.out.println("Required Difference is: "+diff);
    }


}
