package ru.netology.daowithhibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.daowithhibernate.entity.Person;
import ru.netology.daowithhibernate.service.JPAService;

import java.util.List;

@RestController
public class JPAController {
    public JPAService service;

    public JPAController(JPAService service) {
        this.service = service;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam String city) {
            return service.getPersonsByCity(city);
    }
}
