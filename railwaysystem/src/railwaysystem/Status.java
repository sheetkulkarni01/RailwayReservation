package railwaysystem;

import java.util.Scanner;

public class Status {
    int[] passenger_no=new int[275];

    String name[]=new String[275];

    String phone_no[]=new String[275];

    int age[]=new int[275];

    int class_type[]=new int[275];

    int passenger_count=0;

    int passenger_num=1;

    int max1=75;

    int max2=125;

    int max3=175;
    
    public void doSearch()
    {
        Scanner br=new Scanner(System.in);
    int passengerFound=0;

    System.out.println("Please enter passenger no. to search");

    int p=br.nextInt();

    for(int i=0;i<passenger_count;i++)
    {

    if(passenger_no[i]==p)

    {

    System.out.println("Detail found");

   passengerFound=1;

    System.out.println("passenger no.="+passenger_no[i]);

    System.out.println("name="+name[i]);

    System.out.println("class="+class_type[i]);

    System.out.println("phno="+phone_no[i]);

    System.out.println("age="+age[i]);

    }

    }

    if(passengerFound==0)

    System.out.println("No such passenger");

    }
    
     public void doDispList()

    {

    System.out.println("Passenger list in AC class");

   System.out.println("pno \t name \t\t age \t phno");

    for(int i=0;i<passenger_count;i++)

    {

    if(class_type[i]==1)

    {

    System.out.println(passenger_no[i]+"\t"+name[i]+"\t\t"+age[i]+"\t"+phone_no[i]);

    }

    }

    System.out.println("Passenger list in First class");

    System.out.println("pno \t name \t\t age \t phno");

    for(int i=0;i<passenger_count;i++)

    {

    if(class_type[i]==2)

    {

    System.out.println(passenger_no[i]+"\t"+name[i]+"\t\t"+age[i]+"\t"+phone_no[i]);

    }

    }

   System.out.println("Passenger list in Sleeper class");

    System.out.println("pno \t name \t\t age \t phno");

  for(int i=0;i<passenger_count;i++)

    {

    if(class_type[i]==3)

    {

    System.out.println(passenger_no[i]+"\t"+name[i]+"\t\t"+age[i]+"\t"+phone_no[i]);

   }

    }

    }
  public void doDispUnbooked()

    {

    System.out.println("No. of booked tickets status");

    System.out.println("AC class"+max1);

    System.out.println("First class"+max2);

    System.out.println("Sleeper class"+max3);

    }
}
