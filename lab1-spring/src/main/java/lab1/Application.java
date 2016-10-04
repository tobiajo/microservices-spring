package lab1;

import lab1.domain.Player;
import lab1.domain.Team;
import lab1.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        Set<Player> harlemPlayers = new HashSet<>();
        harlemPlayers.add(new Player("Ant", "S"));
        harlemPlayers.add(new Player("Big Easy", "S"));
        harlemPlayers.add(new Player("Handles", "S"));
        harlemPlayers.add(new Player("Hi-Lite", "S"));
        harlemPlayers.add(new Player("TNT", "G"));
        list.add(new Team("Globetrotters", "Harlem", "Big G", harlemPlayers));
        list.add(new Team("Generals", "Washington", null, null));
        teamRepository.save(list);
    }
}
