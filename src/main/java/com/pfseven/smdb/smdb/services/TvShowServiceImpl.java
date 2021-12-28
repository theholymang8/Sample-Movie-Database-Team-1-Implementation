package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.TvShow;
import com.pfseven.smdb.smdb.repositories.TvShowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TvShowServiceImpl extends BaseServiceImpl<TvShow> implements TvShowService{

    private final TvShowRepository tvShowRepository;

    @Override
    public JpaRepository<TvShow, Long> getRepository() {
        return tvShowRepository;
    }
}
