package iyai.learning.path.test.service;

import iyai.learning.path.test.data.Person;
import iyai.learning.path.test.repository.PersonRepository;

import java.util.UUID;

public class PersonService {
    PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person get(String id){
        Person person = personRepository.selectBy(id);
        if(person != null){
            return person;
        } else {
            throw new IllegalArgumentException("Person not found");
        }
    }

    public Person register(String name){
        var person = new Person(UUID.randomUUID().toString(), name);
        personRepository.insert(person);
        return person;
    }
}
