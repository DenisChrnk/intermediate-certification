package intermediate_certification;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.print("Введите дату последнего полива в форма год-месяц-день: ");
        Scanner scanner = new Scanner(System.in);
        LocalDate dateLastWatering = LocalDate.parse(scanner.nextLine());


        Month monthValue = dateLastWatering.getMonth();
        boolean winterSeason = monthValue == Month.DECEMBER || monthValue == Month.JANUARY || monthValue == Month.FEBRUARY;
        boolean summerSeason = monthValue == Month.JUNE || monthValue == Month.JULY || monthValue == Month.AUGUST;
        boolean autumnSesson = monthValue == Month.SEPTEMBER || monthValue == Month.NOVEMBER || monthValue == Month.DECEMBER;
        boolean springSeason = monthValue == Month.MARCH || monthValue == Month.APRIL || monthValue == Month.MAY;

        Season season = null;

        if (winterSeason) {
            season = new Winter();
        }
        if (summerSeason) {
            season = new Summer();
        }
        if (autumnSesson) {
            season = new Autumn();
        }
        if (springSeason) {
            season = new Spring();
        }

        LocalDate dateOfWatering = season.getNextDateWatering(dateLastWatering);
        if (dateOfWatering == null) {
            System.out.println("Поливать не надо");
        } else {
            System.out.println(dateOfWatering);
        }


    }
}
