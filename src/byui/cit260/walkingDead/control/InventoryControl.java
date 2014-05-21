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
public class InventoryControl {
    public double calcCompressionofCylinder(double length, double diameter){
    
    if(length<1 || length>10){
        return -1;
    }    
    if(diameter<1 || diameter>8){
        return -1;
    }
    double radius = diameter / 2;
    double volume = (Math.PI * Math.pow(radius,2) * length);
    double compression = (Math.PI * Math.pow(diameter,2) * length + volume) / volume;
     
    return compression;
    }
}
