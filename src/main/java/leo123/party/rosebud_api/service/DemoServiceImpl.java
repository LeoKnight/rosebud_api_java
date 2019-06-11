package leo123.party.rosebud_api.service;

import leo123.party.rosebud_api.api.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {


    @Override
    public String stringDemo(){

        return "demo";
    }
}
