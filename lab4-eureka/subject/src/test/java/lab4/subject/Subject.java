package lab4.subject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Subject {

    public static void main(String[] args) {
        SpringApplication.run(Subject.class, args);
    }
}
