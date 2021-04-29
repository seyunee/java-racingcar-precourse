package utils;

public class ValidationUtil {
    static final String delimiter = ",";

    public static boolean nameLetter(String name) {
        if (name.length() <= 5) {
            return true;
        }
        return false;
    }

    public static int splitCars(String cars) {
        return cars.split(delimiter).length;
    }

    public static boolean tryCount(int count) {
        if (count > 0) {
            return true;
        }
        return false;
    }
}
