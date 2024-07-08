package intermediate_certification;

import java.time.LocalDate;
import java.time.Month;

public class Spring implements Season {
    @Override
    public LocalDate getNextDateWatering(LocalDate date) {
        LocalDate nextWat = date.plusDays(7);
        if (nextWat.getMonth() == Month.JUNE){
            Season summer = new Summer();
            return summer.getNextDateWatering(date);
        }
        return nextWat;
    }

}
