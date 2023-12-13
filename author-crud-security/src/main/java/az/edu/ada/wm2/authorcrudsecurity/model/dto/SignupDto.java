package az.edu.ada.wm2.authorcrudsecurity.model.dto;
import az.edu.ada.wm2.authorcrudsecurity.model.entity.User;

import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;
@Data
public class SignupDto {
    private String username;
    private String password;
    private String email;

    public User toUser(PasswordEncoder encoder) {
        return new User(username, encoder.encode(password), email );
    }
}
