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
public class NewGameView {
    
    public static void mainMenuDisplay () {
        
    }
    
    public static String getUserName() {
        boolean valid = false;
        String playerName = null;
        Scanner keyboard = new Scanner(System.in);
        while (!valid) {
            System.out.println("Enter your first name");
            playerName = keyboard.nextLine();
            playerName = playerName.trim();
            if (playerName.toUpperCase().equals("Q")) {
                return null;
                
            }
         if (playerName.length() < 2) {
             ;
         } else{
             valid = true;
         }
         System.out.println("\n" + "Welcome," + playerName + "!)");
        }
    
    return playerName;
    }
    
    
    
}
