package main.java.org.example;

import java.io.*;
import java.util.Scanner;

/**
 * Assignment 1 – CSC 329 Data Structures and Algorithms II
 * Due: 9/17/2024 @ 9:25am
 * Main
 * Do the following in main:
 * • Open the house input file (will be in the homework folder on Brightspace)
 * Create an instance of the priority queue you implemented.
 * • Populate the priority queue with all data from the house file (the file contains data for
 * 1000 houses).
 * • Remove items from the priority queue one at a time and display them on screen. They
 * should be displayed in value order (highest to lowest) if it is properly implemented.
 * • Write code to show that all the required methods work properly. For example. Use the
 * copy constructor to create another instance. Display data from the instance created
 * using the copy constructor. Call deepCopy and show that it worked. Call getLength and
 * show that it returns the correct value. And so on
 */


public class Main {
    public static void main(String[] args){
        PriorityQueueList priorityQueueList = new PriorityQueueList();
        String path = "src/houses.txt";
        try (Scanner scnr = new Scanner(new File(path))){ // read the file

            while(scnr.hasNextLine()){ // read all texts
                House house = new House();

                String owner = scnr.nextLine();
                house.setOwner(owner); // string add to Owner

                if(scnr.hasNextInt()){
                    int value = scnr.nextInt();
                    house.setValue(value);  // number add to value
                }
                if(scnr.hasNextLine()){
                    scnr.nextLine(); // jump to next line
                }

                priorityQueueList.add(house);
            }

        }catch (FileNotFoundException e){
            System.out.println("Not found the file in " + path);
            e.printStackTrace();
        }
    /*
        while(!priorityQueueList.isEmpty()) {
            House h = priorityQueueList.getMostExpensive(); // get and remove fist item
            System.out.println(h.getOwner() + " : " + h.getValue()); // print all thing

        }

     */

        PriorityQueueList copylist = new PriorityQueueList(priorityQueueList);
        while(!copylist.isEmpty()) {
            House h = copylist.getMostExpensive(); // get and remove fist item
            System.out.println(h.getOwner() + " : " + h.getValue()); // print all thing

        }

    }
}