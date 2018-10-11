package me.ianhe.cloud.eureka;

import me.ianhe.cloud.core.Json;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author iHelin
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {

    public static void main(String[] args) {
        Json.hello();
        SpringApplication.run(EurekaApplication.class, args);
    }
}
