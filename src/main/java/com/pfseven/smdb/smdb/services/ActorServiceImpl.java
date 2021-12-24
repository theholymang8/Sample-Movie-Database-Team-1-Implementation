package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.Actor;
import com.pfseven.smdb.smdb.repositories.ActorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActorServiceImpl extends BaseServiceImpl<Actor> implements ActorService{

    private final ActorRepository actorRepository;

    @Override
    public JpaRepository<Actor, Long> getRepository() {
        return actorRepository;
    }


}
