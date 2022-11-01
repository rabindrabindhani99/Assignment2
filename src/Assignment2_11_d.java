public class Assignment2_11_d
{
    public static void main( String[] args )
    {
        int r,count=0;
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
                count++;
            }
        }
        System.out.println("No of palindrome no: "+count);
    }
}
