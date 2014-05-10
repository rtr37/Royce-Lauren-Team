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
public class HealthItems implements Serializable {

       private String strength;
       private String minimumHealth;
       private String maximumHealth;

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getMinimumHealth() {
        return minimumHealth;
    }

    public void setMinimumHealth(String minimumHealth) {
        this.minimumHealth = minimumHealth;
    }

    public String getMaximumHealth() {
        return maximumHealth;
    }

    public void setMaximumHealth(String maximumHealth) {
        this.maximumHealth = maximumHealth;
    }

    public HealthItems() {
    }

    @Override
    public String toString() {
        return "HealthItems{" + "strength=" + strength + ", minimumHealth=" + minimumHealth + ", maximumHealth=" + maximumHealth + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.strength);
        hash = 79 * hash + Objects.hashCode(this.minimumHealth);
        hash = 79 * hash + Objects.hashCode(this.maximumHealth);
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
        final HealthItems other = (HealthItems) obj;
        if (!Objects.equals(this.strength, other.strength)) {
            return false;
        }
        if (!Objects.equals(this.minimumHealth, other.minimumHealth)) {
            return false;
        }
        if (!Objects.equals(this.maximumHealth, other.maximumHealth)) {
            return false;
        }
        return true;
    }
    
       
}
