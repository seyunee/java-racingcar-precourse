package racing;

import utils.ValidationUtil;

import java.util.*;

public class Racing {
    static final String delimiter = ",";
    Scanner scanner = new Scanner(System.in);

    public static List<Car> participate(String carNames) {
        List<Car> cars = new ArrayList<>();
        if(ValidationUtil.duplicateCars(carNames,ValidationUtil.splitCars(carNames))){
            for (String carName : carNames.split(delimiter)) {
                cars.add(new Car(carName));
            }
        }
        return cars;
    }

    public void start() {
        int tryCount = 0;
        System.out.print("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carNames = scanner.nextLine();
        List<Car> cars = participate(carNames);

        System.out.print("시도할 회수는 몇회인가요?");
        String userTryCount = scanner.nextLine();
        while (tryCount < ValidationUtil.tryCount(userTryCount)) {
            tryCount++;
            // todo : 이동시도
        }

        System.out.print(printWinners(getWinner(cars)) + "가 최종 우승했습니다.");
        scanner.close();
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

    public String printWinners(List<Car> winners) {
        String winner = winners.get(0).getName();
        if (winners.size() > 1) {
            for (int i = 1; i < winners.size(); i++) {
                winner += delimiter + " " + winners.get(i).getName();
            }
        }
        return winner;
    }
}
