package lab1.controller;

import lab1.domain.Team;
import lab1.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    @Autowired
    TeamRepository teamRepository;

    @RequestMapping("/teams")
    public Iterable<Team> getTeams() {
        return teamRepository.findAll();
    }
}
