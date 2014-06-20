/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.walkingDead.view;

import java.util.Scanner;

/**
 *
 * @author Lauren
 */
public abstract class View implements ViewInterFace {
    
    private final String promptMessage;
    
    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display() {
        String value;
        do {
            
      System.out.println(this.promptMessage); // display the prompt
      value = this.getInput (); // get the user's selection
      this.doAction (value); // do action based on selection
      
      } while (!value.equals("Q"));
       
    }
   @Override
   public String getInput () {
       Scanner keyboard = new Scanner(System.in);
       boolean valid = false;
       String selection = null;
       
       // while a valid name has not be retrieved 
       while (!valid) {
           
           //prompt for the player's name
           System.out.println("\t\nEnter your selection below:");
           
           // get the value entered from the keyboard
           selection = keyboard.nextLine();
           selection = selection.trim();
           
           if (selection.length() < 1) { // blank value entered
               System.out.println("\n*** Invalid selection *** Try again");
               continue;
               
           }
           break;
           
       }
       
       return selection; // return the name
   }
}
