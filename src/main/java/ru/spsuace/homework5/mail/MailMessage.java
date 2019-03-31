package ru.spsuace.homework5.mail;

public class MailMessage extends MailTemplate<String> {
    public MailMessage(String sender, String recipient, String message) {
        super(sender, recipient, message);
    }
}
