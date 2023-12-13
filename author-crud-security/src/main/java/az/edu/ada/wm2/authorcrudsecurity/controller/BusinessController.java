package az.edu.ada.wm2.authorcrudsecurity.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class BusinessController {
    @GetMapping("/admin")
    public String getAdminsHomePage(Model model) {
        model.addAttribute("message", "Here is Admin Home Page");
        return "admin/home";
    }

    @GetMapping("/user")
    public String getUsersHomePage(Model model) {
        model.addAttribute("message", "Here is User Home Page");
        return "user/home";
    }



}
