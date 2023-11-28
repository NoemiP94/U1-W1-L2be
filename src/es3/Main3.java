package es3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Inserisci una stringa");
            String input = scanner.nextLine();

        //se si inserisce la stringa definita
            if(":q".equals(input)){
                System.out.println("Fine");
                break;
            }

             //suddivisione in caratteri
            char[] characters = input.toCharArray();
            for (int i = 0; i < characters.length; i++){
                System.out.println(characters[i]);

                // aggiungere la virgola
                if( i< characters.length -1){
                    System.out.println(",");
                }
            }


        }




        scanner.close();

    }


}
