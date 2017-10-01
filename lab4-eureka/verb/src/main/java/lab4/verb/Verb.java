package lab4.verb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Verb {

    public static void main(String[] args) {
        SpringApplication.run(Verb.class, args);
    }
}
