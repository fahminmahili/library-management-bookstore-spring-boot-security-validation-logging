package az.edu.ada.wm2.authorcrudsecurity.controller;
import az.edu.ada.wm2.authorcrudsecurity.model.dto.SignupDto;
import az.edu.ada.wm2.authorcrudsecurity.model.entity.User;
import az.edu.ada.wm2.authorcrudsecurity.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signup")
public class SignupController {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserRepository userRepo;

    @GetMapping
    public String showSignUp(Model model) {
        model.addAttribute("signupDto", new SignupDto());
        return "signup";
    }

    @PostMapping
    public String doSignUp(@ModelAttribute SignupDto signupDto) {

        User user = signupDto.toUser(passwordEncoder);
        userRepo.save(user);

        return "redirect:/login";
    }
}
