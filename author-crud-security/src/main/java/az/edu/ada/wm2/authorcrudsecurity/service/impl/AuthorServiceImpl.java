package az.edu.ada.wm2.authorcrudsecurity.service.impl;
import az.edu.ada.wm2.authorcrudsecurity.model.entity.Author;
import az.edu.ada.wm2.authorcrudsecurity.repository.AuthorRepository;
import az.edu.ada.wm2.authorcrudsecurity.service.AuthorService;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {


    AuthorRepository authorRepo;

    public AuthorServiceImpl(AuthorRepository authorRepo) {
        this.authorRepo = authorRepo;
    }

    @Override
    public List<Author> getAllAuthors() {
        return (List<Author>) authorRepo.getAllAuthorsUsingJPAQuery();
    }

    @Override
    public Author save(Author author) {
        return authorRepo.save(author);
    }

    @Override
    public Author getById(Long id) {
        return authorRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        authorRepo.deleteById(id);
    }

}
