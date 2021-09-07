package dev.peertosir;

import java.util.*;

public class SpamFiltre {
    public static void main(String[] args) throws Exception {
        Scanner scr1 = new Scanner(System.in);
        Scanner scr2 = new Scanner(System.in);
        String str = "";
        boolean exit = true;
        List<String> blackList = new ArrayList();
        blackList.add("XXX");
        blackList.add("Viagra");
        blackList.add("MONEYFREE");
        blackList.add("CASINO");
        blackList.add("Porn");
            do {
                System.out.println("Введите сообщение:");
                str = scr1.nextLine();
                String[] words = str.split("\\W+");
                for (String word : words) {
                    System.out.println(word);
                    for (String s : blackList) {
                        if (word.toLowerCase(Locale.ROOT).equals(s.toLowerCase(Locale.ROOT))) {
                            System.out.println(word + " - слово из черного списка!");
                        }
                    }
                }
                System.out.println("Продолжить ввод? y/n");
                str = scr2.nextLine();
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
