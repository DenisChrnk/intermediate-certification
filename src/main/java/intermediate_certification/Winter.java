package intermediate_certification;

import java.time.LocalDate;
import java.time.Month;

public class Winter implements Season {

    @Override
    public LocalDate getNextDateWatering(LocalDate date) {
        LocalDate nextWat = date.plusMonths(1);
        if (nextWat.getMonth() == Month.MARCH) {
            return LocalDate.of(LocalDate.now().getYear(), Month.MARCH, 7);
        }
        return nextWat;
    }

}
