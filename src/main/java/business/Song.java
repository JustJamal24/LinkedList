package business;

import java.util.Objects;

/**
 *
 * @author michelle
 */
public class Song {
    private String title;

    private String artist;

    public Song(){
        this.title = "Mmmbop";
        this.artist = "Joe Bloggs";
    }

    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
   public boolean equals(Object obj) {
        if (obj == null) {
            //check for null
            return false;
        }
        if (getClass()!= obj.getClass()) {
            //check if instance is of the same type
            return false;
        }
         Song song = (Song) obj;
        // check for null fields
        if ((this.title == null)? (song.title!= null) :!this.title.equals(song.title)) {
            return false;
        }
        // check for null fields
        if ((this.artist == null)? (song.artist!= null) :!this.artist.equals(song.artist)) {
            return false;
        }
        return true;
    }
    @Override
    public int hashCode() {
        return Objects.hash(artist, title);
    }

    @Override
    public String toString() {
        return "Song{" + "title=" + title + ", artist=" + artist + '}';
    }
}
