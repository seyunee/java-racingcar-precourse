package racing;

import java.util.List;

public class Turn {
    public int getTurnNo() {
        return (int) (Math.random() * 9);
    }

    public void turnResult(Car car, int turnNo) {
        if (car.turn(turnNo).equals(CarStatus.MOVE)) {
            car.setLocation(car.getLocation() + 1);
        }
    }

    public void turn(List<Car> cars) {
        for (Car car : cars) {
            turnResult(car, getTurnNo());
            System.out.print("\n" + car.getName() + " : ");
            for (int i = 0; i < car.getLocation(); i++) {
                System.out.print("-");
            }
        }
        System.out.print("\n");
    }
}
