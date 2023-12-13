package az.edu.ada.wm2.authorcrudsecurity.service;

import az.edu.ada.wm2.authorcrudsecurity.model.entity.Author;
import java.util.List;


public interface AuthorService {

    List<Author> getAllAuthors();

    Author save(Author author);

    Author getById(Long id);

    void deleteById(Long id);
}
