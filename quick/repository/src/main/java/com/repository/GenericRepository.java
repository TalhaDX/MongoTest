package com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

/**
 * Created by Talha on 10/17/2016.
 */
public class GenericRepository<T> implements CrudRepository<T, UUID> {

    private final MongoRepository<T, UUID> repository;

    public GenericRepository(MongoRepository<T, UUID> repository) {
        this.repository = repository;
    }

    @Override
    public <S extends T> S save(S entity) {
        return repository.save(entity);
    }

    @Override
    public <S extends T> Iterable<S> save(Iterable<S> entities) {
        return repository.save(entities);
    }

    @Override
    public T findOne(UUID uuid) {
        return repository.findOne(uuid);
    }

    @Override
    public boolean exists(UUID uuid) {
        return repository.exists(uuid);
    }

    @Override
    public Iterable<T> findAll() {
        return repository.findAll();
    }

    @Override
    public Iterable<T> findAll(Iterable<UUID> uuids) {
        return repository.findAll(uuids);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public void delete(UUID uuid) {
        repository.delete(uuid);

    }

    @Override
    public void delete(T entity) {
        repository.delete(entity);
    }

    @Override
    public void delete(Iterable<? extends T> entities) {
        repository.delete(entities);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }
}