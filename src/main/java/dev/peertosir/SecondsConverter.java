package dev.peertosir;

import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа конвертирует скунды в месяцы/недели/дни/часы/минуты/секунды");
        System.out.println("Введите количество секунд:"); //2149200
        int seconds = scanner.nextInt();

        double minutes = seconds / 60;
        double hours = minutes / 60;
        double days = hours / 24;
        double weeks = days / 7;
        double months = weeks / 4;

        System.out.println(seconds + " secs -> "
                + months + " months "
                + weeks + " weeks "
                + days + " days "
                + hours + " hours "
                + minutes + " minutes "
                + seconds + " seconds");
    }
}
