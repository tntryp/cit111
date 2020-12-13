/*
This program is made by me. It is entirely free use, as per the license
shown when accessing this code.

Here is my holiday jukebox code. It uses objects, arrays, and switches, to give
a clean and simple user interface for a virtual jukebox. When run, the user is
prompted to choose one of three options:
    1. insert payment (via a "digital nickel")
    2. view the current catalog of songs
    3. exit the jukebox
The array is full of hardcoded String and double variables containing song name
and length, as well as the artist or performer of each song. The switches are
used to create the "menu" of the jukebox, where the user can easily navigate
between options.

The layout of the array, as well as the object class, I created with inspiration
from nicolas.lankes objectifiedArrays package. I incorporated their style of
object array interaction into my Jukebox skeleton, and with some tinkering,
ended up with this. I hope this code may be used by someone in the future to
assist them in their coding journey. Thanks for reading! ~Tanner

 */
package TannersHolidayJukebox;

import java.util.Scanner;

/**
 *
 * @author Tanner
 */
public class Jukebox {
    
    public static void main(String[] args)  {
        
        JukeboxObjects firstSong = new JukeboxObjects();
        firstSong.setSongName("Jingle Bell Rock");
        firstSong.setArtistName("Bobby Helms ");
        firstSong.setSongLength(2.11);
        
        JukeboxObjects secondSong = new JukeboxObjects();
        secondSong.setSongName("Silent Night");
        secondSong.setArtistName("Frank Sinatra");
        secondSong.setSongLength(2.27);
        
        JukeboxObjects thirdSong = new JukeboxObjects();
        thirdSong.setSongName("It's The Most Wonderful Time of Year");
        thirdSong.setArtistName("Andy Williams");
        thirdSong.setSongLength(2.32);
        
        JukeboxObjects fourthSong = new JukeboxObjects();
        fourthSong.setSongName("Winter Wonderland");
        fourthSong.setArtistName("Bing Crosby");
        fourthSong.setSongLength(2.24);
        
        JukeboxObjects fifthSong = new JukeboxObjects();
        fifthSong.setSongName("Santa Claus is Coming to Town");
        fifthSong.setArtistName("The Jackson 5");
        fifthSong.setSongLength(2.24);
        
        JukeboxObjects sixthSong = new JukeboxObjects();
        sixthSong.setSongName("Joy to The World");
        sixthSong.setArtistName("Nat King Cole");
        sixthSong.setSongLength(1.25);
        
        JukeboxObjects seventhSong = new JukeboxObjects();
        seventhSong.setSongName("The Little Drummer Boy");
        seventhSong.setArtistName("Johnny Cash");
        seventhSong.setSongLength(2.32);
       
        JukeboxObjects eigthSong = new JukeboxObjects();
        eigthSong.setSongName("It's Beginning to Look a Lot Like Christmas");
        eigthSong.setArtistName("Michael Bublé");
        eigthSong.setSongLength(3.27);
      
        JukeboxObjects ninthSong = new JukeboxObjects();
        ninthSong.setSongName("White Christmas");
        ninthSong.setArtistName("Bing Crosby");
        ninthSong.setSongLength(3.02);
        
        JukeboxObjects tenthSong = new JukeboxObjects();
        tenthSong.setSongName("Silver Bells");
        tenthSong.setArtistName("Dean Martin");
        tenthSong.setSongLength(2.23);
        // songs available in the jukebox are stored as objects, using an array
        // to store song name, the artist or performer of the song, and the
        // length of the song.
        
        
        JukeboxObjects[] Songs = new JukeboxObjects[10];
        
        Songs[0] = firstSong;
        Songs[1] = secondSong;
        Songs[2] = thirdSong;
        Songs[3] = fourthSong;
        Songs[4] = fifthSong;
        Songs[5] = sixthSong;
        Songs[6] = seventhSong;
        Songs[7] = eigthSong;
        Songs[8] = ninthSong;
        Songs[9] = tenthSong;
        // the array for the songs available in the jukebox.           
        
       Scanner keyboardScanner = new Scanner(System.in);
        int userSelection;
        int songChoice;
        // establishing a keyboardScanner to detect user/customer input
        
        System.out.println("/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-");
        System.out.println("Welcome to Tanner's Holiday Jukebox!!");
        System.out.println("/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-");
        System.out.println("................................................");
        System.out.println("Press 1 to enter your digital nickel.");
        System.out.println("................................................");
        System.out.println("Press 2 to enter our current song catalog.");
        System.out.println("................................................");
        System.out.println("Press 3 to exit jukebox.");
        System.out.println("................................................");
        // the main user interface of the jukebox. three options are given
        // initially: entering payment, viewing the current catalog, and exiting
        // the jukebox
       
        userSelection = keyboardScanner.nextInt();
        // here, keyboardScanner is told to use the next user input as
        // userSelection for the first switch. this switch controls the main
        // operations of the jukebox.
        
        switch(userSelection){
            case 1:
                System.out.println("Digital nickel accepted! Please choose a song.");
                System.out.println(".........................................");
                // user has paid. now prompted to choose a song.
                songChoice = keyboardScanner.nextInt();
                // keyboardScanner dictating songChoice for the following switch
                switch(songChoice){
                    case 1:
                        JukeboxObjects accessedSong0 = Songs[0];
                        System.out.println("/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-");
                        System.out.println("Now listening to: " + accessedSong0.getSongName());
                        System.out.println("Artist: " + accessedSong0.getArtistName());
                        System.out.println("Length of song: " + accessedSong0.getSongLength());
                        break; // println giving out song info of chosen song 1
                    case 2:
                        JukeboxObjects accessedSong1 = Songs[1];
                        System.out.println("/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-");
                        System.out.println("Now listening to: " + accessedSong1.getSongName());
                        System.out.println("Artist: " + accessedSong1.getArtistName());
                        System.out.println("Length of song: " + accessedSong1.getSongLength());
                        break; // println giving out song info of chosen song 2
                    case 3:
                        JukeboxObjects accessedSong2 = Songs[2];
                        System.out.println("/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-");
                        System.out.println("Now listening to: " + accessedSong2.getSongName());
                        System.out.println("Artist: " + accessedSong2.getArtistName());
                        System.out.println("Length of song: " + accessedSong2.getSongLength());
                        break; // println giving out song info of chosen song 3
                    case 4:
                        JukeboxObjects accessedSong3 = Songs[3];
                        System.out.println("/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-");
                        System.out.println("Now listening to: " + accessedSong3.getSongName());
                        System.out.println("Artist: " + accessedSong3.getArtistName());
                        System.out.println("Length of song: " + accessedSong3.getSongLength());
                        break; // println giving out song info of chosen song 4
                    case 5:
                        JukeboxObjects accessedSong4 = Songs[4];
                        System.out.println("/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-");
                        System.out.println("Now listening to: " + accessedSong4.getSongName());
                        System.out.println("Artist: " + accessedSong4.getArtistName());
                        System.out.println("Length of song: " + accessedSong4.getSongLength());
                        break; // println giving out song info of chosen song 5
                    case 6:
                        JukeboxObjects accessedSong5 = Songs[5];
                        System.out.println("/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-");
                        System.out.println("Now listening to: " + accessedSong5.getSongName());
                        System.out.println("Artist: " + accessedSong5.getArtistName());
                        System.out.println("Length of song: " + accessedSong5.getSongLength());
                        break; // println giving out song info of chosen song 6
                    case 7:
                        JukeboxObjects accessedSong6 = Songs[6];
                        System.out.println("/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-");
                        System.out.println("Now listening to: " + accessedSong6.getSongName());
                        System.out.println("Artist: " + accessedSong6.getArtistName());
                        System.out.println("Length of song: " + accessedSong6.getSongLength());
                        break; // println giving out song info of chosen song 7
                    case 8:
                        JukeboxObjects accessedSong7 = Songs[7];
                        System.out.println("/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-");
                        System.out.println("Now listening to: " + accessedSong7.getSongName());
                        System.out.println("Artist: " + accessedSong7.getArtistName());
                        System.out.println("Length of song: " + accessedSong7.getSongLength());
                        break; // println giving out song info of chosen song 8
                    case 9:
                        JukeboxObjects accessedSong8 = Songs[8];
                        System.out.println("/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-");
                        System.out.println("Now listening to: " + accessedSong8.getSongName());
                        System.out.println("Artist: " + accessedSong8.getArtistName());
                        System.out.println("Length of song: " + accessedSong8.getSongLength());
                        break; // println giving out song info of chosen song 9
                    case 10:
                        JukeboxObjects accessedSong9 = Songs[9];
                        System.out.println("/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-");
                        System.out.println("Now listening to: " + accessedSong9.getSongName());
                        System.out.println("Artist: " + accessedSong9.getArtistName());
                        System.out.println("Length of song: " + accessedSong9.getSongLength());
                        break; // println giving out song info of chosen song 10
                } break; // case 1: chosen song will play, and song info given
            case 2:
                System.out.println("/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-"); 
                System.out.println("Here are the songs currently on rotation:");
                System.out.println(".........................................");
                System.out.println("1. Jingle Bell Rock ");
                System.out.println(".........................................");
                System.out.println("2. Silent Night");
                System.out.println(".........................................");
                System.out.println("3. It's The Most Wonderful Time of Year");
                System.out.println(".........................................");
                System.out.println("4. Winter Wonderland");
                System.out.println(".........................................");
                System.out.println("5. Santa Claus is Coming to Town");
                System.out.println(".........................................");
                System.out.println("6. Joy to The World");
                System.out.println(".........................................");
                System.out.println("7. The Little Drummer Boy");
                System.out.println(".........................................");
                System.out.println("8. It's Beginning to Look a Lot Like Christmas");
                System.out.println(".........................................");
                System.out.println("9. White Christmas");
                System.out.println(".........................................");
                System.out.println("10. Silver Bells");
                System.out.println(".........................................");
                break; // case 2: catalog of jukebox songs is given
            case 3:
                System.out.println("/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-");
                System.out.println("Have a good day!");
                System.out.println("/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-/|-");
                break; // how one exits the jukebox
           
        }// end main switch
        
    } //end method main
 
} // end Jukebox