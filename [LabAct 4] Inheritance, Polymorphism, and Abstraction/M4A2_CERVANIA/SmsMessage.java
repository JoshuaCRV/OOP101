/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angieluz cervania
 */
public class SmsMessage extends Message implements Trackable {

    private String phoneNumber;

    public SmsMessage(String recipient, String phoneNumber) {
        super(recipient);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send() {
        System.out.println("Sending SMS to " + getRecipient() + " at " + phoneNumber);
    }

    @Override
    public void showStatus() {
        System.out.println("SMS Status: Sent via cellular gateway to " + phoneNumber);
    }
}
