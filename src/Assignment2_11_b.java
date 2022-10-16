public class Assignment2_11_b
{
    public static void main( String[] args )
    {
        int count=0;
        for(int i=24;i<249;i++)
        {
            if(i%10==5 || i%10==7)
            {
                count++;
            }
        }
        System.out.println("The number of numbers between 23 & 249 is:"+count);
    }
}
