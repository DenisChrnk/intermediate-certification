package intermediate_certification;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.print("Введите длину забора в сантиметрах: ");
        Scanner scanner = new Scanner(System.in);
        int inpputValue = scanner.nextInt();

        if (inpputValue < 346) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}
