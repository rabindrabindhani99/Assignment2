public class Assignment2_12_a
{
    public static void main( String[] args )
    {
        int greatest,smallest,diff;
        greatest=Integer.parseInt(args[0]);
        for(int i=0;i< args.length;i++)
        {
            if(Integer.parseInt(args[i])>greatest)
            {
                greatest=Integer.parseInt(args[i]);
            }
        }
        smallest=Integer.parseInt(args[0]);
        for(int i=0;i< args.length;i++)
        {
            if(Integer.parseInt(args[i])<greatest)
            {
                smallest=Integer.parseInt(args[i]);
            }
        }
        System.out.println("Greatest:"+greatest);
        System.out.println("Smallest:"+smallest);
        diff=greatest-smallest;
        System.out.println("Difference between Greatest and Smallest is: "+diff);
    }
}
