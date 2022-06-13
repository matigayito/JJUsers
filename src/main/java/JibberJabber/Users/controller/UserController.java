package JibberJabber.Users.controller;

import JibberJabber.Users.model.User;
import JibberJabber.Users.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {this.userService = userService;}

    @GetMapping
    List<User> getAll(Principal principal, Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("customers", users);
        model.addAttribute("username", principal.getName());
        return users;
    }

    @PostMapping
    User save(@RequestBody User newUser) {
        return userService.save(newUser);
    }

    @GetMapping("/{id}")
    User find(@PathVariable Long id) {
        return userService.find(id);
    }

    @PutMapping("/{id}")
    User replace(@RequestBody User newUser, @PathVariable Long id) {
        return userService.replace(newUser, id);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id) {
        userService.delete(id);
    }
}
