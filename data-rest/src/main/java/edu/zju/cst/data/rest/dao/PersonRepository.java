package edu.zju.cst.data.rest.dao;

import edu.zju.cst.data.rest.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.transaction.annotation.Transactional;


@RepositoryRestResource(path = "people")
@Transactional
public interface PersonRepository extends JpaRepository<Person, Long> {
    @RestResource(path = "nameStartsWith", rel = "nameStartsWith")
    Person findByNameStartsWith(@Param("name") String name);
}
