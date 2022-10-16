import java.util.Scanner;

public class Assignment2_7
{
    public static void main(String[] args)
    {
        int n,fact=1,choose;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number for a factorial: ");
        n= scan.nextInt();

        System.out.println("Choose the method of factorial.\nFor the use of while loop enter 1.\nFor the use of do while loop enter 2.\nFor the use of for loop enter 3.");
        choose=scan.nextInt();
        int temp=n;
        switch (choose)
        {
            case 1:
            {
                while(n>1)
                {
                    fact=fact*n;
                    n--;
                }
                System.out.println("Factorial using while loop of no "+temp+" is:"+fact);
            }
            break;
            case 2:
            {
                do
                {
                    fact=fact*n;
                    n--;
                }while (n>1);
                System.out.println("Factorial using do while loop of no "+temp+" is:"+fact);
            }
            break;
            case 3:
            {
                for(int i=1;i<=n;i++)
                {
                    fact=fact*i;
                }
                System.out.println("Factorial using for loop of no "+temp+" is:"+fact);
            }
            break;
            default:
                System.out.println("Wrong choice.");
        }
    }
}
