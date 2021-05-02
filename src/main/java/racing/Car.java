package racing;

public class Car {
    public static final int MOVE_NUM = 4;

    private CarName name;
    private int location = 0;

    public Car(String name) {
        this.name = new CarName(name.trim());
    }

    public CarStatus turn(int turnNo) {
        if (greaterOrEqual(turnNo)) {
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

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

}
