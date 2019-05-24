package leo123.party.rosebud_api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("leo123.party.rosebud_api.mapper")
public class RosebudApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RosebudApiApplication.class, args);
    }

}
