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
public class FoodLand {
    
    final static int snack = 10;
    final static int munch = 50;
    final static int chomp = 75;
        
    
    public static void main(String[] args){
       
        Donut firstDonut;
        firstDonut = new Donut();
        firstDonut.name = "Doug";
        printObjectData(firstDonut);
        
        printDivider();
       
        Wings firstWings;
        firstWings = new Wings();
        firstWings.name = "William";
        printObjectData(firstWings);
        
        printDivider();
        
        Club firstClub;
        firstClub = new Club();
        firstClub.name = "Cleetus";
        printObjectData(firstClub);
        
        printDivider();
        
        System.out.println("Snacking on " + firstDonut.name + ".");
        firstDonut.simulateEating(snack);
        
        System.out.println("Munching up " + firstWings.name + ".");
        firstWings.eatWings(munch);
        
        System.out.println("Taking a chomp out of " + firstClub.name + ".");
        firstClub.eatClub(chomp);
        
        printDivider();
        
        printObjectData(firstDonut);
        
        printDivider();
        
        printObjectData(firstWings);
        
        printDivider();
        
        printObjectData(firstClub);
    }
    
    private static void printObjectData(Donut inputDonut){
        System.out.println("Amount left of Doug: " + inputDonut.getPercRemaining());
    }
    
    private static void printObjectData(Wings inputWings){
        System.out.println("Amount left of William: " + inputWings.getPercRemaining());
    }
    
    private static void printObjectData(Club inputClub){
        System.out.println("Amount left of Cleetus: " + inputClub.getPercRemaining());
    }
    
    private static void printDivider(){
        System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
    }
    
}                                       
