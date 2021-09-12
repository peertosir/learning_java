package dev.peertosir;

import java.util.Scanner;

public class CuttingLines {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        String str = "";
        boolean exit;
        do {
            System.out.println("Введите сообщение:");
            str = scr.nextLine();
            char[] ch = new char[10];
            if (str.length() <= 10)
                System.out.println(str);
            else if (str.length() > 10) {
                str.getChars(0, 9, ch, 0);
                ch[7] = '.';
                ch[8] = '.';
                ch[9] = '.';
                System.out.println(String.valueOf(ch));
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
