/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.walkingDead.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author rtacklingman50
 */
public class weaponClass implements Serializable{
    
    private String power;
    private String minmumDamage;
    private String maximumDamage;

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getMinmumDamage() {
        return minmumDamage;
    }

    public void setMinmumDamage(String minmumDamage) {
        this.minmumDamage = minmumDamage;
    }

    public String getMaximumDamage() {
        return maximumDamage;
    }

    public void setMaximumDamage(String maximumDamage) {
        this.maximumDamage = maximumDamage;
    }

    public weaponClass() {
    }

    @Override
    public String toString() {
        return "weaponClass{" + "power=" + power + ", minmumDamage=" + minmumDamage + ", maximumDamage=" + maximumDamage + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.power);
        hash = 31 * hash + Objects.hashCode(this.minmumDamage);
        hash = 31 * hash + Objects.hashCode(this.maximumDamage);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final weaponClass other = (weaponClass) obj;
        if (!Objects.equals(this.power, other.power)) {
            return false;
        }
        if (!Objects.equals(this.minmumDamage, other.minmumDamage)) {
            return false;
        }
        if (!Objects.equals(this.maximumDamage, other.maximumDamage)) {
            return false;
        }
        return true;
    }
    
    
    
}
