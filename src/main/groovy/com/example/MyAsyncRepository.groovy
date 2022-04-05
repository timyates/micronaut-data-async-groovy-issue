package com.example

import io.micronaut.data.mongodb.annotation.MongoRepository
import io.micronaut.data.repository.async.AsyncCrudRepository

@MongoRepository
interface MyAsyncRepository extends AsyncCrudRepository<Entity, String> {
}
