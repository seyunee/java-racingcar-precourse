import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.Car;
import racing.Racing;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingTest {
    List<Car> cars = new ArrayList<>();

    @BeforeEach
    void inputUserData() {
        String input = "1,2,3,4,5";
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

}
