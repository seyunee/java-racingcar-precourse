package racing;

public class CarName {
    public static final int CAR_NAME_MAX_LETTER = 5;
    public static final int CAR_NAME_MIN_LETTER = 1;

    private String name;

    public CarName(String name) {
        if (name.length() > CAR_NAME_MAX_LETTER || name.length() < CAR_NAME_MIN_LETTER) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
