package az.edu.ada.wm2.authorcrudsecurity.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 2, max = 20, message = "Name must be of length [2-20]")
    private String name;


    @NotNull
    @Size(min = 2, max = 20, message = "Surname must be of length [2-20]")
    private String surname;


//   @NotNull
//   @Email(regexp = "^(.+)@(.+)\\.(.+)$", message = "Email must be in this format")
    private String email;

    @NotNull
    @Size(min = 2, max = 20, message = "Gender must be of length [2-10]")
    private String gender;

    public Author(String name, String surname, String email, String gender) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author: " + this.name + ": " + this.surname + this.email + ": " + this.gender;
    }
}
