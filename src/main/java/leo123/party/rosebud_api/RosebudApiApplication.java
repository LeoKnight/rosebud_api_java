package leo123.party.rosebud_api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
@MapperScan("leo123.party.rosebud_api.mapper")
public class RosebudApiApplication {
    private static final Logger logger = LogManager.getLogger("rosebud_api_java");
    public static void main(String[] args) {
        SpringApplication.run(RosebudApiApplication.class, args);
    }

}
