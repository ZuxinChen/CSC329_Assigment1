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
    private String owner;
    private int value;

    public House() {
        this.owner ="";
        this.value = 0;
    }

    public House(String owner, int value) {
        this.owner = owner;
        this.value = value;
    }

    // DEEP COPY of the current instance
    public House(House other){
        this.owner = new String(other.owner);
        this.value = other.value;
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
        return new House(this);
    }

    //7. Implement an equals override. It should return a value based on the “values” and not the
    // * “references”. It should return true if the owners are equal (do a value compare on the
    // * owners).
    @Override
    public boolean equals(Object obj){
        if(obj == null){ // not null
            return false;
        }
        if(this.getClass() != obj.getClass()){ // not in same class
            return false;
        }
        if(this == obj){ // it is self
            return true;
        }

        House otherHouse = (House) obj; // casting to House type
        // it is true if value and owners are equal to obj
        return this.value == otherHouse.value && this.owner.equals(otherHouse.owner);

    }


}
