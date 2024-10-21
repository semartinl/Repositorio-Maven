package es.unex.aos.lab1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import es.unex.aos.lab1.models.Team;
@RestResource(path = "teams", rel = "team")
public interface TeamRepository extends CrudRepository<Team, Long> {

}
