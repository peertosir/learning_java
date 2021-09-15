package dev.peertosir;

import java.util.Scanner;

public class StringClipper {

    public static void main(String[] args) {
        clipString(getText());
    }

    public static String getText(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа обрезает строку до 10 символов и заменяет последние символы на троеточние");
        System.out.println("Введите строку: ");
        String text = scanner.nextLine();
        return text;
    }

    public static void clipString(String text){
        if (text.length() > 10) {
            text = text.substring(0, 7) + "...";
        }
        System.out.println(text);
    }
}
