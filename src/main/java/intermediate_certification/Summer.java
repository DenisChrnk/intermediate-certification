package intermediate_certification;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Summer implements Season {
    @Override
    public LocalDate getNextDateWatering(LocalDate date) {
        int valueOfSensor = humidity();
        Long days = ChronoUnit.DAYS.between(date, LocalDate.now());
        if (valueOfSensor < 30 && days > 2 || LocalDate.now().getMonth() == Month.SEPTEMBER) {
            return LocalDate.now();
        }
        return null;
    }


    private int humidity() {
        Sensor sensor = new Sensor();
        return sensor.randomValue();
    }
}
