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

import byui.cit260.walkingDead.control.Controls;
import byui.cit260.walkingDead.control.ProgramControl;
import java.util.Scanner;


public class MainMenuView {
    
    private static final String menu = "\n\n"
            + "G - Start Game\n"
            + "H - Get help on how to do to this\n"
            + "S - Save\n"
            + "E - Exit";
    
    public void displayMainMenu(){
        boolean invalidSelection = true;
        Scanner keyboard = new Scanner(System.in);
        
        do{
            System.out.println(MainMenuView.menu);
            String value = keyboard.nextLine();
            
            value = value.trim().toUpperCase();
            char selection = value.charAt(0);
            
        switch (selection) {
            case 'G':
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.displayGameMenu();
                break;
            case 'H':
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.displayHelpMenu();
                break;
            case 'S':
                Controls.getProgramControl().saveGame();
                break;
            case 'E':
                return;
            
            default:
                System.out.println("Invalid Selection");
            
        }
        
        } while(invalidSelection);
    }
    
}

