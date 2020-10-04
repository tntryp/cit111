package week5;

import java.util.Scanner;

/**
 *
 * @author Tanner
 */
public class MathQuiz {
  
    public static void main(String[] args) {
   
    final int answerReal = 4;
     
    final int totalAttempts = 3;
    int attempts = 0;
    int userAnswer;
    
  
   
  
    
    while (attempts < totalAttempts) {

        
        
    System.out.println("What is 2+2?");
    
        Scanner scanner = new Scanner(System.in);
      
     userAnswer = scanner.nextInt();
    
     // setting up scanner, and intitializing integers
    
    if(userAnswer == answerReal){

        System.out.println("Congratulations! You're kinda smart.");
        
        break;
    
    } else {
       // else block containing another if/else block deciding whether or not they may answer again 
        System.out.println("Dummy, " + userAnswer + " is not the answer!");
        
        attempts = attempts + 1;
        
        System.out.println("You attempted this problem " + attempts + "time(s). 3 strikes and you're out!" );
        
            if(attempts == totalAttempts){
            System.out.println("Welp. Better practice those flashcards. The correct answer was 4. If you have 2 cookies, and get 2 more, how many do u have?");
            // explain how they were wrong after 3 attempts
             } else {
            System.out.println("Try again.");
              } // prompt user to try again
    }
        
    } // close while block
    
    } // close method
} // close class
