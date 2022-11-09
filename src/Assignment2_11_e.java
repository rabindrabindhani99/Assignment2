public class Assignment2_11_e
{
    public static void main( String[] args )
    {
        int r,count_pal=0,sum_pal=0;
        for(int i=24;i<249;i++)
        {
            int num=i;
            int sum=0;
            while(num>0)
            {
                r=num%10;
                sum=sum*10+r;
                num=num/10;
            }
            if(i==sum)
            {
                count_pal++;
                sum_pal=sum_pal+i;
            }
        }
        int avg_pal=sum_pal/count_pal;
        System.out.println("Average of palindrome="+avg_pal);

        int i,j,count_prime=0,sum_prime=0;
        for(i=24;i<249;i++)
        {
            boolean flag=true;
            for(j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                count_prime++;
                sum_prime=sum_prime+i;
            }
        }
        int avg_prime=sum_prime/count_prime;
        System.out.println("Average of prime number is:"+avg_prime);
        int diff=avg_pal-avg_prime;
        System.out.println("Difference between average of palindrome and average of prime number is: "+diff);

    }
}
