package ru.spsuace.homework5.mail;

public interface MailContent<T> {
    String getSender();
    String getRecipient();
    T getMessage();
}
