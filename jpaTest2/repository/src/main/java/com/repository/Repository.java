package com.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

/**
 * Created by Talha on 10/17/2016.
 */
public interface Repository<T> extends CrudRepository<T, UUID>{

}
