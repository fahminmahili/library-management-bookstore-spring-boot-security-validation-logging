package az.edu.ada.wm2.authorcrudsecurity.repository;
import az.edu.ada.wm2.authorcrudsecurity.model.entity.Author;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    @Query("select c from Author c")
    Iterable<Author> getAllAuthorsUsingJPAQuery();
}
