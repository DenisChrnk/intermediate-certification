package intermediate_certification;

import java.time.LocalDate;
import java.time.Month;

public class Autumn implements Season{
        @Override
        public LocalDate getNextDateWatering(LocalDate date) {
            LocalDate nextWat = date.plusDays(7);
            if (nextWat.getMonth() == Month.DECEMBER){
                Season winter = new Winter();
                return winter.getNextDateWatering(date);
            }
            return nextWat;
        }

    }

