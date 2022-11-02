import java.util.Scanner;

public class Assignment2_8
{
    public static void main( String[] args ) {
        Scanner sc =new Scanner(System.in);
        int[] arg =new int[4];
        System.out.println("Enter the mark secured in C,C++,Java and python respectively");
        int cp=3,fms=400,sgpat=0,gp=-1,tms=0;
        for(int i=0;i<4;i++)
        {
            char gd;
            arg[i]=sc.nextInt();
            tms=tms+arg[i];
            if(arg[i]>=35 && arg[i]<40)
            {
                arg[i] = arg[i] + 5;
            }
                int mv=arg[i]/10;
                switch (mv)
                {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                        gd='F';gp=2;
                        break;
                    case 4:
                        gd='D';gp=5;
                        break;
                    case 5:
                        gd='C';gp=6;
                        break;
                    case 6:
                        gd='B';gp=7;
                        break;
                    case 7:
                        gd='A';gp=8;
                        break;
                    case 8:
                        gd='E';gp=9;
                        break;
                    case 9:
                    case 10:
                        gd='O';gp=10;
                        break;
                    default:
                        gd='S';gp=0;
                }
            System.out.println("Your mark for subject "+i+" is "+arg[i]+" and grade is: "+gd);
                sgpat=sgpat+gp*cp;
        }
        double pms=(double) tms*100/fms;
        double sgpa=(double)sgpat/12;
        System.out.println("% of mark: "+pms);
        System.out.println("Your SGPA is: "+sgpa);

    }
}
