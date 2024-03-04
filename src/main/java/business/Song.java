package business;

import java.util.Objects;

/**
 *
 * @author michelle
 */
/**
 * Represents a song with a title and an artist.
 */
public class Song {
    private String title;

    private String artist;

    /**
     * Constructs a default Song instance with predefined title and artist.
     */
    public Song(){
        this.title = "Mmmbop";
        this.artist = "Joe Bloggs";
    }

    /**
     * Constructs a Song instance with the specified title and artist.
     *
     * @param title The title of the song.
     * @param artist The artist of the song.
     */

    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    /**
     * Retrieves the title of the song.
     *
     * @return The title of the song.
     */

    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the song.
     *
     * @param title The title to be set for the song.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Retrieves the artist of the song.
     *
     * @return The artist of the song.
     */

    public String getArtist() {
        return artist;
    }

    /**
     * Sets the artist of the song.
     *
     * @param artist The artist to be set for the song.
     */

    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * Compares this song to the specified object. The result is true if and only if
     * the argument is not null and is a Song object that has the same title and artist
     * as this object.
     *
     * @param obj The object to compare this Song against.
     * @return true if the given object represents a Song equivalent to this song, false otherwise.
     */

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

    /**
     * Returns a hash code for this song.
     *
     * @return A hash code value for this object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(artist, title);
    }

    /**
     * Returns a string representation of this song, including its title and artist.
     *
     * @return A string representation of this song.
     */
    @Override
    public String toString() {
        return "Song{" + "title=" + title + ", artist=" + artist + '}';
    }

}
