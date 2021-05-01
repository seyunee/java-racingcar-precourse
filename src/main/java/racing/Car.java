package racing;

public class Car {
    public static final int MOVE_NUM = 4;

    private CarName name;
    private final int turnNo;

    public Car(String name, int turnNo) {
        this.name = new CarName(name);
        this.turnNo = turnNo;
    }

    public CarStatus turn(Car car) {
        if (greaterOrEqual(car.turnNo)) {
            return CarStatus.MOVE;
        }
        return CarStatus.STOP;
    }

    private boolean greaterOrEqual(int no) {
        if (no >= MOVE_NUM) return true;
        return false;
    }

    public String getName() {
        return name.getName();
    }

    public void setName(CarName name) {
        this.name = name;
    }

    public int getTurnNo() {
        return turnNo;
    }
}
