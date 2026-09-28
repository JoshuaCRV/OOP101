/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angieluz cervania
 */
public class EmailMessage extends Message implements Trackable {
    private String subject;

    public EmailMessage(String recipient, String subject) {
        super(recipient);
        this.subject = subject;
    }

    @Override
    public void send() {
        System.out.println("Sending Email to " + getRecipient() + " | Subject: " + subject);
    }

    @Override
    public void showStatus() {
        System.out.println("Email Status: Delivered to mail server for " + getRecipient());
    }
}
