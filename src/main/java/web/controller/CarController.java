package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;
import java.util.List;

@Controller
public class CarController {
	private final CarServiceImp carServiceImp;

	public CarController(CarServiceImp carServiceImp) {
		this.carServiceImp = carServiceImp;
	}

	@GetMapping("/cars")
	public String getCarsPage(@RequestParam(name = "count",required = false)Integer count, Model model) {
		List<Car> cars;
		if (count == null || count >= 5) {
			cars = carServiceImp.getAllCars();
		} else {
			cars = carServiceImp.getNumberOfCars(count);
		}
		model.addAttribute("cars",cars);
		return "cars";
	}
}