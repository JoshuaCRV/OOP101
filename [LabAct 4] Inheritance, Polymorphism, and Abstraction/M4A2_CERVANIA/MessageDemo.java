/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angieluz cervania
 */
public class MessageDemo {

    public static void main(String[] args) {
        // Instantiate specific message types
        EmailMessage email = new EmailMessage("student@feutech.edu.ph", "Campus Advisory");
        SmsMessage sms = new SmsMessage("Uriel Cervania", "+639171234567");

        // Array storing upcast Message references
        Message[] messages = {email, sms};

        System.out.println("--- Test 1: Dynamic Method Dispatch via Message[] Loop ---");
        for (Message msg : messages) {
            msg.send(); // Invokes the concrete send() implementation at runtime
        }

        System.out.println("\n--- Test 2: Status Check via Trackable Reference ---");
        // Interface upcasting
        Trackable tracker = email;
        tracker.showStatus();

        System.out.println("\n--- Upcasting & Dynamic Dispatch Explanation ---");
        System.out.println("Upcasting occurs when EmailMessage and SmsMessage objects are assigned to superclass (Message[]) or interface (Trackable) references.");
        System.out.println("Dynamic method dispatch resolves msg.send() and tracker.showStatus() at runtime to call the actual object's overridden method rather than the reference type's declaration.");
    }
}
