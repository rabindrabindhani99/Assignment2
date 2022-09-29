import java.util.Scanner;

public class Assignment2_1_iii
{
    public static void main(String[] args)
    {
        int n,r,sum=0;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=scan.nextInt();
        while(n>0)
        {
            r=n%10;
            if(r%2!=0)
            {
                sum = sum + r;
            }
            n=n/10;
        }
        System.out.println("The sum of all odd digits is: "+sum);
    }
}
