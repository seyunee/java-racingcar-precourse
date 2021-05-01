package utils;

public class ValidationUtil {
    static final String delimiter = ",";
    static final String regex = "^[0-9]*$";
    public static final int TRY_MIN_NO = 1;

    public static int splitCars(String cars) {
        return cars.split(delimiter).length;
    }

    public static int tryCount(String count) {
        if(!count.matches(regex)){
            throw new IllegalArgumentException("숫자를 입력해주세요.");
        }

        if (Integer.parseInt(count) < TRY_MIN_NO) {
            throw new IllegalArgumentException("1회 이상 입력해주세요.");
        }
        return Integer.parseInt(count);
    }

}
