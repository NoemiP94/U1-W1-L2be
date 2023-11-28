package es4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int inputNumber = Integer.parseInt(scanner.nextLine());
        countdown(inputNumber);

        scanner.close();

    }

    public static void countdown(int number) {
        for (int i = number; i >= 0; i--) {
            System.out.println(i);;
        }
    }
}
