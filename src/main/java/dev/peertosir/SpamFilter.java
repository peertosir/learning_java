package dev.peertosir;

import java.util.Scanner;

public class SpamFilter {
    public static void main(String[] args) {

       filterMessage(getMessage());

    }

    public static String getMessage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа анализирует текст сообщения на спам фразы");
        System.out.println("Введите текст сообщения: ");
        String text = scanner.nextLine();
        return text;
    }

    public static void filterMessage(String text){
        if (text.contains("xxx") |
                text.contains("viagra") |
                text.contains("moneyfree") |
                text.contains("casino") |
                text.contains("porn")) {
            System.out.println("Текст сообщения содержит спам фразы");
        } else {
            System.out.println("Текст сообщения не содержит спам фраз");
        }
    }
}
