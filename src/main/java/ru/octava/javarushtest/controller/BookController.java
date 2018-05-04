package ru.octava.javarushtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.octava.javarushtest.model.Book;
import ru.octava.javarushtest.service.BookService;
import java.util.List;

@Controller
public class BookController {
    private BookService service;

    public BookController(BookService service) {
        this.service = service;
    }


    @RequestMapping(name = "/", method = RequestMethod.GET)
    public String getAllBooks(Model model, @RequestParam(required = false, defaultValue = "0") Integer id,
                              @RequestParam(required = false, defaultValue = "") String title,
                              @RequestParam(required = false, defaultValue = "") String author,
                              @RequestParam(required = false, defaultValue = "0") Integer page) {
        model.addAttribute("maxPage", 0);
        if (id != 0) {
            model.addAttribute("books", service.getBookById(id));
        } else {
            if (!title.equals("")) {
                model.addAttribute("books", service.getBookByTitle(title));
            } else {
                if ((!author.equals(""))) {
                    model.addAttribute("books", service.getBooksByAuthor(author));
                } else {
                    List<Book> books = service.getAllBooks();
                    if (books.size()!=0) {
                        int maxElementsOnPage = (books.size() % 10 == 0) ?
                                ((int) Math.ceil(books.size() / 10) - 1) :
                                ((int) Math.ceil(books.size() / 10));
                        model.addAttribute("maxPage", maxElementsOnPage);
                        if (page > maxElementsOnPage || page <= 0) page = 0;
                        if (books.size() < (page * 10 + 10)) {
                            model.addAttribute("books", books.subList(page * 10, books.size()));

                        } else {
                            model.addAttribute("books", books.subList(page * 10, page * 10 + 10));

                        }
                    }
                }
            }
        }
        return "index";
    }

    @PostMapping(name = "/addBook")
    public String addBookPage(@RequestParam String title,
                              @RequestParam String author,
                              @RequestParam(defaultValue = "") String isbn,
                              @RequestParam(defaultValue = "0") int print_year,
                              @RequestParam(defaultValue = "") String description,
                              @RequestParam(defaultValue = "false") boolean read_already) {
        service.addBook(title, author, isbn, print_year, read_already, description);
        return "redirect:/index";
    }

    @RequestMapping(name = "/updateBook", method = RequestMethod.PUT)
    public String updateBookPage(@RequestParam(defaultValue = "") int id,
                                 @RequestParam(defaultValue = "") String title,
                                 @RequestParam(defaultValue = "") String isbn,
                                 @RequestParam(defaultValue = "0") int print_year,
                                 @RequestParam(defaultValue = "") String description,
                                 @RequestParam(defaultValue = "false") boolean read_already) {
        service.updateBook(id, title, isbn, print_year, description, read_already);
        return "redirect:/index";
    }


    @RequestMapping(name = "/delete", method = RequestMethod.DELETE)
    public String deleteBookPage(int id) {
        service.deleteBook(id);
        return "redirect:/index";
    }

}

