package ru.netology.daowithhibernate.service;

import org.springframework.stereotype.Service;
import ru.netology.daowithhibernate.entity.Person;
import ru.netology.daowithhibernate.repository.JPARepository;

import java.util.List;

@Service
public class JPAService {
    public JPARepository repository;

    public JPAService(JPARepository repository) {
        this.repository = repository;
    }
    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }
}
