package algorithms;

/**
 * Created by law on 07/10/2015.
 * 
 * This algorithms is designed to run at O(n) worst case
 */
public class QueueImp<T> {

    T[] array;
    T[] arrayDub;

    /**
     * pushes an element to the back of the Queue
     *
     * @param element the element to be pushed to the queue
     */
    public void push(T element) {
        if (array == null) {
            array = (T[]) new Object[1];
            array[0] = element;
        } else {
            arrayDub = (T[]) new Object[array.length + 1];
            for (int i = 0; i < size(); i++) {
                arrayDub[i] = array[i];
            }
            arrayDub[size()] = element;
            array = arrayDub;
            arrayDub = null;
        }
    }

    /**
     * Pushes multiple elements to the end of the queue in the order they are to be added
     *
     * @param elements the elements to be pushed to the queue
     */
    public void push(T... elements){
        for(T element : elements){
            push(element);
        }
    }

    /**
     * Remove element from a position
     *
     * @param position the position at which to remove the element
     */
    public void remove(int position) {
        arrayDub = (T[]) new Object[size() - 1];
        boolean positionReached = false;
        for (int i = 0; i < arrayDub.length; i++) {
            if (i == position && !positionReached) {
                arrayDub[i] = array[i + 1];
                positionReached = true;
            }else{
                if(positionReached){
                    arrayDub[i] = array[i + 1];
                }else{
                    arrayDub[i] = array[i];
                }
            }
        }
        array = arrayDub;
        arrayDub = null;
    }

    /**
     *
     * @return the first value of the queue
     */
    public T peek() {
        return array[0];
    }

    /**
     * Removes the first value from the queue
     */
    public void pop() {
        remove(0);
    }

    /**
     * Checks if the element is present in the queue
     *
     * @param element the element to check for in the queue
     * @return true if the element is found and false if otherwise
     */
    public boolean contains(T element) {
        boolean elementFound = false;
        for(int i = 0; i < size(); i++){
            if(array[i] == element){
                elementFound = true;
                break;
            }
        }
        return elementFound;
    }

    /**
     *
     * @return true if the queue is empty and false if otherwise
     */
    public boolean isEmpty() {
        if(size() == 0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Clears all elements from the queue
     */
    public void clear() {
        array = (T[]) new Object[0];
    }

    /**
     *
     * @return the length of the queue
     */
    public int size() {
        return array.length;
    }

    /**
     *
     * @return a String representation of the queue
     */
    public String toString() {
        String theElements = "[";
        if(array == null){
            theElements = "Queue has no elements";
        }else{
            for (int i = 0; i < size(); i++) {
                if (i != size() - 1) {
                    theElements += array[i] + ", ";
                } else {
                    theElements += array[i];
                }
            }
            theElements += "]";
        }

        return theElements;
    }

}
