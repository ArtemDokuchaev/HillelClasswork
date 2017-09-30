package com.hillel.lesson8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class BookController {

    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("header", "Book List");
        return "Books";
    }
}
