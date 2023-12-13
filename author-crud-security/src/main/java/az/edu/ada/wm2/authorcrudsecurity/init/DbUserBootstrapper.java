package az.edu.ada.wm2.authorcrudsecurity.init;
import az.edu.ada.wm2.authorcrudsecurity.model.entity.Author;
import az.edu.ada.wm2.authorcrudsecurity.model.entity.User;
import az.edu.ada.wm2.authorcrudsecurity.repository.AuthorRepository;
import az.edu.ada.wm2.authorcrudsecurity.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
@Component
public class DbUserBootstrapper {

    @Bean
    public ApplicationRunner initUser(UserRepository userRepo,
                                      PasswordEncoder encoder) {
        return (args) -> {
            User adminUser = new User("admin", encoder.encode("admin"),
                    "admin@ada.edu.az");

            userRepo.save(adminUser.addRole("ROLE_ADMIN"));

            userRepo.save(new User("fahmin", encoder.encode("fahmin123"),
                    "fmahili7586@ada.edu.az"));
        };
    }

    @Bean
    @Autowired
    public CommandLineRunner initAuthor(AuthorRepository authorRepo) {
        return (args) -> {
            Author fahminMahili  = new Author(1L, "Fahmin", "Mahili", "fahminmahili@gmail.com", "Male");
            Author johnSmith = new Author(2L, "John", "Smith", "johnsmith1234@gmail.com", "Male");
            Author janeLeen = new Author(3L, "Jane", "Leen", " j.lee@hotmail.com", "Female");
            Author michaelBrown = new Author(4L, "Micheal", "Brown", "michael.brown@yahoo.com", "Male");
            Author ashleyDavis = new Author(5L, "Ashley", "Davis", "ashleydavis84@gmail.com", "Female");
            Author davidKimm = new Author(6L, "David", "Kimm", "david.kim@gmail.com", "Male");
            Author stephaniePerez = new Author(7L, "Stephanie","Perez", "stephanie.perez@hotmail.com", "Female");
            Author robertJones = new Author(8L, "Robert", "Jones", "rjones1987@yahoo.com", "Male");




            authorRepo.save(fahminMahili);
            authorRepo.save(johnSmith);
            authorRepo.save(janeLeen);
            authorRepo.save(michaelBrown);
            authorRepo.save(ashleyDavis);
            authorRepo.save(davidKimm);
            authorRepo.save(stephaniePerez);
            authorRepo.save(robertJones);
        };
    }
}