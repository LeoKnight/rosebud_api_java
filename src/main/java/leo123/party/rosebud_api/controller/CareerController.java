package leo123.party.rosebud_api.controller;

import leo123.party.rosebud_api.api.CareerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/career")
public class CareerController {
    @Autowired
    private CareerService careerService;


}
