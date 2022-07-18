package JibberJabber.Users.controller;

import JibberJabber.Users.model.Follow;
import JibberJabber.Users.services.FollowService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/followage")
public class FollowController {
    FollowService followService;

    public FollowController(FollowService followService) {this.followService = followService;}

    @GetMapping
    List<Follow> getAll(Principal principal, Model model) {
        List<Follow> followList = followService.getAllFollows();
//        model.addAttribute("customers", Followages);
//        model.addAttribute("Followagename", principal.getName());
        return followList;
    }

    @PostMapping
    Follow save(@RequestBody Follow newFollow) {
        return followService.save(newFollow);
    }

    @GetMapping("/{id}")
    Follow find(@PathVariable Long id) {
        return followService.find(id);
    }

    @PutMapping("/{id}")
    Follow replace(@RequestBody Follow newFollow, @PathVariable Long id) {
        return followService.replace(newFollow, id);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id) {
        followService.delete(id);
    }
}
