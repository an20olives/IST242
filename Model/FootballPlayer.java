/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author aro
 */
public class FootballPlayer {
    private int number;
    private String position;
    
    public FootballPlayer(int number, String Position) {
        this.number = number;
        this.position = position;
    }
    
    public FootballPlayer() {
        //this.number = 0;
        //this.position = "N/A";
    }
    
    @Override
    public String toString() { 
        return "FootballPlayer{" + "number=" + number + ", position=" + position + '}';  
    }
    
    public int getNumber() {
        return number;
    }
    
    public void setNumber(int number){
        this.number = number;
    }
    
    public String getPosition() {
        return position;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }
}
