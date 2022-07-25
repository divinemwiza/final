package com.example.demo.Controllers;

import com.example.demo.Repositories.BooksRepository;
import com.example.demo.Repositories.EmployeesRepository;
import com.example.demo.entities.Books;
import com.example.demo.entities.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@org.springframework.stereotype.Controller
public class StudentController {
    @Autowired
    EmployeesRepository repository;
    /*@GetMapping("/employees")
    public List<Employees> getEmployees(){
        return repository.findAll();
    }
    @GetMapping("/employees/{id}")
    public Optional<Employees> getEmployeeById(@PathVariable("id") int id){
        return repository.findById(id);
    }*/
    @GetMapping("/data")
    public String getEmployees(Model model){
        List<Employees> list= repository.findAll();
        model.addAttribute("myList",list);
        model.addAttribute("employee",new Employees());
        return "data";
    }
    @PostMapping("/empsave")
    public String saveEmployee(Employees employee){
        repository.save(employee);
        return "redirect:/data";
    }
    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id") int id){
        repository.deleteById(id);
        return "redirect:/data";
    }

    @GetMapping("/edit/{id}")
    public String editEmployee(@PathVariable("id") int id, Model model){
        model.addAttribute("employee",new Employees());
        return "editemployee";
    }
    @GetMapping("/about")
    public String openAboutUs(){
        return "about";
    }
}