package main.java.org.example;

/**
 * House Class Specifications
 * 1. Include member variables for owner(String), value(int)
 * 2. Write a default constructor.
 * 3. Write a constructor that takes values for all member variables as parameters.
 * 4. Write a copy constructor (should be a DEEP COPY of the parameter). Here is the prototype:
 * House(House other)
 * 5. Implement get/set methods for all member variables.
 * 6. Write a deepCopy method (should be a DEEP COPY of the current instance). Here is the
 * prototype:
 * House deepCopy()
 * 7. Implement an equals override. It should return a value based on the “values” and not the
 * “references”. It should return true if the owners are equal (do a value compare on the
 * owners).
 */
public class House{
    String owner;
    int value;

    public House() {
    }

    public House(String owner, int value) {
        this.owner = owner;
        this.value = value;
    }

    // DEEP COPY of the current instance
    public House(House other){
        other =deepCopy();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public House deepCopy(){
        return this;
    }

    //7. Implement an equals override. It should return a value based on the “values” and not the
    // * “references”. It should return true if the owners are equal (do a value compare on the
    // * owners).
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }

        if(!obj.equals(value)){
            return false;
        }

        return true;
    }


}
