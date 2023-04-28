package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public interface CarService {
    List<Car> cars = new ArrayList<>();
    public default List<Car> getNumberOfCars(int count) {
        return cars;
    }
}

