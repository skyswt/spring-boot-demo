package edu.zju.cst.data.jpa.service;

import edu.zju.cst.data.jpa.domain.Person;

public interface CacheService {
    public Person save(Person person);

    public void remove(Long id);

    public Person findOne(Person person);

}
