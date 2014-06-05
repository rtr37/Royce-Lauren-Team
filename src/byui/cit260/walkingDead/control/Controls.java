/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.walkingDead.control;

/**
 *
 * @author rtacklingman50
 */
public final class Controls {
    
    private final static ProgramControl programControl = new ProgramControl();    
    private final static GameControl gameControl = new GameControl();    
    private final static InventoryControl inventoryControl = new InventoryControl();
    

    public static ProgramControl getProgramControl() {
        return programControl;
    }

    public static GameControl getGameControl() {
        return gameControl;
    }

    public static InventoryControl getInventoryControl() {
        return inventoryControl;
    }
    
      
}