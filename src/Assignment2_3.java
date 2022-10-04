import java.util.Scanner;
public class Assignment2_3
{
    public static void main(String[] args)
    {
        long n1,n2,r1,r2,sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two same digit numbers.");
        System.out.println("Enter the 1st no: ");
        n1 = scan.nextLong();
        System.out.println("Enter the 2nd no: ");
        n2= scan.nextLong();

        while(n1>0 && n2>0)
        {
            for(int i=0;i<n1;i++)
            {
                r1=n1%10;
                r2=n2%10;
                n1=n1/10;
                n2=n2/10;
                if(r1%2==0 && r2%2!=0)
                {
                    sum=sum+r1*r2;
                }
            }
        }
        System.out.println("The required result: "+sum);
    }
}