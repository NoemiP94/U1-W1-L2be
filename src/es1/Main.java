package es1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa");
        String insertWord = scanner.nextLine();
        System.out.println(stringaPariDispari(insertWord));

        scanner.close();
    }

    public static Boolean stringaPariDispari(String word){
        Boolean result = true;
        if((word.length() % 2) == 0){
            result = true;
        }else{
            result = false;
        }

        return result;
    }
}