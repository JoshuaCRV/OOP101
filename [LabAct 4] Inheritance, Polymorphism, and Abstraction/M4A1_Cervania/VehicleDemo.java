/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angieluz cervania
 */
public class VehicleDemo {

    public static void main(String[] args) {
        // instantiate one generic Vehicle and one specialized Bus
        Vehicle campusCart = new Vehicle("Campus Service Cart");
        Bus campusExpress = new Bus("Campus Express Shuttle", 40);

        System.out.println("--- Test 1: General Vehicle Output ---");
        System.out.println(campusCart.describeMovement());

        System.out.println("\n--- Test 2: Specialized Bus Output ---");
        System.out.println(campusExpress.describeMovement());

        System.out.println("\n--- Inheritance & Override Explanation ---");
        System.out.println("The Bus class inherited the vehicleName property and base describeMovement() behavior from Vehicle.");
        System.out.println("It overridden describeMovement() to reuse the base message using super.describeMovement() while adding specialized passenger capacity details.");
    }
}
