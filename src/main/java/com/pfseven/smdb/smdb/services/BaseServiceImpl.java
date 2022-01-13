package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.base.AbstractLogComponent;
import com.pfseven.smdb.smdb.domain.BaseModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class BaseServiceImpl<T extends BaseModel> extends AbstractLogComponent
    implements BaseService<T, Long>{

    public abstract JpaRepository<T, Long> getRepository();

    @Override
    public T create(final T entity){
        logger.trace("Creating {}.", entity);
        return getRepository().save(entity);
    }

    @Override
    public List<T> createAll(List<T> entities){
        final List<T> updatedEntities = new ArrayList<>();
        for (final T entity : entities) {
            updatedEntities.add(create(entity));
        }
        return updatedEntities;
    }

    @Override
    public List<T> createAll(final T... entities) {
        return createAll(Arrays.asList(entities));
    }

    @Override
    public void update(final T entity) {
        logger.trace("Updating {}.", entity);
        getRepository().save(entity);
    }

    @Override
    public void delete(final T entity) {
        logger.trace("Deleting {}.", entity);
        getRepository().delete(entity);
    }

    @Override
    public void deleteById(final Long id) {
        final T entityFound = getRepository().getById(id);
        logger.trace("Deleting {}.", entityFound);
        getRepository().deleteById(id);
    }

    @Override
    public boolean exists(final T entity) {
        logger.trace("Checking whether {} exists.", entity);
        return getRepository().existsById(entity.getId());
    }

    @Override
    public List<T> findAll() {
        logger.trace("Retrieving all data.");
        return getRepository().findAll();
    }

    @Override
    public T find(Long id) {
        return getRepository().findById(id).orElseThrow(NoSuchElementException::new);
    }


}
