package dev.peertosir;

import java.util.*;

public class SpamFiltre {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        String str = "";
        boolean exit = true;
        HashSet<String> blackList = new HashSet<String>();
        blackList.add("xxx");
        blackList.add("viagra");
        blackList.add("moneyfree");
        blackList.add("casino");
        blackList.add("porn");
            do {
                System.out.println("Введите сообщение:");
                str = scr.nextLine();
                String[] words = str.split("\\W+");
                for (String word : words) {
                    for (String s : blackList) {
                        if (word.toLowerCase(Locale.ROOT).equals(s)) {
                            System.out.println(word + " - слово из черного списка!");
                        }
                    }
                }
                System.out.println("Продолжить ввод? y/n");
                str = scr.nextLine();
                if (str.equals("y")) {
                    exit = true;
                } else if (str.equals("n")) {
                    exit = false;
                } else
                    throw new Exception("Ошибка ввода");
            }
            while (exit);

    }
}
