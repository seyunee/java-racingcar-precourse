import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.Car;
import racing.CarStatus;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    @DisplayName("값이 4 이상이면 전진")
    void moveWhenNumberGreaterOrEqual4() {
        Car car = new Car("move", 4);
        assertThat(car.turn(car)).isEqualTo(CarStatus.MOVE);
    }

    @Test
    @DisplayName("값이 4 미만이면 멈춤")
    void stopWhenNumberLessThen4() {
        Car car = new Car("stop",3);
        assertThat(car.turn(car)).isEqualTo(CarStatus.STOP);
    }

}
