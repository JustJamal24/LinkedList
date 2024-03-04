package utils;

import business.Song;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for LinkedList operations specifically tailored for Song objects.
 */
public class LinkedListExtraTests {

    public LinkedListExtraTests() {
        // Constructor for the test class.
    }

    /**
     * Tests adding a new node to an empty LinkedList.
     * Verifies that the size is updated correctly and the song is contained in the list.
     */
    @Test
    public void addNewNodeEmptyList() {
        LinkedList list = new LinkedList();
        Song song = new Song("Test Song", "Test Artist");

        list.add(song);

        assertEquals(1, list.size());
        assertTrue(list.contains(song));
    }

    /**
     * Tests adding nodes to a non-empty LinkedList.
     * Verifies that the list size is updated correctly and each node is added in order.
     */
    @Test
    public void addNonEmptyList() {
        LinkedList list = new LinkedList();
        Song song1 = new Song("Test Song 1", "Artist 1");
        Song song2 = new Song("Test Song 2", "Artist 2");

        list.add(song1);
        list.add(song2);

        assertEquals(2, list.size());
        assertEquals(song1, list.get(0));
        assertEquals(song2, list.get(1));
    }

    /**
     * Tests removing a song from an empty LinkedList.
     * Verifies that the method returns false, indicating no removal occurred.
     */
    @Test
    public void testRemoveAll_EmptyList() {
        LinkedList list = new LinkedList();
        Song song = new Song("Test Song 1", "Artist 1");

        boolean removed = list.removeAll(song);
        assertFalse(removed);
    }

    /**
     * Tests removing a song that is not present in the LinkedList.
     * Verifies that the method returns false, indicating no song was removed.
     */
    @Test
    public void testRemoveAll_ElementNotInList() {
        LinkedList list = new LinkedList();
        Song song1 = new Song("Test Song 1", "Artist 1");
        Song song2 = new Song("Test Song 2", "Artist 2");

        list.add(song1);
        boolean removed = list.removeAll(song2);
        assertFalse(removed);
    }

    /**
     * Tests removing a song that appears once in the LinkedList.
     * Verifies that the song is removed and the list size is updated correctly.
     */
    @Test
    public void testRemoveAll_SingleOccurrence() {
        LinkedList list = new LinkedList();
        Song song1 = new Song("Test Song 1", "Artist 1");
        Song song2 = new Song("Test Song 2", "Artist 2");

        list.add(song1);
        list.add(song2);
        boolean removed = list.removeAll(song1);
        assertTrue(removed);
        assertEquals(1, list.size());
        assertTrue(list.contains(song2));
    }

    /**
     * Tests removing a song that appears multiple times in the LinkedList.
     * Verifies that all instances of the song are removed and the list size is updated correctly.
     */
    @Test
    public void testRemoveAll_MultipleOccurrences() {
        LinkedList list = new LinkedList();
        Song song1 = new Song("Test Song 1", "Artist 1");
        Song song2 = new Song("Test Song 2", "Artist 2");

        list.add(song1);
        list.add(song1);
        list.add(song2);
        boolean removed = list.removeAll(song1);
        assertTrue(removed);
        assertEquals(1, list.size());
        assertTrue(list.contains(song2));
    }

    /**
     * Tests removing a song that is the first element in the LinkedList.
     * Verifies that the song is removed and the list size is updated correctly.
     */
    @Test
    public void testRemoveAll_FirstElement() {
        LinkedList list = new LinkedList();
        Song song1 = new Song("Test Song 1", "Artist 1");
        Song song2 = new Song("Test Song 2", "Artist 2");

        list.add(song1);
        list.add(song2);
        boolean removed = list.removeAll(song1);
        assertTrue(removed);
        assertEquals(1, list.size());
        assertTrue(list.contains(song2));
    }

    /**
     * Tests removing a song that is the last element in the LinkedList.
     * Verifies that the song is removed and the list size is updated correctly.
     */

    @Test
    public void testRemoveAll_LastElement() {
        LinkedList list = new LinkedList();
        Song song1 = new Song("Test Song 1", "Artist 1");
        Song song2 = new Song("Test Song 2", "Artist 2");
        list.add(song1);
        list.add(song2);
        list.tail();
        boolean removed = list.removeAll(song2);
        assertTrue(removed);
        assertEquals(1, list.size());
        assertTrue(list.contains(song1));
    }
}
