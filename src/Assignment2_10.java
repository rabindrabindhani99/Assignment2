import java.util.Scanner;

public class Assignment2_10
{
    public static void main( String[] args )
    {
        int n,fib1=0,fib2=1,fib;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the no of term to display the fibonacci series: ");
        n=scan.nextInt();
        System.out.print(fib1+" "+fib2);

        for(int i=2;i<n;i++)
        {
            fib=fib1+fib2;
            System.out.print(" "+fib);
            fib1=fib2;
            fib2=fib;
        }
    }
}
