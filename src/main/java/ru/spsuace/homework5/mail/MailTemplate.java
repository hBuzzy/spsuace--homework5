package ru.spsuace.homework5.mail;

public abstract class MailTemplate<T> implements MailContent<T> {

    private String sender;
    private String recipient;
    private T message;

    MailTemplate(String sender, String recipient, T message) {
        this.sender = sender;
        this.recipient = recipient;
        this.message = message;
    }

    @Override
    public String getSender() {
        return sender;
    }

    @Override
    public String getRecipient() {
        return recipient;
    }

    @Override
    public T getMessage() {
        return message;
    }
}
