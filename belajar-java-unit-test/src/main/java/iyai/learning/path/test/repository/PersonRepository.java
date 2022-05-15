package iyai.learning.path.test.repository;

import iyai.learning.path.test.data.Person;

public interface PersonRepository {
    Person selectBy(String id);
    void insert(Person person);
}
