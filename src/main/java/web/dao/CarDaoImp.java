package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Repository
public class CarDaoImp implements CarDao{
    private List<Car> carsList = new ArrayList<>();
    {
        carsList.add(new Car("Japan","Toyota",2015));
        carsList.add(new Car("Germany","BMW",2013));
        carsList.add(new Car("USA","Ford",2020));
        carsList.add(new Car("Italy","Ferrari",2005));
        carsList.add(new Car("Russia","VAZ",2022));
    }
    @Override
    public List<Car> getAllCars() {
        return carsList;
    }
    @Override
    public List<Car> getNumberOfCars(int count) {
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
}
