/*
This program is made by me. It is entirely free use, as per the license
shown when accessing this code.

The purpose of FoodLand is to demonstrate the usage of object classes, or
"blueprints" to track the amount left of each of three foods (donut, wings, club)
after they are snacked on, munched on, or chomped on. The three object classes
are used in tandem with a client class (Foodland) which utilizes the blueprints
to do the calculation of the percentage of each food remaining.
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
    // ititializing three set amounts of food eaten with static ints
        
    
    public static void main(String[] args){
       
        Donut firstDonut;
        firstDonut = new Donut();
        firstDonut.name = "Doug";
        printObjectData(firstDonut);
        // creating a handle variable and new donut associated with said
        // variable. utilizes Donut.java blueprint, as well as the separate
        // printObjectData method.
        
        printDivider();
        // see bottom
        
        Wings firstWings;
        firstWings = new Wings();
        firstWings.name = "William";
        printObjectData(firstWings);
        // creating a handle variable and new wings associated with said
        // variable. utilizes Wings.java blueprint, as well as the separate
        // printObjectData method.
        
        printDivider();
        // see bottom
        
        Club firstClub;
        firstClub = new Club();
        firstClub.name = "Cleetus";
        printObjectData(firstClub);
        // creating a handle variable and new club associated with said
        // variable. utilizes Club.java blueprint, as well as the separate
        // printObjectData method.
        
        printDivider();
        // see bottom
        
        System.out.println("Snacking on " + firstDonut.name + ".");
        firstDonut.simulateEating(snack);
        // the call to the method in Donut.java that uses the set operator
        // equation along with the snack int to determine remaining donut, in
        // percent.
        
        System.out.println("Munching up " + firstWings.name + ".");
        firstWings.eatWings(munch);
        // the call to the method in Wings.java that uses the set operator
        // equation along with the munch int to determine remaining wings, in
        // percent.
        
        System.out.println("Taking a chomp out of " + firstClub.name + ".");
        firstClub.eatClub(chomp);
        // the call to the method in Club.java that uses the set operator
        // equation along with the chomp int to determine remaining club, in
        // percent.
        
        printDivider();
        // see bottom
        
        printObjectData(firstDonut);
        // same as above method
        
        printDivider();
        // see bottom
        
        printObjectData(firstWings);
        // same as above method
        
        printDivider();
        // see bottom
        
        printObjectData(firstClub);
        // same as above method
    } // close main
    
    private static void printObjectData(Donut inputDonut){
        System.out.println("Amount left of Doug: " + inputDonut.getPercRemaining());
    }
    // explained in main. used multiple times to give current amount remaining of
    // our donut
    
    private static void printObjectData(Wings inputWings){
        System.out.println("Amount left of William: " + inputWings.getPercRemaining());
    }
    // explained in main. used multiple times to give current amount remaining of
    // our wings
    
    private static void printObjectData(Club inputClub){
        System.out.println("Amount left of Cleetus: " + inputClub.getPercRemaining());
    }
    // explained in main. used multiple times to give current amount remaining of
    // our club
    
    private static void printDivider(){
        System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
    }
    // simple method using println to save time. used for formatting purposes.
} // close FoodLand class                                  