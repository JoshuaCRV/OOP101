/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angieluz cervania
 */
public abstract class Message {

    private String recipient;

    // Constructor to initialize recipient
    public Message(String recipient) {
        this.recipient = recipient;
    }

    // Getter for recipient
    public String getRecipient() {
        return recipient;
    }

    // Abstract method to be overridden by subclasses
    public abstract void send();
}
