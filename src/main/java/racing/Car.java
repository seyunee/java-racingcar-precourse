package racing;

public class Car {
    public static final int MOVE_NUM = 4;
    private String name;
    private final int turnNo;

    public Car(String name, int turnNo) {
        this.name = name;
        this.turnNo = turnNo;
    }

    public CarStatus turn(Car car) {
        if(greaterOrEqual(car.turnNo)){
            return CarStatus.MOVE;
        }
        return CarStatus.STOP;
    }

    private boolean greaterOrEqual(int no){
        if(no >= MOVE_NUM) return true;
        return false;
    }

}
