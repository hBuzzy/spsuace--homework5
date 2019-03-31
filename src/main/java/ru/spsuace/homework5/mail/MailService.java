package ru.spsuace.homework5.mail;


import java.util.*;
import java.util.function.Consumer;

/**
 * Нужно создать сервис, который умеет обрабатывать обрабатывать письма и зарплату.
 * Письма состоят из получателя, отправителя, текста сообщения
 * Зарплата состоит из получателя, отправителя и суммы.
 *
 * В реализации нигде не должно быть классов Object и коллекций без типа. Используйте дженерики.
 *
 * Оценка за задание 4 балла (еще 2 балла можно получить дополнительно)
 */
public class MailService<T> implements Consumer<MailContent<T>> {
    private Map<String, List<T>> mailMap = new HashMap<>();
    /**
     * С помощью этого метода почтовый сервис обрабатывает письма и зарплаты
     * 1 балл
     */

    @Override
    public void accept(MailContent<T> message) {
        List<T> list = mailMap.get(message.getRecipient());

        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(message.getMessage());
        mailMap.put(message.getRecipient(), list);
    }

    /**
     * Метод возвращает мапу получатель -> все объекты которые пришли к этому получателю через данный почтовый сервис
     */
    public Map<String, List<T>> getMailBox() {
        return mailMap;
    }


    /**
     * Метод должен заставить обработать service все mails.
     * 1 балл за любое решение (2 балла за красивое)
     */
    public static void process(MailService service, List mails) {

    }
}
