package ru.netology.daowithhibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.daowithhibernate.entity.Person;
import ru.netology.daowithhibernate.service.JPAService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class JPAController {
    public JPAService service;

    public JPAController(JPAService service) {
        this.service = service;
    }

    @GetMapping("/by-city")
    public List<Person> getPersonsByCity(@RequestParam String city) {
            return service.getPersonsByCity(city);
    }

    @GetMapping("/by-age")
    public List<Person> getPersonsByAge(@RequestParam int age) {
        return service.getPersonsByAge(age);
    }

    @GetMapping("/by-name-surname")
    protected Optional<Person> getPersonsByNameAndSurname(@RequestParam String name, @RequestParam String surname) {
        return service.getPersonsByNameAndSurname(name, surname);
    }
}
