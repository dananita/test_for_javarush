package ru.octava.javarushtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.octava.javarushtest.service.BookService;

@Controller
public class BookController {
    private BookService service;

    public BookController(BookService service) {
        this.service = service;
    }


    @RequestMapping(name = "/", method = RequestMethod.GET)
    public String getAllBooks(Model model) {
        model.addAttribute("books", service.getAllBooks());
        return "index";
    }


    @PostMapping(name = "/addBook")
    public String addBookPage(@RequestParam String title, @RequestParam String author, @RequestParam String isbn,
                              @RequestParam int print_year,
                              @RequestParam String description, @RequestParam(defaultValue = "false") boolean read_already) {
        service.addBook(title, author, isbn, print_year, read_already, description);
        return "redirect:/index";
    }

    @RequestMapping(name = "/updateBook", method = RequestMethod.PUT)
    public String updateBookPage(@RequestParam(defaultValue = "") int id, @RequestParam(defaultValue = "") String title,
                                 @RequestParam(defaultValue = "") String isbn, @RequestParam (defaultValue = "0")int print_year,
                                 @RequestParam (defaultValue = "") String description, @RequestParam(defaultValue = "false") boolean read_already) {
        service.updateBook(id, title, isbn, print_year, description, read_already);
        return "redirect:/index";
    }


    @RequestMapping(name = "/delete", method = RequestMethod.DELETE)
    public String deleteBookPage(int id) {
        service.deleteBook(id);
        return "redirect:/index";
    }

}

