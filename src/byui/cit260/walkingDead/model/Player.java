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
public class Player implements Serializable{
    
    // class instance variables
    private String name;
    private double playerType;
    private double bestTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPlayerType() {
        return playerType;
    }

    public void setPlayerType(double playerType) {
        this.playerType = playerType;
    }

    public double getBestTime() {
        return bestTime;
    }

    public void setBestTime(double bestTime) {
        this.bestTime = bestTime;
    }

    public Player() {
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", playerType=" + playerType + ", bestTime=" + bestTime + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.name);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.playerType) ^ (Double.doubleToLongBits(this.playerType) >>> 32));
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.bestTime) ^ (Double.doubleToLongBits(this.bestTime) >>> 32));
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.playerType) != Double.doubleToLongBits(other.playerType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.bestTime) != Double.doubleToLongBits(other.bestTime)) {
            return false;
        }
        return true;
    }
    
    
    
}
