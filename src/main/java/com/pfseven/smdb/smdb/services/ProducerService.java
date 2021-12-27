package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.Actor;
import com.pfseven.smdb.smdb.domain.Producer;

import java.util.List;

public interface ProducerService extends BaseService<Producer, Long>  {

    List<Producer> findProducerByFirstName(String firstName);

    Producer findProducerByFullName(String firstName, String lastName);

    Long exportProducers(Producer producer);
}
