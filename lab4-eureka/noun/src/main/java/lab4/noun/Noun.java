package lab4.noun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Noun {

    public static void main(String[] args) {
        SpringApplication.run(Noun.class, args);
    }
}
