package racing;

import java.util.ArrayList;
import java.util.List;

public class Racing {
    static final String delimiter = ",";

    public static List<Car> participate(String carNames) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames.split(delimiter)) {
            cars.add(new Car(carName));
        }
        return cars;
    }


}
