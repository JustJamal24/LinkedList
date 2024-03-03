package utils;

import business.Song;

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
