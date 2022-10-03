import java.util.Scanner;

public class Assignment2_1_vii
{
    public static void main(String[] args)
    {
        long n,r,r1,sum=0;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number: ");
        n= scan.nextLong();
        System.out.println("Given no is: "+n);
        while(n>0)
        {
            for(int i=0;i<n;i++)
            {
                r=n%10;
                n=n/10;
                r1=n%10;
                sum=sum+r*r1;
            }
        }
        System.out.println("Sum of the product of the consecutive numbers: "+sum);
    }
}
