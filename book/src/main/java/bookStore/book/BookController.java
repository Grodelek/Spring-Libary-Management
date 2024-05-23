package bookStore.book;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@Controller
public class BookController {

    @GetMapping("/book")
    public String getBook(){
        return "book";
    }

    @ModelAttribute("book")
    public List<Book> book(){
        return Arrays.asList(
                new Book("1", "Mateusz", "Akademia Pana kleksa"),
                new Book("2","Artur","Wladca Pierscieni")
        );
    }
}
