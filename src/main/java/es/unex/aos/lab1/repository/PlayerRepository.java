package es.unex.aos.lab1.repository;

import org.springframework.data.rest.core.annotation.RestResource;

import es.unex.aos.lab1.models.Player;

import org.springframework.data.repository.CrudRepository;
@RestResource(path = "players", rel = "player")
public interface PlayerRepository  extends CrudRepository<Player, Long> {

}
