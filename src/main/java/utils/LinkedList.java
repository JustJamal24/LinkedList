package utils;

import org.w3c.dom.Node;

/**
 *
 * @author michelle
 */
public class LinkedList {

        private Node head;
        private Node tail;
        private int numberOfSongs;

        public LinkedList() {
                this.head = null;
                this.tail = null;
                this.numberOfSongs = 0;
        }

        public int size() {
                return this.numberOfSongs;
        }


}
