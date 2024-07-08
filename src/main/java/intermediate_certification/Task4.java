package intermediate_certification;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        int totalScorePlayer = 0;
        int totalScoreCompucter = 0;
        RandomForGame game = new RandomForGame();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 6; i++) {

            int computerSelection = game.randomValue();

            System.out.print("Введите букву к - камень, н - ножницы или б - бумага: ");

            String myValue = scanner.nextLine();

            int playerValue = 0;

            switch (myValue) {
                case "к":
                    playerValue = 1;
                    break;
                case "н":
                    playerValue = 2;
                    break;
                case "б":
                    playerValue = 3;
                    break;
            }


            if (playerValue == 1 && computerSelection == 2) {
                totalScorePlayer = totalScorePlayer + 1;
            } else if (playerValue == 1 && computerSelection == 3) {
                totalScoreCompucter = totalScoreCompucter + 5;
            } else if (playerValue == 2 && computerSelection == 1) {
                totalScoreCompucter = totalScoreCompucter + 1;
            } else if (playerValue == 2 && computerSelection == 3) {
                totalScorePlayer = totalScorePlayer + 2;
            } else if (playerValue == 3 && computerSelection == 1) {
                totalScorePlayer = totalScorePlayer + 5;
            } else if (playerValue == 3 && computerSelection == 2) {
                totalScoreCompucter = totalScoreCompucter + 2;
            }


        }
        if (totalScorePlayer < totalScoreCompucter) {
            System.out.println("Компьютер выйграл со счетом " + totalScoreCompucter + " : " + totalScorePlayer);
        }
        if (totalScorePlayer > totalScoreCompucter) {
            System.out.println("Вы победили со счетом " + totalScorePlayer + " : " + totalScoreCompucter);
        }


    }
}


