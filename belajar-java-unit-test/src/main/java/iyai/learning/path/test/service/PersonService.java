package iyai.learning.path.test.service;

import iyai.learning.path.test.data.Person;
import iyai.learning.path.test.repository.PersonRepository;

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
}
