package racing;

public class Turn {
    public int getTurnNo() {
        return (int) (Math.random() * 9);
    }

    public void turnResult(Car car,int turnNo) {
        if(car.turn(turnNo).equals(CarStatus.MOVE)){
            car.setLocation(car.getLocation()+1);
        }
    }
}
