package es.unex.aos.lab1;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import es.unex.aos.lab1.models.Team;
import es.unex.aos.lab1.repository.TeamRepository;

@SpringBootApplication
public class Lab1Application {
	@Autowired	TeamRepository teamRepository;


	public static void main(String[] args) {
		
		SpringApplication.run(Lab1Application.class, args);
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


        teamRepository.saveAll(list);
    }

}
