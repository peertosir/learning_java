package dev.peertosir;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuadraticEq {
    public static void main(String[] args) throws Exception {
        Scanner enterInt = new Scanner(System.in);
        Scanner scr = new Scanner(System.in);
        String str = "";
        int a, b, c, d;
        boolean exit;
        try {
            do {
                System.out.print("a = ");
                a = enterInt.nextInt();
                System.out.print("b = ");
                b = enterInt.nextInt();
                System.out.print("c = ");
                c = enterInt.nextInt();
                System.out.println("Квадратное уравнение: " + "\n" + a + "x^2 + " + b + "x + " + c + " = 0");
                d = b * b - 4 * a * c;
                if (d > 0) {
                    double x1, x2;
                    x1 = (-b - Math.sqrt(d)) / (2 * a);
                    x2 = (-b + Math.sqrt(d)) / (2 * a);
                    System.out.println("D = " + d + "\nx1 = " + x1 + "\nx2 = " + x2);
                } else if (d == 0) {
                    double x;
                    x = -b / (2 * a);
                    System.out.println("D = " + d + "\nx = " + x);
                } else {
                    System.out.println("Корней нет");
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
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода");
        }
    }
}
