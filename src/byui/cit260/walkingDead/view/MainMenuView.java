/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.walkingDead.view;

/**
 *
 * @author rtacklingman50
 */

import byui.cit260.walkingDead.control.InventoryControl;
import byui.cit260.walkingDead.control.ProgramControl;
import java.util.Scanner;


public class MainMenuView extends View {
    
    private String menu = "\n\n"
            + "\n------------------------------------"
            + "\n|Main Menu"
            + "\n------------------------------------"
            + "\nN - Start Game"
            + "\nH - Get help on how to do to this"
            + "\nS - Save game"
            + "\nQ - Quit"
            + "\n------------------------------------";

    public MainMenuView() {
        super("\n"
                + "\n-------------------------"
                + "\n | Main Menu"
                + "\n-------------------------"
                + "\nN - Start new game"
                + "\nG - Get and start saved game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save game"
                + "\nQ - Quit"
                + "\n-------------------------");
    }
    
    
    @Override 
    public void doAction(String value) {
        char choice = value.toUpperCase().charAt(0);
        
        switch (choice){
            case 'N': // create and start a new game
                this.startNewGame();
                break;
            case 'G': // get and start an exisiting game
                this.startExistingGame();
                break;
            case 'H': // display the help menu
                this.displayHelpMenu();
                break;
                case'E': // Exit the program
                    return;
                default:
                    System.out.println("n*** Invalid selection *** Try again");
                    break;
        }
    }

    private void startNewGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void startExistingGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHelpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

