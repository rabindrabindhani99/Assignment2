import java.util.Scanner;

public class Assignment2_1_vi
{
    public static void main(String[] args)
    {
        int num,m1,r1,m2,r2,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        int n=num;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println("Count:"+count);

        System.out.println("Enter the value of k:");
        int k= sc.nextInt();
        System.out.println("If you want to enter the kth Value from front, Enter 1." +
                "\nIf you want to enter the kth value from back, Enter 2.");
        int side = sc.nextInt();
        switch(side)
        {
            case 1:
            {
                for(int i=1;i<count-(k-1);i++)
                {
                    num=num/10;
                }
                m1=(int) (Math.pow(10,count-k));
                r1=num%10;

                System.out.println("The kth digit is "+r1);

                System.out.println("The position value is:"+m1);
                break;
            }
            case 2:
            {
                for(int i=1;i<k;i++)
                {
                    num=num/10;
                }
                m2=(int) (Math.pow(10,k-1));
                r2=num%10;

                System.out.println("The kth digit is "+r2);

                System.out.println("The position value is:"+m2);
                break;
            }
            default:
            {
                System.out.println("Wrong entry.");
            }
        }
    }
}
