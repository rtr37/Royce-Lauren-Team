/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.walkingDead.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rtacklingman50
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcCompressionofCylinder method, of class InventoryControl.
     */
    @Test
    public void testCalcCompressionofCylinder() {
        System.out.println("calcCompressionofCylinder");
        double length = 0.0;
        double diameter = 0.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 0.0;
        double result = instance.calcCompressionofCylinder(length, diameter);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
