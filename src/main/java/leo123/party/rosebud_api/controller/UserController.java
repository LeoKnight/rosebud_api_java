package leo123.party.rosebud_api.controller;

import leo123.party.rosebud_api.api.UserService;
import leo123.party.rosebud_api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping
    public String userInfo() {
//        userService.insert()
        return "demo";
    }

    @RequestMapping(value = "/signUp", method = RequestMethod.POST)
    public int signUp(
            User user
    ) {
        return userService.insert(user);
    }

    @RequestMapping(value = "/findByName")
    public List<User> findByName(
            @RequestParam(value="name") String name
    ) {
        return userService.findByName(name);
    }

    @RequestMapping(value = "/findById")
    public User findById(
            @RequestParam(value="id") Long id
    ) {
        return userService.findById(id);
    }

    @RequestMapping(value = "/update")
    public User update(
            User user
    ) {
        return userService.updateByPrimaryKeySelective(user);
    }

}
