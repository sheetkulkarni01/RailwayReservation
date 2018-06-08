package railwaysystem;
import java.util.Scanner;
/**The class ancelTiket is used to cancel a particular ticket. If the user wants to cancel hi/her  booked ticket
 * the they can do so by filling  particular details and then select to delete and get the money refunded in your account 
 * @author Shaheen Havaldar
 */
public class CancelTicket {
    /**
     * This method is used to cancel a particular ticket.The user has to select one class type.
     * It has three class types.
     * 1.AC class  2.First class  3.Sleeper class
     * The class  asks the user to enter details and then checks if the user is present or not.
     * Depending upon the number of tickets , the class calculates the total amount to be paid back to the user. 
     * @author Shaheen Havaldar
     */
    public void doCancel()
    {
        int passenger_no[]=new int[275];

    String name[]=new String[275];

    String phno[]=new String[275];
    
        int age[]=new int[275];

    int class_type[]=new int[275];

    int passenger_count=0;

    int pnum=1;

    int max1=75;

    int max2=125;

    int max3=175;
    
        Scanner br=new Scanner(System.in);
    int t_pno[]=new int[275];

    String t_name[]=new String[275];

    String t_phno[]=new String[275];

    int t_age[]=new int[275];

    int t_c1[]=new int[275];

    int t_pcount=0;

    int passengerFound=0;

    System.out.println("Please enter your passenger no.");

    int p=br.nextInt();
        int[] cl = null;
        int[] t_cl = null;

    for(int i=0;i<passenger_count;i++)
    {

    if(passenger_no[i]!=p)
    {

    t_pno[t_pcount]=passenger_no[i];

    t_name[t_pcount]=name[i];

    t_phno[t_pcount]=phno[i];

    t_age[t_pcount]=age[i];
        int[] c1 = null;

    t_cl[t_pcount]=c1[i];

    t_pcount++;
    }

    else
    {

    passengerFound=1;

    if(cl[i]==1)
    {

    max1++;

    System.out.println("Please collect refund of Rs."+800);
    }

    if(cl[i]==2)
    {
    max2++;

    System.out.println("Please collect refund of Rs."+500);
    }

    if(cl[i]==3)
    {

    max3++;

    System.out.println("Please collect refund of Rs."+250);
    }
    }
   }

    if(passengerFound==1)
    {
    passenger_no=t_pno;

    name=t_name;

    age=t_age;

   cl=t_cl;

    phno=t_phno;

    passenger_count=t_pcount;

    System.out.println("ticket successfully cancelled");
    }
    }
}
