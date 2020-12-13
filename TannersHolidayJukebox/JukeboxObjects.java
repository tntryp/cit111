/*
This program is made by me. It is entirely free use, as per the license
shown when accessing this code.

object class used in tandem with Jukebox class. for more information on the two
classes and how they work, see top of Jukebox.java
 */
package TannersHolidayJukebox;

/**
 *
 * @author Tanner
 */
public class JukeboxObjects {
    
    private String songName;
    private double songLength;
    private String artistName;
    
    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public double getSongLength() {
        return songLength;
    }

    public void setSongLength(double songLength) {
        this.songLength = songLength;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
    
}