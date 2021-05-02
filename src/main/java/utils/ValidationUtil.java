package utils;

import java.util.LinkedHashSet;
import java.util.Set;

public class ValidationUtil {
    static final String delimiter = ",";
    static final String regex = "^[0-9]*$";
    public static final int TRY_MIN_NO = 1;

    public static int splitCars(String cars) {
        return cars.split(delimiter).length;
    }

    public static boolean duplicateCars(String cars, int count) {
        Set<String> carNames = new LinkedHashSet<>();
        String[] splitNames = cars.split(delimiter);

        for (int i = 0; i < splitNames.length; i++) {
            carNames.add(splitNames[i].trim());
        }

        if (carNames.size() != count) {
            throw new IllegalArgumentException("중복되는 자동차이름이 있습니다. 중복없이 입력해주세요.");
        }
        return true;
    }

    public static int tryCount(String count) {
        if (!count.matches(regex)) {
            throw new IllegalArgumentException("숫자를 입력해주세요.");
        }

        if (Integer.parseInt(count) < TRY_MIN_NO) {
            throw new IllegalArgumentException("1회 이상 입력해주세요.");
        }
        return Integer.parseInt(count);
    }

}
