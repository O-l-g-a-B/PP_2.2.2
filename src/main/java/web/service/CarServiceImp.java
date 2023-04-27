package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService{
    private CarDao carDao;
    @Autowired
    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getAllCars() {
        carDao = new CarDaoImp();
        return carDao.getAllCars();
    }
    @Override
    public List<Car> getNumberOfCars(int count) {
        carDao = new CarDaoImp();
        return carDao.getNumberOfCars(count);
    }
}
