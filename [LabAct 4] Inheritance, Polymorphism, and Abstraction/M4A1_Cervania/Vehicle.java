/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angieluz cervania
 */
public class Vehicle {

    private String vehicleName;

    // Constructor to initialize vehicleName
    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    // Getter for vehicleName
    public String getVehicleName() {
        return vehicleName;
    }

    // Method defining general vehicle movement
    public String describeMovement() {
        return vehicleName + " is navigating across campus.";
    }
}
