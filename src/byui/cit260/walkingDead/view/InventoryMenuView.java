/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.walkingDead.view;

/**
 *
 * @author Lauren
 */
public class InventoryMenuView {
    
    private static final String MENU = "\n"
            + "\n----------------------------------------------"
            + "\n| Item Menu |"
            + "\nU - Use item"
            + "\nE - Examine Item"
            + "\nQ - Exit to Game Menu"
            + "\n----------------------------------------------";
    
    public void displayInventoryMenu() {
        
        char selection = ' ';
        do {
            
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
        } while (selection != 'Q');
        
        
    }
    
    public String getInput() {
        boolean valid = false;
        String helpInput = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            
            helpInput = keyboard.nextLine();
            helpInput = helpInput.trim();
            
            if (helpInput.length() != 1) {
                System.out.println("Invalid selection - the selection must be non blank" +
                                   " and only one character in length.");
            }
            
            else {
                valid = true;
            }
        }
        
        return helpInput.toUpperCase();
    }
    
    public void doAction(char selection) {
        switch (selection) {
            case 'U':
                System.out.println("\n**** decisions still need to be made on how items are used ****");

                break;
            case 'E':
                this.displayItemDescription();
                 
                break;
            case 'Q':
                return;
            default:
                System.out.print("\n*** Invalid selction *** Try Again");
                break;
        }
    }

    public void displayItemDescription() {
        // call Control function to get the item's description
        System.out.println("\n**** displayItemDescription stub function called ****");
        // Print out the description of the current location
    }
}
