### Cannot use AsyncCrudRepository from Groovy

Groovy compilation fails with 

```shell
micronaut-data-async-groovy-issue/src/main/groovy/com/example/MyAsyncRepository.groovy: -1: Unable to implement Repository method: MyAsyncRepository.saveAll(Iterable entities). No possible implementations found.
```

It looks like some generics are missing 🤔

