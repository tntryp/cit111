/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects1;

/**
 *
 * @author Tanner
 */
public class Club {
    public int percRemaining = 100;
    public String meatType;
    public boolean healthyChoice;
    String name;
   
    public void eatClub(int percEaten){
        percRemaining = percRemaining - percEaten;
    }
    
    public int getPercRemaining(){
        System.out.println("Percentage of club remaining: " + percRemaining + "%" );
        return percRemaining;
    }
}
