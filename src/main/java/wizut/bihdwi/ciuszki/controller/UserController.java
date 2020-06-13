package wizut.bihdwi.ciuszki.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import wizut.bihdwi.ciuszki.jpa.User;
import wizut.bihdwi.ciuszki.services.UsersService;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;

@Controller
public class UserController {
    @Autowired
    private UsersService usersService;
    private User currentUser;

    @GetMapping("/login")
    public String loginForm(Model model, User user) {
        return "loginForm";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        currentUser = null;
        session.removeAttribute("currentUser");
        return "redirect:/offersList";
    }

    @PostMapping("/login")
    public String userLogin(Model model, User user, HttpSession session) throws SQLException {
        currentUser = usersService.loginUser(user);
        if (currentUser != null) {
            session.setAttribute("currentUser", currentUser);
            return "redirect:/offersList";
        }
        return "loginForm";
    }


}
