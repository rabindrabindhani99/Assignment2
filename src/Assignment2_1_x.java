import java.util.Scanner;

public class Assignment2_1_x
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
                r = n % 10;
                n = n / 10;
                r1 = n % 10;
                boolean flag =true;
                for (i = 2; i < r; i++)
                {
                    if (r % i == 0)
                    {
                        flag=false;
                    }
                }
                boolean flag1 =true;
                for (i = 2; i < r1; i++)
                {
                    if (r1 % i == 0)
                    {
                        flag1=false;
                    }
                }
                if(flag && flag1 && r!=1 && r1!=1)
                {
                    sum = sum + r * r1;
                }
            }
        }
        System.out.println("Sum of the product of the consecutive numbers: "+sum);
    }
}
