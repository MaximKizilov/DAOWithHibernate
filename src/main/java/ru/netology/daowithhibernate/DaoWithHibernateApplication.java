package ru.netology.daowithhibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.netology.daowithhibernate.entity.City;
import ru.netology.daowithhibernate.entity.Person;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DaoWithHibernateApplication implements CommandLineRunner {

    @PersistenceContext
    private EntityManager em;

    public static void main(String[] args) {
        SpringApplication.run(DaoWithHibernateApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        List<City> cities  = new ArrayList<>();
        cities.add(new City(1L, "Москва"));
        cities.add(new City(2L, "Казань"));
        cities.add(new City(3L, "Рязань"));
        cities.forEach(em::persist);
    }
}
