import java.util.Scanner;

public class Assignment2_2
{
    public static void main(String[] args)
    {
        long n1,n2,r1,r2,sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two Same digits number.");
        System.out.println("Enter the First number: ");
        n1 =scan.nextLong();
        System.out.println("Enter the second number: ");
        n2 =scan.nextLong();
        System.out.println("================================");
        System.out.println("Given 1st number is: "+n1);
        System.out.println("Given Second number is: "+n2);
        while(n1>0 && n2>0)
        {
            for (int i = 0; i < n1; i++)
            {
                r1=n1%10;
                r2=n2%10;
                n1=n1/10;
                n2=n2/10;
                sum=sum+r1*r2;
            }
        }
        System.out.println("Sum of the product of the corresponding digits of given numbers: "+sum);
    }
}
