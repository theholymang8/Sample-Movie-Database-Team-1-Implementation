package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.Actor;
import com.pfseven.smdb.smdb.domain.Director;

import java.util.List;

public interface DirectorService extends BaseService<Director, Long> {

    List<Director> findDirectorByFirstName(String firstName);

    Director findDirectorByFullName(String firstName, String lastName);

    Long exportDirectors(Director director);
}
