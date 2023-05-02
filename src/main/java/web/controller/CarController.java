package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;


import java.util.ArrayList;
import java.util.List;

import static web.service.CarService.getListOfCars;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(value = "count", defaultValue = "7") int count) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("model1", 123, "color1"));
        list.add(new Car("model2", 234, "color2"));
        list.add(new Car("model3", 345, "color3"));
        list.add(new Car("model4", 456, "color4"));
        list.add(new Car("model5", 567, "color5"));
        List<Car> resultList = getListOfCars(list, count);
        model.addAttribute("cars", resultList);
        return "cars";
    }
}
