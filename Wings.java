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
public class Wings {
    public int percRemaining = 100;
    public boolean spicy;
    public String flavor;
    String name;
        
    public void eatWings(int percEaten){
    percRemaining = percRemaining - percEaten;
    }
    
    
    
    
    
    public int getPercRemaining(){
        System.out.println("Percentage of wings remaining: " + percRemaining + "%" );
        return percRemaining;
    }
}

 