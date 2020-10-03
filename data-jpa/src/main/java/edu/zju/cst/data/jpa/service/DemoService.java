package edu.zju.cst.data.jpa.service;


import edu.zju.cst.data.jpa.domain.Person;

public interface DemoService {
    public Person savePersonWithRollBack(Person person);

    public Person savePersonWithoutRollBack(Person person);
}
