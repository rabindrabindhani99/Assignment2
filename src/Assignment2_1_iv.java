import java.util.Scanner;

public class Assignment2_1_iv
{
    public static void main(String[] args) {
        int n, r, sum = 0, i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = scan.nextInt();
        while(n>0)
        {
            r=n%10;
            boolean flag =true;
            for (i = 2; i < r; i++)
            {
                if (r % i == 0)
                {
                    flag=false;
                }
            }
            if(flag && r!=1)
            {
                sum= sum+r;
            }
            n=n/10;
        }

        System.out.println("The sum of all the prime digits is: " + sum);
    }
}


