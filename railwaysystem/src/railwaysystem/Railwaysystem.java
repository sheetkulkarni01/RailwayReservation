package railwaysystem;

import java.util.Scanner;

public class Railwaysystem {

    public static void main(String[] args) {
        int choice;
    Status Mybook=new Status();
    Scanner isr=new Scanner(System.in);
    Scanner br=new Scanner(System.in);
    
    Exit:
    do
    {    
    System.out.println("1.Book ticket");

    System.out.println("2.Cancel ticket");

    System.out.println("3.Search passenger");

    System.out.println("4.Reservation chart");

    System.out.println("5.Display unbooked tickets");

    System.out.println("6.Exit");

    System.out.println("Please enter your choice");

    choice=br.nextInt();

   switch(choice)

    {

    case 1:         
    break;

    case 2:
    break;

    case 3:Mybook.doSearch();
    break;

    case 4:Mybook.doDispList();
    break;

    case 5:Mybook.doDispUnbooked();
    break;

    case 6:break Exit;

    default :System.out.println("Invalid choice");

    }   
    }while(choice!=6);    
  }
    
}
