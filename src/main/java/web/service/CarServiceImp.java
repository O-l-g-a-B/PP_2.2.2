package web.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {
    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Japan","Toyota",2015));
        cars.add(new Car("Germany","BMW",2013));
        cars.add(new Car("USA","Ford",2020));
        cars.add(new Car("Italy","Ferrari",2005));
        cars.add(new Car("Russia","VAZ",2022));
    }

    @Override
    public List<Car> getNumberOfCars(int count) {
        if (count > 0 && count < 5) {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
        return cars;
    }
}
