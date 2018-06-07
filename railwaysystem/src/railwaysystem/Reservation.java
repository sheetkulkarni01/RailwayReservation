
package railwaysystem;

import java.util.Scanner;

/**
 *The class Reservation is used to book a ticket. If tickets are available ,
 * the user books his/her ticket by providing the details. 
 * @author Sanjidah Gundkalli
 */

public class Reservation {
    
     int passenger_no[]=new int[275];

    String name[]=new String[275];

    String phone_no[]=new String[275];

    int age[]=new int[275];

    int class_type[]=new int[275];

    int passenger_count=0;

    int passenger_num=1;

    int max1=75;

    int max2=125;

    int max3=175;
    
    
    /**
 * This method is used to book a ticket.The user has to select one class type.
 * It has three class types.
 * 1.AC class  2.First class  3.Sleeper class
 * The class sees if a ticket is available,then asks the user to enter details.
 * Depending upon the number of tickets , the class calculates the total amount to be paid by the user. 
 * @author Sanjidah Gundkalli
 */
       public void doBook()

    {

         Scanner br=new Scanner(System.in);
         Scanner isr=new Scanner(System.in);
         int ticketAvailable=0;
                 System.out.println("Please enter the class of ticket");

                 System.out.println("1. AC\t 2. First\t 3. Sleeper\t");

                 int c=br.nextInt();
                 System.out.println("Please enter no. of tickets");

                int t=br.nextInt();

                   if(c==1 && max1>=t)
                       {

                            ticketAvailable=1;

                        }

                    if(c==2 && max2>=t)
                         {

                             ticketAvailable=1;

                          }

                    if(c==3 && max3>=t)
                          {

                             ticketAvailable=1;

                           }

                if(ticketAvailable==1)

                {

                     for(int i=0;i<t;i++)
        
                        {

                             passenger_no[passenger_count]=passenger_num;

                             System.out.println("Please enter your name");
    
                             name[passenger_count]=br.next();

                             System.out.println("Please enter your age");

                             age[passenger_count]=isr.nextInt();

                             class_type[passenger_count]=c;

                             System.out.println("Please enter your phno");

                              phone_no[passenger_count]=br.next();

                              passenger_count++;

    
                              passenger_num++;

                              System.out.println("Ticket successfully booked");

                        }

                if(c==1)

                   {
                         max1-=t;

                         System.out.println("Please pay Rs."+t*1500);

                    }

                 if(c==2)

                     {

                         max2-=t;

                         System.out.println("Please pay Rs."+t*1200);

                      }

                  if(c==3)

                      {

                         max3-=t;

                         System.out.println("Please pay Rs."+t*1000);

                        }

                }

    }
    
}


