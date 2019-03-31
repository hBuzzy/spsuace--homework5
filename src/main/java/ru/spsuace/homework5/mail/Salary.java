package ru.spsuace.homework5.mail;

public class Salary extends MailTemplate<Integer> {

    public Salary(String sender, String recipient, Integer message) {
        super(sender, recipient, message);
    }
}
