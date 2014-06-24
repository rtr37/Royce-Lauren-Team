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
public class HelpMenuView {

    private static final String menu = "\n\n"
            + "G - What is the Goal of the Game\n"
            + "M - How to move"
            + "Q - Quit";

    public void displayHelpMenu() {
        boolean invalidSelection = true;
        Scanner keyboard = new Scanner(System.in);
        
        do{
            System.out.println(HelpMenuView.menu);
            String value = keyboard.nextLine();
            
            value = value.trim().toUpperCase();
            char selection = value.charAt(0);
            
            switch (selection){
                case 'G': 
                    System.out.println("The goal of the game is to secure the prison to make"
                            + "it safe from any and all zombies. You can do this by finding"
                            + "your way through the prison and spotting things that are not"
                            + "safe.");
                  
                case 'M': ;
                    System.out.println("You are able to move around through the prison using "
                            + "controls in one of two ways, by accessing the map and viewing "
                            + "places that have already been found or using controls to find"
                            + "new places.");
                case 'Q': 
                    GameMenuView gameMenu = new GameMenuView();
                    gameMenu.displayGameMenu();
                    
                default:
                    System.out.println("Invalid Selection");
            }
        } while (invalidSelection);
    }
}
