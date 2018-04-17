package ru.octava.javarushtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.octava.javarushtest.service.BookService;

import java.util.Map;

@Controller
public class BookController {
    private BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping (name = "/")
    public String welcome(Map<String, Object> model){
        model.put("message", "test message");
        model.put("books",service.getAllBooks());
        return "index";
    }

}
