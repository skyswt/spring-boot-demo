package edu.zju.cst.data.mongo.dao;

import java.util.List;

import edu.zju.cst.data.mongo.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


public interface PersonRepository extends MongoRepository<Person, String> {
    Person findByName(String name);

    @Query("{'age': ?0}")
    List<Person> withQueryFindByAge(Integer age);
}
