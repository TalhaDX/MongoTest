package com.domain;

import java.util.UUID;

/**
 * Created by Talha on 10/17/2016.
 */
public class Employee {

    private final UUID id;
    private final String name;

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
