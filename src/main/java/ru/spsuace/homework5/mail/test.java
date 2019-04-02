package ru.spsuace.homework5.mail;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class test {
    public static void main(String[] arg) {


        MailService<String> mailService = new MailService<>();
        MailService<Integer> salaryService = new MailService<>();

        MailMessage message1 = new MailMessage("Sender1", "Recipient1", "msg1");
        MailMessage message2 = new MailMessage("Sender2", "Recipient2", "msg2");
        MailMessage message22 = new MailMessage("Sender22", "Recipient2", "msg22");
        MailMessage message222 = new MailMessage("Sender222", "Recipient2", "msg222");
        MailMessage message3 = new MailMessage("Sender3", "Recipient3", "msg3");

        Arrays.asList(message1, message2, message22, message222, message3).forEach(mailService);
        Map<String, List<String>> mails = mailService.getMailBox();
        System.out.println(mails.toString());

        Salary salary1 = new Salary("salSender1", "salRecipient1", 1);
        Salary salary11 = new Salary("salSender1", "salRecipient1", 11);
        Salary salary2 = new Salary("salSender2", "salRecipient2", 2);
        Salary salary3 = new Salary("salSender3", "salRecipient3", 3);

        Arrays.asList(salary1, salary11, salary2, salary3).forEach(salaryService);
        Map<String, List<Integer>> salaries = salaryService.getMailBox();
        System.out.println(salaries.toString());

    }
}
