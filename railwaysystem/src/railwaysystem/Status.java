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
}
