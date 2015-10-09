package org.meltwater.java.datastructures;
import java.util.NoSuchElementException;

public class Queue<Item> {
	 private int N;               // number of elements on queue
	    private Node<Item> first;    // beginning of queue
	    private Node<Item> last;     // end of queue
	    
	    // helper linked list class
	    private static class Node<Item> {
	        private Item item;
	        private Node<Item> next;
	    }

	    /* Initialises an empty queue.*/
	    public Queue() {
	        first = null;
	        last  = null;
	        N = 0;
	    }

	    /* Returns true if this queue is empty.*/
	    public boolean isEmpty() {
	        return first == null;
	    }

	    /* Returns the number of items in this queue     */
	    public int size() {
	        return N;     
	    }

	    /* Returns the item least recently added to this queue */
	    public Item peek() {
	        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
	        return first.item;
	    }

	    /*Adds the item to this queue.*/
	    public void enqueue(Item item) {
	        Node<Item> oldlast = last;
	        last = new Node<Item>();
	        last.item = item;
	        last.next = null;
	        if (isEmpty()) first = last;
	        else           oldlast.next = last;
	        N++;
	    }

	    /*Removes and returns the item on this queue*/
	    public Item dequeue() {
	        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
	        Item item = first.item;
	        first = first.next;
	        N--;
	        if (isEmpty()) last = null;   // to avoid loitering
	        return item;
	    }

	    /* Returns a string representation of this queue.*/
	    public String toString() {
	        StringBuilder s = new StringBuilder();
//	        for (Item item : this)
//	            s.append(item + " ");
	        return s.toString();
	    } 
	}
