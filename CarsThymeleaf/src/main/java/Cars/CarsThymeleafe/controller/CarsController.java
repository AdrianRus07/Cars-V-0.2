package Cars.CarsThymeleafe.controller;

import Cars.CarsThymeleafe.controller.DTO.CarsDTO;
import Cars.CarsThymeleafe.entity.Cars;
import Cars.CarsThymeleafe.service.CarsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Controller
@RequiredArgsConstructor
@RequestMapping("/cars")

public class CarsController {
@Autowired
    private final CarsService carsService;



    //------------Add new Car to database--------------------------------
    @GetMapping(value = "/add")
    public String addCar(Model model) {
        Cars cars = new Cars();
        model.addAttribute("cars", cars);
        return "add-car.html";
    }
    @PostMapping(value = "/add")
    public String processForm(@ModelAttribute(value = "cars") CarsDTO cars) {
        carsService.save(cars);
        return "redirect:/cars/all";
    }

    //------------Get All Cars in DB--------------------------------
    @GetMapping("/all")
    public String getCars(Model model) {
        List<CarsDTO> cars = carsService.getCars();
        model.addAttribute("carsThymeleaf", Objects.requireNonNullElseGet(cars, ArrayList::new));
        return "index";

    }
    //------------Delete Entry from DB--------------------------------
    @RequestMapping("/delete/{id}")
    public String deleteCar(@PathVariable Integer id){
        carsService.deleteCar(id);
        return "redirect:/cars/all";
    }
    //------------Find By Name--------------------------------
    @GetMapping("/search")
    public String searchCarsByName(@RequestParam String name, Model model) {
        List<Cars> searchResults = carsService.searchByName(name);
        model.addAttribute("carsThymeleaf", searchResults);
        return "index";
    }
    //------------Edit Car--------------------------------
    @GetMapping(value = "/edit/{id}")
    public String editCar(@PathVariable Integer id, Model model) {
        model.addAttribute("carToBeEdited", carsService.findById(id));
        return "edit-car";
    }
    @PostMapping(value = "/edit")
    public String editAndSaveCar(@ModelAttribute(value = "car") CarsDTO carsDTO){
        carsService.save(carsDTO);
        return "redirect:/cars/all";
    }

    }


