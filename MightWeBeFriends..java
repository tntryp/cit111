/*
This program is made by me. It is entirely free use, as per the license
shown when accessing this code.

The purpose of the program is to act as a friend evaluation program. Using three
questions, it will help determine whether or not the user and I would make good
friends.

The question is, Might We Be Friends?
 */
package week6;

import java.util.Scanner;

/**
 *
 * @author Tanner
 */
public class MightWeBeFriends {
    
    public static void main(String[] args){
        System.out.println("/////////////////////////////////////////////");
        System.out.println("Will we be friends? Respond to each question to find out!");
        System.out.println("/////////////////////////////////////////////");
        // welcoming the possible friend in question, and instructing them how
        // to find out if we many, infact, be friends
        
        int responseMusic;
        int responseCars;
        int responseVideoGames;
        // establishing user inputs, based on each of the three questions
        
        int compScore = 0;
        // compScore is used to detemine friend eligibility. value will change
        // based on responses to each question
        
        System.out.println("Do you enjoy metal music? (1 if yes, 2 if no)");
         // Question 1
        
        Scanner keyboardReader = new Scanner(System.in);
        // establishing a scanner object
        responseMusic = keyboardReader.nextInt();
        // letting the scanner object know to scan the next user input
      
        if(responseMusic == 1){
            compScore = compScore + 10;
            System.out.println("Me too! Slipknot was the band that got me into metal and playing guitar!");
        } else{
            System.out.println("Shame. Guess it's not for everyone.");
        }// end of first question
    
        System.out.println("Next question. Do you like cars? (1 if yes, 2 if no");
        // Question 2
        
        responseCars = keyboardReader.nextInt();
        // telling the scanner the next input is the response to the cars question
        
        if(responseCars == 1){
            compScore = compScore + 20;
            System.out.println("Same. I blow too much money on mine.");
        } else{
            compScore = compScore - 10;
            System.out.println("For some people it's just transportation. For others, it's a moneypit.");
        } // end of second question
        
        System.out.println("Final question. Do you play video games? (1 if yes, 2 if no");
        // Question 3
        
        responseVideoGames = keyboardReader.nextInt();
        // letting the scanner know we're now looking for the response to question 3
       
        if(responseVideoGames == 1){
            compScore = compScore + 20;
            System.out.println("Awesome! We'll have to queue up sometime.");
        } else{
            compScore = compScore - 20;
            System.out.println("Unfortunate. It's a really good way to pass the time.");
        } // end of third question
        
        System.out.println("//////////////////////////////////////////////////");
        System.out.println("So, you've answered the questions. The results are in..");
        System.out.println("//////////////////////////////////////////////////");
        
        if(compScore > 30){
            System.out.println("Well, it appears we could just maybe be friends.");
        } else{
            System.out.println("Hmm... Maybe we wont be friends. Test says so.");
        } // the friend evaluation if/else
    } // close main
} // close class
