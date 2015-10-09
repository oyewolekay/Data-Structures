package algorithms;

/**
 * Created by law on 06/10/2015.
 * 
 * This algorithms is designed to run at O(n) worst case
 */
public class BetterArray<T> {

    private T[] array;
    private T[] arrayDub;

    public BetterArray() {
        array = (T[]) new Object[0];
        arrayDub = null;
    }

    /**
     * Adds an element to the end of the BetterArray.
     *
     * @param element the element to be added to the end of the BetterArray
     */
    public void append(T element) {
        if (!isEmpty()) {
            arrayDub = (T[]) new Object[array.length + 1];
            for (int i = 0; i < size(); i++) {
                arrayDub[i] = array[i];
            }
            arrayDub[arrayDub.length - 1] = element;
            array = arrayDub;
            arrayDub = null;
        } else {
            array = (T[]) new Object[1];
            array[0] = element;
        }
    }

    /**
     * Adds multiple elements to the end of the BetterArray
     *
     * @param elements the elements in the order they are to be added to the end of the BetterArray
     */
    public void append(T... elements) {
        for (int i = 0; i < elements.length; i++) {
            append(elements[i]);
        }
    }

    /**
     * Inserts an element at a certain position of the BetterArray
     *
     * @param position the position that the new element will be added
     * @param element  the element to be added at the specified position
     * @return true if the element was successfully added and false if otherwise
     */
    public boolean insert(int position, T element) {
        boolean status = false;
        if (position == size()) {
            append(element);
            status = true;
        } else if (position > size()) {
            status = false;
        } else {
            addInMiddle(position, element);
        }
        return status;
    }

    private void addInMiddle(int position, T element) {
        arrayDub = (T[]) new Object[array.length + 1];
        boolean positionReached = false;
        for (int i = 0; i < arrayDub.length; i++) {
            if ((i + 1) > position && positionReached == false) {
                arrayDub[i] = element;
                positionReached = true;
            } else {
                if (positionReached) {
                    arrayDub[i] = array[i - 1];
                } else {
                    arrayDub[i] = array[i];
                }
            }
        }
        array = arrayDub;
    }

    /**
     * Shifts the element to the beginning of the BetterArray
     *
     * @param element the element to be shifted to the beginning of the BetterArray
     */
    public void shift(T element) {
        insert(0, element);
    }

    /**
     * Gets the index of the first appearance of the element
     *
     * @param element the element whose index is to be returned
     * @return the index of the element and -1 if the element is not found
     */
    public int index(T element) {
        int elementFound = -1;
        for (int i = 0; i < size(); i++) {
            if (array[i].equals(element)) {
                elementFound = i;
                break;
            }
        }

        return elementFound;
    }

    /**
     * Checks whether an element is present in the BetterArray
     *
     * @param element the element to check for in the BetterArray
     * @return <b>true</b> if the element is found and <b>false</b> if otherwise
     */
    public boolean contains(T element) {
        if (index(element) != -1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Gets the element at the index provided
     *
     * @param index the position to get the element
     * @return the element at position index
     * @throws ArrayIndexOutOfBoundsException Throws an ArrayIndexOutOfBoundsException when the index passed is greater than size of the BetterArray
     */
    public T get(int index) throws ArrayIndexOutOfBoundsException {
        return array[index];
    }

    /**
     * Removes the element at the identified index
     *
     * @param index the position at which to remove the element
     * @throws ArrayIndexOutOfBoundsException Throws an ArrayIndexOutOfBoundsException when the index passed is greater than size of the BetterArray
     */
    public void remove(int index) throws ArrayIndexOutOfBoundsException {
        arrayDub = (T[]) new Object[size() - 1];
        boolean indexReached = false;
        for (int i = 0; i < arrayDub.length; i++) {
            if (i >= index && !indexReached) {
                arrayDub[i] = array[i + 1];
                indexReached = true;
            } else {
                if (indexReached) {
                    arrayDub[i] = array[i + 1];
                } else {
                    arrayDub[i] = array[i];
                }
            }
        }
        array = arrayDub;
        arrayDub = null;
    }

    /**
     * Removes an element from the BetterArray
     *
     * @param element the element to be removed from teh BetterArray
     * @throws ArrayIndexOutOfBoundsException Throws an ArrayIndexOutOfBoundsException when the index passed is greater than size of the BetterArray
     */
    public void removeElement(T element) throws ArrayIndexOutOfBoundsException {
        arrayDub = (T[]) new Object[size() - 1];
        boolean indexReached = false;
        for (int i = 0; i < arrayDub.length; i++) {
            if (array[i].equals(element) && !indexReached) {
                arrayDub[i] = array[i + 1];
                indexReached = true;
            } else {
                if (indexReached) {
                    arrayDub[i] = array[i + 1];
                } else {
                    arrayDub[i] = array[i];
                }
            }
        }
        array = arrayDub;
        arrayDub = null;
    }

    /**
     * @return true if BetterArray is empty and false if otherwise
     */
    public boolean isEmpty() {
        if (size() > 0) {
            return false;
        } else {
            return true;
        }
    }


    /**
     * @return the size of the BetterArray
     */
    public int size() {
        return array.length;
    }

    /**
     * Clears all elements from the BetterArray
     */
    public void clear() {
        array = (T[]) new Object[0];
    }

    /**
     * @return Returns a string representing elements in the BetterArray
     */
    public String toString() {
        String theElements = "[";
        for (int i = 0; i < size(); i++) {
            if (i != size() - 1) {
                theElements += array[i] + ", ";
            } else {
                theElements += array[i];
            }
        }
        theElements += "]";

        return theElements;
    }
}
