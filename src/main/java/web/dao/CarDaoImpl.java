package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Repository
public class CarDaoImpl implements CarDao {

    private static final List<Car> cars = new ArrayList<>();

     static {
        cars.add(new Car("CarBrand_1", "CarModel_1", 2011));
        cars.add(new Car("CarBrand_2", "CarModel_2", 2012));
        cars.add(new Car("CarBrand_3", "CarModel_3", 2013));
        cars.add(new Car("CarBrand_4", "CarModel_4", 2014));
        cars.add(new Car("CarBrand_5", "CarModel_5", 2015));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count > 0 && count <cars.size()) {
            return cars.stream().limit(count).collect(Collectors.toList());
        } else {
            return cars.stream().limit(cars.size()).collect(Collectors.toList());
        }
    }
}
