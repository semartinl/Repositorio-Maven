package es.unex.aos.lab1.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import es.unex.aos.lab1.models.Player;
import es.unex.aos.lab1.models.Team;
import es.unex.aos.lab1.repository.TeamRepository;

@RestController
public class TeamController {
    @Autowired	TeamRepository teamRepository;
    

    @GetMapping("/teams")
    public Iterable<Team> getTeams() {
        return teamRepository.findAll();
    }
    @GetMapping("/teams/{id}")
    Team getTeam(@PathVariable Long id){

        return teamRepository.findById(id).get();
    }

    @GetMapping("/teams/players")
    Player getPlayers(){

        return teamRepository.findAll();
    }

}

