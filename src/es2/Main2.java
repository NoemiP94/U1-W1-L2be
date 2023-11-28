package es2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero da 0 a 3");
        int insertNumber = Integer.parseInt(scanner.nextLine());
        System.out.println(numberInLetters(insertNumber));
    }

    public static String numberInLetters(int number) {
        switch (number) {
            case 0:
                return "Zero";
            case 1:
                return "Uno";
            case 2:
                return "Due";
            case 3:
                return "tre";
            default:
                return "ERRORE! Devi inserire un numero da 0 a 3!";
        }
    }


}
