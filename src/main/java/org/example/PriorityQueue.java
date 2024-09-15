package main.java.org.example;

/**
 * PriorityQueue Interface
 * Create an interface that contains the following methods:
 * 1. void add(House a) - Add a House object to the priority queue.
 * 2. House getMostExpensive() – Get the house with the highest value. Use the house’s value to
 * determine priority. The item should be removed from the priority queue.
 * 3. void clear() – Should clear all items from the priority queue.
 * 4. int getLength() – Returns the number of houses being stored in the priority queue.
 * 5. boolean isEmpty() – Returns true if the priority queue is empty.
 */

public interface PriorityQueue {
    void add(House a);
    House getMostExpensive();
    void clear();
    int getLength();
    boolean isEmpty();
}
