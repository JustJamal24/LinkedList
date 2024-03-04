package utils;

import business.Song;

import java.sql.SQLOutput;

/**
 *
 * @author michelle
 */

/**
 * A linked list implementation specifically for storing Song objects.
 */
public class LinkedList {

        private Node head;
        private Node tail;
        private int numberOfSongs;

        /**
         * Constructs an empty LinkedList.
         */
        public LinkedList() {
                this.head = null;
                this.tail = null;
                this.numberOfSongs = 0;
        }

        /**
         * Returns the number of songs in the list.
         *
         * @return The number of songs.
         */

        public int size() {
                return this.numberOfSongs;
        }

        /**
         * Retrieves the song at the specified position in the list.
         *
         * @param position The index of the song to retrieve.
         * @return The song at the specified position.
         * @throws IndexOutOfBoundsException If the index is out of range (index < 0 || index >= size()).
         */

        public Song get(int position) {
                if (position < 0 || position >= numberOfSongs) {
                        throw new IndexOutOfBoundsException("Illegal position has been passed to the LinkedList" + position);
                }
                Node current = head;

        for (int i = 0; i < position; i++) {
            current = current.getNext();
        }
        return current.getData();

        }


        /**
         * Returns the index of the first occurrence of the specified song in this list,
         * or -1 if this list does not contain the song.
         *
         * @param toBeFound The song to search for.
         * @return The index of the first occurrence of the specified song in this list,
         *         or -1 if this list does not contain the song.
         */

        public int indexOf(Song toBeFound) {
                int index = 0;
                Node current = head;
                while (current!= null) {
                        if (current.getData().equals(toBeFound)) {
                                return index;
                        }
                        current = current.getNext();
                        index++;
                }
                return -1;
        }

        /**
         * Adds a new song to the end of the list.
         *
         * @param toBeAdded The song to be added.
         */

        public void add(Song toBeAdded) {
                if(contains(toBeAdded)) {
                        return;
                }
                Node newNode = new Node(toBeAdded);
                if (head == null) {
                        head = newNode;
                } else {
                        Node current = head;
                        while (current.getNext() != null) {
                                current = current.getNext();
                        }
                        current.setNext(newNode);
                }
                numberOfSongs++;
        }

        /**
         * Checks if the list is empty.
         *
         * @return true if the list is empty, false otherwise.
         */

        public boolean isEmpty() {
                if(head == null) {
                        return true;
                }
                return false;
        }

        /**
         * Returns the last song in the list.
         *
         * @return The last song in the list.
         */
        public Song tail() {
                if(head == null) {
                        return null;
                }
                else{
                        Node current = head;
                        while(current.getNext()!= null) {
                                current = current.getNext();
                        }

                        tail = current;
                        return current.getData();
                }

        }

        /**
         * Checks if the list contains the specified song.
         *
         * @param toBeFound The song to find in the list.
         * @return true if the song is found, false otherwise.
         */

        public boolean contains(Song toBeFound) {
                Node current = head;
                while (current!= null) {
                        if (current.getData().equals(toBeFound)) {
                                return true;
                        }
                        current = current.getNext();
                }
                return false;
        }

        /**
         * Removes all instances of the specified song from the list.
         *
         * @param toBeRemoved The song to be removed.
         * @return true if at least one instance was removed, false otherwise.
         */

        public boolean removeAll(Song toBeRemoved) {
                if(toBeRemoved == null) {
                        return false;
                }
                Node current = head;
                Node previous = null;
                while (current!= null) {
                        if (current.getData().equals(toBeRemoved)) {
                                if (previous == null) { // current is at the head
                                        head = current.getNext(); // remove the current node
                                } else {
                                        previous.setNext(current.getNext());
                                }
                                numberOfSongs--;
                                return true;
                        }
                        previous = current; // update the previous node
                        current = current.getNext(); // update the current node
                }
                return false;
        }

        /**
         * A nested static class to define the node structure for the linked list.
         */
        protected static class Node {
                private Song data;
                private Node next;

                public Node(Song data) {
                        this.data = data;
                        this.next = null;
                }

                public void setNext(Node next) {
                        this.next = next;
                }

                public Node getNext() {
                        return this.next;
                }

                public void setData(Song data) {
                        this.data = data;
                }

                public Song getData() {
                        return this.data;
                }


        }
}
