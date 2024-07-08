package intermediate_certification;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(1, 5, 7, 3, 2, 0, 4, 9, 6);

        listOfNumbers.sort((a, b) -> a - b);
        System.out.println(listOfNumbers.get(listOfNumbers.size() - 2));


    }
}
