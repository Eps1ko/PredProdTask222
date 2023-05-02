package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    public CarService() {
    }

    public static List<Car> getListOfCars(List<Car> carList, int value) {
        if (value <= carList.size()) {
            return carList.stream().limit(value).collect(Collectors.toList());
        } else  {
            return new ArrayList<>(carList);
        }
    }
}
