package com.pfseven.smdb.smdb.repositories;

import com.pfseven.smdb.smdb.domain.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ActorRepository extends JpaRepository<Actor, Long> {

    List<Actor> findByFirstNameIgnoreCaseContaining(String firstName);

    Optional<Actor> findByFirstNameIgnoreCaseContainingAndLastNameIgnoreCaseContaining(String firstName, String lastName);

    Long exportActors(Actor actor);
}
