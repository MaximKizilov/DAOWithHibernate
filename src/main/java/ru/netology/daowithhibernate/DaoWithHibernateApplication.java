package ru.netology.daowithhibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.netology.daowithhibernate.entity.Persons;
import ru.netology.daowithhibernate.entity.PersonsRequisite;

@SpringBootApplication
public class DaoWithHibernateApplication implements CommandLineRunner {

    @PersistenceContext
    private EntityManager em;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DaoWithHibernateApplication.class);
        app.run(args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        Persons masha = new Persons.PersonsBuilder(
                new PersonsRequisite("Маша", "Маркова", 18), "Москва")
                .setPhoneNumber("+79202073131").build();

        em.persist(masha);
    }
}
