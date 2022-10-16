import java.util.Scanner;

public class Assignment2_6
{
    public static void main(String[] args) {
        long n,r,r1,temp,temp1,sum=0;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number to check if it is palindrome or not: ");
        n=scan.nextLong();
        temp=temp1=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(sum==temp)
        {
            System.out.println("Given no. "+temp+" is palindrome.");
        }
        else
        {
            System.out.println("The given no. "+temp+ " is not palindrome");
        }

        boolean flag=true;
        while(temp>0)
        {

            r1=temp%10;
            for(int i=2;i<r1;i++)
            {
                if (r1 % i == 0) {
                    flag = false;
                    break;
                }
            }
            temp=temp/10;
        }
        if(flag)
        {
            System.out.println("The no. "+temp1+" is a prime number.");
        }
        else
        {
            System.out.println("The no. "+temp1+" is not a prime number.");
        }
    }
}