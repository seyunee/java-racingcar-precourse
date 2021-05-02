import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.Car;
import racing.Racing;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingTest {
    Racing racing = new Racing();
    List<Car> cars = new ArrayList<>();

    @BeforeEach
    void inputUserData() {
        String input = "1, 2,  3,   4   ,5";
        cars = Racing.participate(input);
    }

    @Test
    @DisplayName("5대의 자동차를 ,로 구분지어 입력받는다")
    void getCars() {
        assertThat(cars.size()).isEqualTo(5);
    }

    @Test
    @DisplayName("자동차의 이름을 확인한다")
    void getCarName() {
        for (int i = 0; i < cars.size(); i++) {
            assertThat(cars.get(i).getName()).isEqualTo(Integer.toString(i + 1));
        }
    }

    @Test
    @DisplayName("우승한 자동차의 이름을 반환한다 - 1대 우승")
    void getWinner() {
        for (int i = 0; i < cars.size(); i++) {
            cars.get(i).setLocation(i);
        }

        List<Car> winners = racing.getWinner(cars);
        assertThat(racing.printWinners(winners)).isEqualTo("5");
    }

    @Test
    @DisplayName("우승한 자동차의 이름을 반환한다 - 여러대 우승")
    void getMultipleWinner() {
        for (int i = 0; i < cars.size(); i++) {
            cars.get(i).setLocation(5);
        }

        List<Car> winners = racing.getWinner(cars);
        assertThat(racing.printWinners(winners)).isEqualTo("1, 2, 3, 4, 5");
    }
}
