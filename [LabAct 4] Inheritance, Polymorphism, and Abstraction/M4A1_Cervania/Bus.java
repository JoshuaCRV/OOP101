/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angieluz cervania
 */
public class Bus extends Vehicle {

    private int capacity;

    // Constructor invoking superclass constructor and initializing capacity
    public Bus(String vehicleName, int capacity) {
        super(vehicleName);
        this.capacity = capacity;
    }

    // Getter for capacity
    public int getCapacity() {
        return capacity;
    }

    // Overridden method reusing superclass behavior via super.describeMovement()
    @Override
    public String describeMovement() {
        return super.describeMovement() + " Carrying up to " + capacity + " passengers.";
    }
}
