/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkingDead.view;

import byui.cit260.walkingDead.control.Controls;
import byui.cit260.walkingDead.model.Player;
import java.util.Scanner;

/**
 *
 * @author rtacklingman50
 */
public class StartProgramView {

    public StartProgramView() {
    }

    public void startProgram() {

        this.displayBanner();

        String playersName = this.getPlayersName();
        if (playersName == null) {
            return;
        }

        Player player = new Player();
        player.setname(playersName);
        Controls.getProgramControl().setPlayer(player);

        this.displayWelcomeMessages(playersName);

        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenu();

    }

    public void displayBanner() {
        System.out.println("\n\n**************************************");

        System.out.println("*                                        *"
                + "\n* You have just woken up in a post apocalyptic  *"
                + "\n* time where zombies have taken over the world. *"
                + "\n* Feeling safe isn't an option, to stay alive.. *"
                + "\n*             You'll have to earn it            *");

        System.out.println("*                                        *"
                + "\n* Any chance of survival for you or your family *"
                + "\n* is going to have to be earned. In this game   *"
                + "\n* you are going to need to look for shelter     *"
                + "\n* wherever it is available, even if it's inside *"
                + "\n* an abandoned prison.");

        System.out.println("*                                        *"
                + "\n* Best of luck to you on this journey.          *"
                + "\n*                                               *");

        System.out.println("******************************************");

    }

    public String getPlayersName() {
        boolean valid = false;
        String playersName = null;
        Scanner keyboard = new Scanner(system.in);

        while (!valid) {

            System.out.println("Enter the player's name below:");

            playersName = keyboard.nextLine();

            if (playersName.trim().length() < 2) {

                System.out.println("Invalid name - do not leave blank"
                        + "must be greater than two characters");

            }

            if (playersName.toUpperCase().charAt(0) == 'Q') {
                return null;
            }

            valid = true;
        }

        return playersName;
    }

    public void displayWelcomeMessage(String name) {
System.out.println("\n\n===============================");
System.out.println("\t Welcome to the game" + name);
System.out.println("\t Go have a good time!");
System.out.println("\n\n===============================");
    }
    
}
