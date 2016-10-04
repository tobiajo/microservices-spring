package lab1;

import lab1.domain.Team;
import lab1.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {

    @Autowired
    TeamRepository teamRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    public void init() {
        List<Team> list = new ArrayList<>();

        Team team = new Team();
        team.setLocation("Harlem");
        team.setName("Globetrotters");
        list.add(team);

        team = new Team();
        team.setLocation("Washington");
        team.setName("Generals");
        list.add(team);

        teamRepository.save(list);
    }
}
