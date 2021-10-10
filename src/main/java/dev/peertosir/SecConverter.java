package dev.peertosir;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SecConverter {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        long X;
        boolean exit = true;
        String str = "";
        try {
            do {
                System.out.println("Введите количество секунд:");
                X = scr.nextLong();
                if (X >= 0) {
                    if (X / 60 > 0) {
                        if (X / 3600 > 0) {
                            if (X / 86400 > 0) {
                                if (X / 604800 > 0) {
                                    if (X / 18144000 > 0) {
                                        System.out.print(X / 18144000 + " months ");
                                    }
                                    System.out.print(X / 604800 + " weeks ");
                                }
                                System.out.print(X / 86400 + " days ");
                            }
                            System.out.print(X / 3600 + " hours ");
                        }
                        System.out.print(X / 60 + " minutes ");
                    }
                    System.out.println(X + " seconds");
                }
                System.out.println("Продолжить ввод? y/n");
                scr.reset();
                scr = new Scanner(System.in);
                str = scr.nextLine();
                if (str.equals("y")) {
                    exit = true;
                } else if (str.equals("n")) {
                    exit = false;
                } else
                    throw new Exception("Ошибка ввода");
            }
            while (exit);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода");
        }
    }
}
