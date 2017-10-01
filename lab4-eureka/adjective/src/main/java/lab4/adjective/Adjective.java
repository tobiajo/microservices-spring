package lab4.adjective;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Adjective {

    public static void main(String[] args) {
        SpringApplication.run(Adjective.class, args);
    }
}
