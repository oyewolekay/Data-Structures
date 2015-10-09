package algorithms;

/**
 * Created by law on 07/10/2015.
 * 
 * This algorithms is designed to run at O(n) worst case
 */

public class LinkedList<LinkNode> {

    BetterArray<LinkNode> betterArray;

    public LinkedList() {
        betterArray = new BetterArray<>();
    }

    /**
     * Adds a LinkNode element to the LinkedList
     *
     * @param element LinkNode element to be added
     */
    public void add(LinkNode element) {
        betterArray.append(element);
    }

    /**
     * Adds a LinkNode element at a certain position
     *
     * @param position the position at which the element should be added
     * @param element the element of type LinkNode to be added at the position
     *
     * @throws ArrayIndexOutOfBoundsException Throws an ArrayIndexOutOfBoundsException when the index passed is greater than size of the LinkedList
     */
    public void add(int position, LinkNode element) throws ArrayIndexOutOfBoundsException {
        /*
        Change pointers here
         */
        betterArray.insert(size() - position, element);
        if(position > 0){
            ((algorithms.LinkNode) betterArray.get(position - 1)).setNext((algorithms.LinkNode) element);
        }
        ((algorithms.LinkNode) element).setNext((algorithms.LinkNode)betterArray.get(position + 1));
    }

    /**
     * Clears all elements from the LinkedList
     */
    public void clear(){
        betterArray.clear();
    }

    /**
     *
     * @return Returns the length of the LinkedList
     */
    public int size() {
        return betterArray.size();
    }

    /**
     * Checks if the element of type LinkNode is in the LinkedList
     *
     * @param element the element to find in the LinkedList
     * @return  returns true if the element was found and false if otherwise
     */
    public boolean contains(LinkNode element) {
        return betterArray.contains(element);
    }

    /**
     *
     * @return returns the LinkNode element that is at the start point
     */
    public LinkNode head(){
        return betterArray.get(size() - 1);
    }

    /**
     *
     * @return Returns the LinkNode element that is at the end of the LinkedList
     */
    public LinkNode tail() {
        return betterArray.get(0);
    }

    /**
     *
     * @return Returns true if the LinkedList is empty and false is otherwise
     */
    public boolean isEmpty(){
        return betterArray.isEmpty();
    }

    /**
     *
     * @return  Returns a String of LinkNodes in the LinkedList
     */
    public String toString() {
        String theElements = "";
        for (int i = size() - 1; i >= 0; i--) {
            if (i != 0) {
                theElements += "[" + ((algorithms.LinkNode) betterArray.get(i)).getValue() + "] -> ";
            } else {
                theElements += "[" + ((algorithms.LinkNode) betterArray.get(i)).getValue().toString() + "]";
            }
        }
        return theElements;
    }
}
