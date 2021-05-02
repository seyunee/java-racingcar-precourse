package racing;

import utils.ValidationUtil;

import java.util.*;

public class Racing {
    static final String delimiter = ",";
    Scanner scanner = new Scanner(System.in);

    public static List<Car> participate(String carNames) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames.split(delimiter)) {
            cars.add(new Car(carName));
        }
        return cars;
    }

    public void start() {
        List<Car> cars = new ArrayList<>();
        int tryCount = 0;
        System.out.print("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carNames = scanner.nextLine();
        cars = participate(carNames);

        System.out.print("시도할 회수는 몇회인가요?");
        String userTryCount = scanner.nextLine();
        while (tryCount < ValidationUtil.tryCount(userTryCount)) {
            tryCount++;
            // todo : 이동시도
        }

    }

    public List<Car> getWinner(List<Car> cars) {
        cars.sort(Comparator.comparing(Car::getLocation).reversed());
        int maxLocation = cars.get(0).getLocation();
        List<Car> winners = new ArrayList<>();

        for (Car car : cars) {
            if (car.getLocation() == maxLocation) {
                winners.add(car);
            }
        }

        return winners;
    }
}
