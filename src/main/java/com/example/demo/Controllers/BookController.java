package com.example.demo.Controllers;

import com.example.demo.Repositories.BooksRepository;
import com.example.demo.entities.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@org.springframework.stereotype.Controller
public class BookController {
    @Autowired
    BooksRepository repository;
    /*@GetMapping("/employees")
    public List<Employees> getEmployees(){
        return repository.findAll();
    }
    @GetMapping("/employees/{id}")
    public Optional<Employees> getEmployeeById(@PathVariable("id") int id){
        return repository.findById(id);
    }*/
    @GetMapping("/books")
    public String getEmployees(Model model){
        List<Books> list= repository.findAll();
        model.addAttribute("myList1",list);
        model.addAttribute("book",new Books());
        return "books";
    }
    @PostMapping("/booksave")
    public String saveBook(Books book){
        repository.save(book);
        return "redirect:/books";
    }
    @GetMapping("/deleteb/{id}")
    public String deleteBook(@PathVariable("id") int id){
        repository.deleteById(id);
        return "redirect:/books";
    }
}