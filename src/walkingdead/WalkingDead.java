/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package walkingdead;

import byui.cit260.walkingDead.model.*;
import byui.cit260.walkingDead.view.*;



/**
 *
 * @author rtacklingman50
 */
public class WalkingDead {
    
    public static Game currentGame;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        WalkingDead.currentGame = currentGame;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game gameOne = new Game();
        new StartProgramView().displayBanner();
        gameOne.setName("Fred Flinstone");
        gameOne.setBestTime(7.00);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
    }

    public static void setCurrentGame(byui.cit260.walkingDead.control.Game game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}