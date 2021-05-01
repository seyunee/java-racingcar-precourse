import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.Car;
import racing.Turn;

import static org.assertj.core.api.Assertions.assertThat;

public class TurnTest {
    @Test
    @DisplayName("0~9의 랜덤값을 생성")
    void getRandomTurnNoTest() {
        Turn turn = new Turn();
        int turnNo = turn.getTurnNo();
        assertThat(turnNo >= 0 && turnNo < 10).isTrue();
    }

    @Test
    @DisplayName("3번 움직였을때 위치 검증")
    void moveThreeTimes() {
        Turn turn = new Turn();
        Car car = new Car("three");
        turn.turnResult(car, 5);
        turn.turnResult(car, 3);
        turn.turnResult(car, 5);
        turn.turnResult(car, 5);
        assertThat(car.getLocation()).isEqualTo(3);

        String move = "";
        for(int i=0; i<car.getLocation();i++){
            move += "-";
        }
        assertThat(move).isEqualTo("---");
    }

    @Test
    @DisplayName("0번 움직였을때 위치 검증")
    void moveZeroTimes() {
        Turn turn = new Turn();
        Car car = new Car("zero");
        turn.turnResult(car, 0);
        turn.turnResult(car, 1);
        turn.turnResult(car, 2);
        turn.turnResult(car, 3);
        assertThat(car.getLocation()).isEqualTo(0);
    }
}
