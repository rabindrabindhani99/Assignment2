public class Assignment2_11_c
{
    public static void main( String[] args )
    {
        int i,j,count=0;
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
                count++;
            }
        }
        System.out.println("The number of prime numbers between 23 & 249  is:"+count);
    }
}
