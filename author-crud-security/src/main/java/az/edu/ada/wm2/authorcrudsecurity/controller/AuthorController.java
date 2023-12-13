package az.edu.ada.wm2.authorcrudsecurity.controller;
import az.edu.ada.wm2.authorcrudsecurity.model.entity.Author;
import az.edu.ada.wm2.authorcrudsecurity.service.AuthorService;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@Controller
@RequestMapping("/user/")
public class AuthorController {
    static final Logger LOGGER = LoggerFactory.getLogger(AuthorController.class);

    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }


    @GetMapping("authors")
    public String getAuthors(Model model){
        List<Author> authors = authorService.getAllAuthors();
        LOGGER.info("Authors listed");

        model.addAttribute("authors", authors);
        return "author/index";
    }

    @GetMapping("authors/new")
    public String createNewAuthor(Model model) {
        model.addAttribute("author", new Author());
        LOGGER.info("New Author Form is displayed");
        return "author/new";
    }
    @PostMapping("authors/new")
    public String save(Model model, @ModelAttribute("author") @Valid Author author, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "author/new";

        authorService.save(author);
        return "redirect:/user/authors";
    }

    @GetMapping("authors/{id}/update")
    public String updateAuthor(@PathVariable Long id, Model model) {
        model.addAttribute("author", authorService.getById(id));
        return "author/update";
    }
    @PostMapping("authors/{id}/update")
    public String postAuthor(Model model, @ModelAttribute Author author, Long id) {
        model.addAttribute("author", author);
        authorService.save(author);
        return "redirect:/user/authors";
    }

    @GetMapping("authors/{id}/delete")
    public String deleteAuthor(@PathVariable Long id) {
        authorService.deleteById(id);
        return "redirect:/user/authors";
    }


}
