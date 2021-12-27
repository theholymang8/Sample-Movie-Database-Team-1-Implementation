package com.pfseven.smdb.smdb.services;

import lombok.RequiredArgsConstructor;

import com.pfseven.smdb.smdb.domain.Writer;
import com.pfseven.smdb.smdb.repositories.WriterRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WriterServiceImpl extends BaseServiceImpl<Writer> implements WriterService {

    private final WriterRepository writerRepository;

    @Override
    public JpaRepository<Writer, Long> getRepository() {
        return writerRepository;
    }
}
