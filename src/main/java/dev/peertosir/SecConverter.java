package dev.peertosir;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SecConverter {
    public static void main(String[] args) throws Exception {
        Scanner scr1 = new Scanner(System.in);
        Scanner scr2 = new Scanner(System.in);
        double X;
        boolean exit = true;
        String str = "";
        DecimalFormat df = new DecimalFormat("#.00");
        try {
            do {
                System.out.println("Введите количество секунд:");
                X = scr1.nextDouble();
                System.out.println(X + " secs -> " + df.format(X / 18144000) +
                        " months " + df.format(X / 604800) + " weeks " + df.format(X / 86400) +
                        " days " + df.format(X / 3600) + " hours " + df.format(X / 60) + " minutes " +
                        X + " seconds");
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
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода");
        }
    }
}
