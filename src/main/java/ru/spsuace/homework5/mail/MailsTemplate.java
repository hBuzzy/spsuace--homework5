package ru.spsuace.homework5.mail;

public class MailsTemplate<T> {
    private String sender;
    private String recipient;
    private T message;

    MailsTemplate(String sender, String recipient, T message) {
        this.sender = sender;
        this.recipient = recipient;
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSender() {
        return sender;
    }

    public T getMessage() {
        return message;
    }
}
