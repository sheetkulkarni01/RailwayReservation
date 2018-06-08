/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railwaysystem;

/**This class is used tom check the case for canceling of tickets
 *It takes the number of tickets that should be canceled and compares with the actually deleted tickets 
 * and gives the result
 * @author Shaheen
 */
public class Cancel_1 {
    

    public int doCancelTest(int number_tickets) {
        if(1==number_tickets)
            return number_tickets;
        else
            return 0;
    }

    
    
}
