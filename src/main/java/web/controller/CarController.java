package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Controller
public class CarController {
    private CarDAO carDAO;

    @Autowired
    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping("/cars")
    public String cars(
            @RequestParam(name = "count", defaultValue = "-1") int count,
            Model model) {

        List<Car> carList = carDAO.cars();

        if ((count == -1) || (count >= carList.size())) {
            model.addAttribute("cars", carList);
        } else {
            model.addAttribute("cars", carList.subList(0, count));
        }
        return "cars";
    }
}
