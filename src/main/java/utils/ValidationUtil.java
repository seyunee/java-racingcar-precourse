package utils;

public class ValidationUtil {
    static final String delimiter = ",";
    public static final int TRY_MIN_NO = 1;

    public static int splitCars(String cars) {
        return cars.split(delimiter).length;
    }

    public static boolean tryCount(int count) {
        if (count >= TRY_MIN_NO) {
            return true;
        }
        return false;
    }
}
