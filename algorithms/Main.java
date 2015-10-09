package algorithms;

/*
 * The main class demonstrates the functionality of the custom BetterArray, LinkedList & QueueImp
 */

public class Main {

    public static void main(String[] args) {
        /*
        Test case for better array
         */
        System.out.println("-------------------------------------------------------------");
        System.out.println("----------------  Better Array Test Case  -------------------");
        System.out.println("-------------------------------------------------------------");

        BetterArray<Integer> betterArray = new BetterArray<>();
        betterArray.append(1);
        betterArray.append(2);
        betterArray.append(3);

        betterArray.append(4, 5, 6, 7);

        betterArray.append(8, 9, 10);

        betterArray.shift(100);

        betterArray.insert(4, 200);

        System.out.println("\nValues in array :=> " + betterArray.toString());

        System.out.println("\nIndex of 200 :=> " + betterArray.index(200));

        betterArray.remove(4);

        System.out.println("\nRemove value at index 4 :=> " + betterArray.toString());

        betterArray.removeElement(10);

        System.out.println("\nRemove element 10 :=> " + betterArray.toString());


        /*
        Test case for LinkedList
         */
        System.out.println("\n\n-------------------------------------------------------------");
        System.out.println("----------------   LinkedList Test Case  --------------------");
        System.out.println("-------------------------------------------------------------");

        LinkedList<LinkNode<Integer>> linkedList = new LinkedList<>();

        LinkNode<Integer> linkNode5 = new LinkNode<>(5, null);
        linkedList.add(linkNode5);
        LinkNode<Integer> linkNode4 = new LinkNode<>(4, linkNode5);
        linkedList.add(linkNode4);
        LinkNode<Integer> linkNode3 = new LinkNode<>(3, linkNode4);
        linkedList.add(linkNode3);
        LinkNode<Integer> linkNode2 = new LinkNode<>(2, linkNode3);
        linkedList.add(linkNode2);
        LinkNode<Integer> linkNode1 = new LinkNode<>(1, linkNode2);
        linkedList.add(linkNode1);

        System.out.println("\nLinedList :=> " + linkedList.toString());

        LinkNode<Integer> linkNode6 = new LinkNode<>(6, linkNode5);
        linkedList.add(2, linkNode6);

        System.out.println("\nAdd LinkNode 6 at index 2 :=> " + linkedList.toString());

        System.out.println("\nLinkedList contains Node 6 :=> " + linkedList.contains(linkNode6));

        LinkNode<Integer> linkNode7 = new LinkNode<>(7, linkNode6);
        System.out.println("\nLinkedList contains Node 7 :=> " + linkedList.contains(linkNode7));

        System.out.println("\nValue of LinkedList Head :=> " + linkedList.head().getValue());
        System.out.println("\nValue of LinkedList Tail :=> " + linkedList.tail().getValue());

        System.out.println("\nLinkedList is Empty :=> " + linkedList.isEmpty());

        linkedList.clear();
        System.out.println("\nLinkedList cleared..");
        System.out.println("\nLinkedList is Empty :=> " + linkedList.isEmpty());

        System.out.println("\nLinkedList size :=> " + linkedList.size());

        /*
        Test case for Queue
         */
        System.out.println("\n\n-----------------------------------------------------------------");
        System.out.println("---------------------   Queue Test Case  ------------------------");
        System.out.println("-----------------------------------------------------------------");

        QueueImp<Integer> queueImp = new QueueImp<>();

        queueImp.push(1);
        queueImp.push(2);
        queueImp.push(3, 4, 5);

        System.out.println("\nQueue :=> " + queueImp.toString());
        System.out.println("\nIs Queue empty : " + queueImp.isEmpty());

        queueImp.pop();
        System.out.println("\nPop from Queue :=> " + queueImp.toString());

        queueImp.remove(2);
        System.out.println("\nRemove element at position 2 :=> " + queueImp.toString());

        System.out.println("\nQueue contains 4 :=> " + queueImp.contains(4));
        System.out.println("\nQueue contains 5 :=> " + queueImp.contains(5));

        System.out.println("\nPeek from Queue :=> " + queueImp.peek());
        System.out.println("\nCurrent Queue :=> " + queueImp.toString());

        queueImp.clear();
        System.out.println("\nClear Queue :=> " + queueImp.toString());
        System.out.println("\nIs Queue empty : " + queueImp.isEmpty());

        /*
        Test case for Stack
         */
        System.out.println("\n\n-----------------------------------------------------------------");
        System.out.println("---------------------   Stack Test Case  ------------------------");
        System.out.println("-----------------------------------------------------------------");

        StackImp<Integer> stackImp = new StackImp<>();

        stackImp.push(1);
        stackImp.push(2);
        stackImp.push(3, 4, 5);

        System.out.println("\nStack :=> " + stackImp.toString());
        System.out.println("\nIs Stack empty : " + stackImp.isEmpty());

        stackImp.pop();
        System.out.println("\nPop from Stack :=> " + stackImp.toString());

        stackImp.remove(2);
        System.out.println("\nRemove element at position 2 :=> " + stackImp.toString());

        System.out.println("\nStack contains 4 :=> " + stackImp.contains(4));
        System.out.println("\nStack contains 5 :=> " + stackImp.contains(5));

        System.out.println("\nPeek from Stack :=> " + stackImp.peek());
        System.out.println("\nCurrent Stack :=> " + stackImp.toString());

        stackImp.clear();
        System.out.println("\nClear Stack :=> " + stackImp.toString());
        System.out.println("\nIs Stack empty : " + stackImp.isEmpty());

         /*
        Test case for Stack
         */
        System.out.println("\n\n-----------------------------------------------------------------");
        System.out.println("------------------------  Set Test Case  ------------------------");
        System.out.println("-----------------------------------------------------------------");

        SetImp<Integer> setImp = new SetImp<>();
        System.out.println("\nIs set empty :=> " + setImp.isEmpty());

        setImp.add(1, 2, 3, 4);
        System.out.println("\nAdd 1, 2, 3, 4");
        System.out.println("\nSet :=> " + setImp.toString());

        setImp.add(3);
        System.out.println("\nAdd 3 to the set :=> " + setImp.toString() + " (3 since it's already in the Set)");

        setImp.add(2, 100);
        System.out.println("\nAdd 100 at position 2 :=> " + setImp.toString());

        System.out.println("\nIs set empty :=> " + setImp.isEmpty());
    }
}
