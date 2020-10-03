package edu.zju.cst.data.jpa.service.impl;

import edu.zju.cst.data.jpa.dao.PersonRepository;
import edu.zju.cst.data.jpa.domain.Person;
import edu.zju.cst.data.jpa.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CacheServiceImpl implements CacheService {
    @Autowired
    PersonRepository personRepository;

    @Override
    @CachePut(value = "people", key = "#person.id")
    public Person save(Person person) {
        Person p = personRepository.save(person);
        System.out.println("为id、key为:" + p.getId() + "数据做了缓存");
        return p;
    }

    @Override
    @CacheEvict(value = "people")
    public void remove(Long id) {
        System.out.println("删除了id、key为" + id + "的数据缓存");
        //这里不做实际删除操作
    }

    @Override
    @Cacheable(value = "people", key = "#person.id")
    public Person findOne(Person person) {
        Optional<Person> p = personRepository.findById(person.getId());
        System.out.println("为id、key为:" + person.getId() + "数据做了缓存");
        return p.get();
    }

}
