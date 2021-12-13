package mainpackage;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Veeti Pere
 */
public class BinaryHeap {

    private final Queue<Integer> priorityQueue;

    public BinaryHeap(){
        priorityQueue = new PriorityQueue<>();
    }
    public void insert(int value) {
        priorityQueue.add(value);
    }

    public int deleteMin() {
        if (priorityQueue.peek() != null)
            return priorityQueue.poll();
        return -1;
    }
    
    public void print() {
        Iterator<Integer> iterator = priorityQueue.iterator();
        int index = 0;
        while (iterator.hasNext()) // Parents are in the index (i / 2) and children are in the index (2 * i) and (2 * i + 1)
            System.out.println("Index " + (index + 1) + ": " + iterator.next() + ". Parent index: " +
                    (int)Math.floor(++index / 2) + ". Children indexes: " + (index * 2) + " and " + (index * 2 + 1));
    }

 
    public int head(){
        if (priorityQueue.peek() != null)
            return priorityQueue.peek();
        return -1;
    }

}
