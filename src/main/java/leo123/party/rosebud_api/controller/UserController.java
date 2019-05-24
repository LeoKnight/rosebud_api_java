package leo123.party.rosebud_api.controller;

import leo123.party.rosebud_api.api.UserService;
import leo123.party.rosebud_api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
//            @RequestParam(value="name", defaultValue="World") String name
            User user
    ) {
        return userService.insert(user);


    }

}
