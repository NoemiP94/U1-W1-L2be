package es1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa");
        String insertWord = scanner.nextLine();
        System.out.println(stringaPariDispari(insertWord));

        System.out.println("Inserisci un anno");
        int insertYear = Integer.parseInt(scanner.nextLine());
        System.out.println(annoBisestile(insertYear));

        scanner.close();
    }

    public static Boolean stringaPariDispari(String word) {
        Boolean result;
        if ((word.length() % 2) == 0) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    public static Boolean annoBisestile(int year) {
        Boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            }else {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }

}