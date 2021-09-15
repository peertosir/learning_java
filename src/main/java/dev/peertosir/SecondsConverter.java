package dev.peertosir;

import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {
        convertSeconds(getSeconds());

    }

    public static int getSeconds(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа конвертирует скунды в месяцы/недели/дни/часы/минуты/секунды");
        System.out.println("Введите количество секунд:"); //2149200
        return scanner.nextInt();
    }

    public static void convertSeconds(int seconds) {
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
