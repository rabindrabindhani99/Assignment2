public class Assignment2_12_b
{
    public static void main( String[] args )
    {
        int count_o=0,count_e=0,sum_e=0,sum_o=0;
        double avg_e,avg_o;
        for(int i=0;i< args.length;i++)
        {
            if(Integer.parseInt(args[i])%2==0)
            {
                count_e++;
                sum_e=sum_e+Integer.parseInt(args[i]);
            }

            if(Integer.parseInt(args[i])%2!=0)
            {
                count_o++;
                sum_o=sum_o+Integer.parseInt(args[i]);
            }
        }

        avg_e=(double) sum_e/count_e;
        System.out.println("Average of even no: "+avg_e);
        avg_o=(double) sum_o/count_o;
        System.out.println("Average of odd no: "+avg_o);
        double diff= avg_o-avg_e;
        System.out.println("Difference="+diff);
    }
}
