package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, 12345, "Ford"));
        cars.add(new Car(2, 90876, "Scoda"));
        cars.add(new Car(3, 65438, "Kia"));
        cars.add(new Car(4, 24425, "Volkswagen"));
        cars.add(new Car(5, 62624, "Audi"));
    }

    public List<Car> cars() {
        return cars;
    }
}
