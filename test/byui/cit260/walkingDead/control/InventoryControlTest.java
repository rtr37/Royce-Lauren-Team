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
        System.out.println("calcCompressionofCylinder1");
        double length = 7.0;
        double diameter = 6.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 5.0;
        double result = instance.calcCompressionofCylinder(length, diameter);
        assertEquals(expResult, result, .01);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    @Test
    public void testCalcCompressionofCylinder2() {
        System.out.println("calcCompressionofCylinder2");
        double length = 11.0;
        double diameter = 6.0;
        InventoryControl instance = new InventoryControl();
        double expResult = -1.0;
        double result = instance.calcCompressionofCylinder(length, diameter);
        assertEquals(expResult, result, .01);
        // TODO review the generated test code and remove the default call to fail.
    
    }
  @Test
    public void testCalcCompressionofCylinder3() {
        System.out.println("calcCompressionofCylinder3");
        double length = 8.0;
        double diameter = -1.0;
        InventoryControl instance = new InventoryControl();
        double expResult = -1.0;
        double result = instance.calcCompressionofCylinder(length, diameter);
        assertEquals(expResult, result, .01);
        // TODO review the generated test code and remove the default call to fail.
    
    }
}
