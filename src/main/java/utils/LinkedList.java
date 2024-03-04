package utils;

import business.Song;

import java.sql.SQLOutput;

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

        public void add(Song toBeAdded) {
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

        public boolean isEmpty() {
                if(head == null) {
                        return true;
                }
                return false;
        }
        // A method called tail() that takes no parameters. This should return the last element in the list.
        public Song tail() {
                if(head == null) {
                        return null;
                }
                else{
                        Node current = head;
                        while(current.getNext()!= null) {
                                current = current.getNext();
                        }
                        return current.getData();
                }

        }

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
