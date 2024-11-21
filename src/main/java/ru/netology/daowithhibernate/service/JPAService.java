package ru.netology.daowithhibernate.service;

import org.springframework.stereotype.Service;
import ru.netology.daowithhibernate.entity.Person;
import ru.netology.daowithhibernate.repository.PersonRepository;

import java.util.List;
import java.util.Optional;

@Service
public class JPAService {
    public PersonRepository repository;

    public JPAService(PersonRepository repository) {
        this.repository = repository;
    }
    public List<Person> getPersonsByCity(String city) {
        return repository.findByCityOfLiving(city);
    }

    public List<Person> getPersonsByAge(int age) {
        return repository.findPersonByPersonsRequisiteAgeBeforeOrderByPersonsRequisiteAsc(age);
    }

    public Optional<Person> getPersonsByNameAndSurname(String name, String surname) {
        return repository.findPersonByPersonsRequisite_NameContainingIgnoreCaseAndAndPersonsRequisite_SurnameContainingIgnoreCase(name, surname);
    }
}
