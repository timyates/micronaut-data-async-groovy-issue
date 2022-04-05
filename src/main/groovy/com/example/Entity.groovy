package com.example

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity

@MappedEntity
class Entity {

    @Id
    @GeneratedValue
    String id

    String name

    Entity(String name) {
        this.name = name
    }
}
