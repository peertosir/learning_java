package dev.peertosir;

import java.util.Scanner;

public class StringClipper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа обрезает строку до 10 символов и заменяет последние символы на троеточние");
        System.out.println("Введите строку: ");
        String text = scanner.nextLine();

        if (text.length() > 10) {
            text = text.substring(0, 7) + "...";
        }
        System.out.println(text);
    }
}
