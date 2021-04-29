import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.ValidationUtil;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationTest {
    @Test
    @DisplayName("자동차의 이름은 5자 이하")
    void carNameIsUnder5Letters() {
        assertThat(ValidationUtil.nameLetter("12345")).isTrue();
        assertThat(ValidationUtil.nameLetter("123456")).isFalse();
    }

    @Test
    @DisplayName("자동차 입력은 ,로 구분하여 n대를 입력받는다.")
    void splitWithComma() {
        assertThat(ValidationUtil.splitCars("1,2,3,4,5")).isEqualTo(5);
        assertThat(ValidationUtil.splitCars(",,,,,,")).isEqualTo(0);
        assertThat(ValidationUtil.splitCars("1,,222")).isEqualTo(3);
        assertThat(ValidationUtil.splitCars("1,2,,,,")).isEqualTo(2);
        assertThat(ValidationUtil.splitCars("123456")).isEqualTo(1);
    }

    @Test
    @DisplayName("사용자는 몇번 이동을 시도할지 입력한다.")
    void inputTryCount() {
        assertThat(ValidationUtil.tryCount(6)).isTrue();
        assertThat(ValidationUtil.tryCount(0)).isFalse();
        assertThat(ValidationUtil.tryCount(100)).isTrue();
    }
}
