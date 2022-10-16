import java.util.Scanner;

public class Assignment2_9 {
    public static void main( String[] args ) {
        int greatest, smallest, a, b, c,fact=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first no: ");
        a = scan.nextInt();
        System.out.println("Enter the second no: ");
        b = scan.nextInt();
        System.out.println("Enter the third no: ");
        c = scan.nextInt();
        if (a > b && a > c)
        {
            greatest = a;
        }
        else if (b > a && b > c)
        {
            greatest = b;
        }
        else
        {
           greatest = c;
        }
        System.out.println("Greatest no is: "+greatest);
        if(a<b && a<c)
        {
            smallest=a;
        }
        else if(b<a && b<c)
        {
            smallest=b;
        }
        else
        {
            smallest=c;
        }
        System.out.println("Smallest no is: "+smallest);
        int diff=greatest-smallest;
        System.out.println("Difference between greatest and smallest no is: "+diff);

        for(int i=1;i<=diff;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of the difference is:"+ fact);
    }
    }
