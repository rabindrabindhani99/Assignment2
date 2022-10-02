import java.util.Scanner;

public class Assignment2_1_vi
{
    public static void main(String[] args)
    {
        long n,dig,pos_v;
        int r;
        int c=1;

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=scan.nextLong();
        System.out.println("Enter the k value for position value of kth term:");
        dig=scan.nextInt();
        System.out.println("Given no: "+n);
        System.out.println("Given 'k' value: "+dig);
        for(int i =1;i<dig;i++)
        {
            c=c*10;
        }
        pos_v=c;
        double temp=Math.pow(10,(dig-1));
        r= (int) ((n/temp)%10);
        System.out.println("Position Value: "+pos_v);
        System.out.println("K th term:"+r);
    }
}
