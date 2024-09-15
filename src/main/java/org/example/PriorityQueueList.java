package main.java.org.example;

import java.util.LinkedList;

/**
 * PriorityQueueList Class
 * Create a linked version of a priority queue that stores instances of House. You must implement
 * the List yourself. DO NOT USE A JAVA COLLECTION CLASS FOR THE LIST! You are required to
 * code it yourself.
 * PriorityQueueList Specifications
 * 1. Create private members as necessary.
 * 2. Implement the PriorityQueue interface. The add method should add data to the front of the
 * linked list.
 * 3. Your class must also write the following methods (use the given method headers):
 * a. Default constructor.
 * b. Copy constructor (should be a DEEP COPY of the parameter). Here is the prototype:
 * PriorityQueueList(PriorityQueueList other)
 * c. PriorityQueueList deepCopy() - Write a deepCopy method (should return a DEEP COPY
 * of the current instance).
 */
public class PriorityQueueList implements PriorityQueue{
    LinkedList priorityQueueList = new LinkedList<House>();

    public PriorityQueueList() {
    }

    public PriorityQueueList(PriorityQueueList other) {
        other = deepCopy();
    }

    public PriorityQueueList deepCopy(){
        return this;
    }

    @Override
    public void add(House a) {
        priorityQueueList.add(a);
    }

    @Override
    public House getMostExpensive() {
        return null;
    }

    @Override
    public void clear() {
        priorityQueueList.clear();
    }

    @Override
    public int getLength() {
        return priorityQueueList.size();
    }

    @Override
    public boolean isEmpty() {
        return priorityQueueList.isEmpty();
    }
}
