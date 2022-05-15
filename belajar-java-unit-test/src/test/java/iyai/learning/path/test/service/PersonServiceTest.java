package iyai.learning.path.test.service;

import iyai.learning.path.test.data.Person;
import iyai.learning.path.test.repository.PersonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@Extensions({
       @ExtendWith(MockitoExtension.class)
})
public class PersonServiceTest {
    @Mock
    PersonRepository personRepository;

    PersonService personService;

    @BeforeEach
    void setUp() {
        personService = new PersonService(personRepository);
    }

    @Test
    void testGetPersonNotFound() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            personService.get("not found");
        });
    }

    @Test
    void testGetPersonSuccess() {
        // behaviour
        Mockito.when(personRepository.selectBy("eko"))
                .thenReturn(new Person("eko", "Eko"));
        // proses
        var person = personService.get("eko");

        Assertions.assertNotNull(person);
        Assertions.assertEquals("eko", person.getId());
        Assertions.assertEquals("Eko", person.getName());
    }
}
