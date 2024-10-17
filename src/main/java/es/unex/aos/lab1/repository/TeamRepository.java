package es.unex.aos.lab1.repository;

import org.springframework.data.repository.CrudRepository;

import es.unex.aos.lab1.models.Team;

public interface TeamRepository extends CrudRepository<Team, Long> {

}
