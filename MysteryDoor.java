/*
This program is made by me. It is entirely free use, as per the license
shown when accessing this code.

The purpose of this program is to let the user play a little game. There are 3
options, each yielding a different output when chosen. Which door is for you?
Is this game even fun??
 */
package week6;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * Made by Tanner :^)
 */
public class MysteryDoor {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        // establishing scanner
        int doorNumber;
        // establishing the user's choice as an int
        
        System.out.println("##############################################");
        System.out.println("WELCOME TO MY GAME SHOW! THE RULES ARE SIMPLE.");
        System.out.println("IN FRONT OF YOU ARE THREE DOORS. CHOOSE ONE.");
        System.out.println("##############################################");
        System.out.println("(To select a door, please enter 1, 2, or 3...)");
        // welcoming our lucky guest!
        
        doorNumber = keyboardScanner.nextInt();
        // letting the scanner know how to scan user input
        
        switch (doorNumber) {
            case 1:
                printStatement();
                break;
            case 2:
                generateBigNumber();
                break;
            case 3:
                numberGuess();
                break;
            default:
                System.out.println("YOU'RE NO FUN.");
                System.out.println("Exiting... Loser.");
        } // our 3 cases. note how each one has a different outcome. 
          // these are our doors. a default is also given.
    } // end main method
        
        public static void printStatement() {
            System.out.println("#########################################");
            System.out.println("DOOR NUMBER 1. THE ANSWER TO LIFE...");
            System.out.println("#########################################");
            System.out.println("eat mor chikin.");
        } // case 1 method. lets contestant in on the answer to life...
        
        public static void generateBigNumber(){
            System.out.println("############################################");
            System.out.println(".....YOUR LUCKY NUMBER IS.....");
            System.out.println("############################################");
            Random r = new Random();
            BigInteger bigInt = new BigInteger(123, r);
            System.out.println(bigInt);        
            System.out.println("I'm sure this number appears a lot in your life.");
        } // case 2 method. generates a random and massive number. this number
          // just so happens to be the player's "lucky" number.
        
        public static void numberGuess() {
            int secretGuess;
            // establishing an int for our if/else, with regards to case 3
            System.out.println("##########################################");
            System.out.println("I AM THINKING OF A NUMBER BETWEEN 1 AND 10.");
            System.out.println("GUESS CORRECTLY, AND I'LL TELL YOU A SECRET");
            System.out.println("##########################################");
            System.out.println("(Choose a number between 1 and 10.");
            
            Scanner keyboardReader = new Scanner(System.in);
            secretGuess = keyboardReader.nextInt();
            // a new scanner, and telling our scanner that it will interpret
            // next user input as their secretGuess
            
            if(secretGuess == 9){
                System.out.println("#########################################");
                System.out.println("THE SECRET IS........................");
                System.out.println(".......");
                System.out.println("...................");
                System.out.println("................................");
                System.out.println("This game was pointless, and a waste of time.");
                System.out.println("Sorry.");
                // they guessed correctly! telling them that this little game
                // probably wasn't worth their time.
                
            } else {
                System.out.println("#################################");
                System.out.println("INCORRECT. NO SECRET FOR YOU!!");
                System.out.println("#################################");
                // they guessed wrong. tough luck.
            }
        } // our case 3. note use of the if/else to determine if they will get
          // the litte secret, or not, based on their input
        
} // end of class MysteryDoor
      
