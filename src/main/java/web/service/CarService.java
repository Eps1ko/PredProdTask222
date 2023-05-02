package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    public CarServiceImpl() {
    }

    @Override
    public List<Car> getListOfCars(List<Car> carList, int value) {
        return carList.stream().limit(value).collect(Collectors.toList());
    }
}
