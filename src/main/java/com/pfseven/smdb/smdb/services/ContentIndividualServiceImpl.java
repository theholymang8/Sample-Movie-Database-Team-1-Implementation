package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.ContentIndividual;
import com.pfseven.smdb.smdb.repositories.ContentIndividualRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ContentIndividualServiceImpl  extends BaseServiceImpl<ContentIndividual> implements ContentIndividualService{

    private final ContentIndividualRepository contentIndividualRepository;

    public JpaRepository<ContentIndividual, Long> getRepository() {
        return contentIndividualRepository;
    }


}
