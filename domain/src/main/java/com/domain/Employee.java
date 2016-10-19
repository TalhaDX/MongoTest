package com.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
import java.util.UUID;

/**
 * Created by Talha on 10/17/2016.
 */
@Document(collection = "employee")
public class Employee {

    @Id
    private final UUID id;
    private final String name;

    @PersistenceConstructor
    public Employee(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
