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
    private LinkedList<House> priorityQueueList;


    public PriorityQueueList() {
        priorityQueueList = new LinkedList<>();
    }

    public PriorityQueueList(PriorityQueueList other) {
        this.priorityQueueList = other.priorityQueueList;
    }

    public PriorityQueueList deepCopy(){
        return new PriorityQueueList(this);
    }

    @Override
    public void add(House a) {
        if(isEmpty()) {
            priorityQueueList.add(a); // if it is empty, add into
        }else {
            // insert value into linked-list (from high to lower)
            for(int i = 0;i<getLength();i++){
                House h = priorityQueueList.get(i);
                if(a.getValue() > h.getValue() ){
                    priorityQueueList.add(i,a); // add item in current position
                    break;
                }
            }
        }
    }

    @Override
    public House getMostExpensive() {
        if(!isEmpty()) {
            return priorityQueueList.removeFirst(); // if not a empty linked-list , remove first item
        }
        return null; // otherwise return null
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
