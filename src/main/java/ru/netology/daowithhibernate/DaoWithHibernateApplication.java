package ru.netology.daowithhibernate;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.netology.daowithhibernate.entity.Person;
import ru.netology.daowithhibernate.entity.PersonsRequisite;

import java.util.List;

@SpringBootApplication
public class DaoWithHibernateApplication/* implements CommandLineRunner */{

//    @PersistenceContext
//    private EntityManager em;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DaoWithHibernateApplication.class);
        app.run(args);
    }

//    @Override
//    @Transactional
//    public void run(String... args) throws Exception {
//        List<Person> personList = List.of(new Person.PersonBuilder(
//                new PersonsRequisite("Маша", "Маркова", 18), "Москва")
//                .setPhoneNumber("+79202073131").build(),
//                new Person.PersonBuilder(
//                        new PersonsRequisite("Ваня", "Ванин", 20), "Уфа")
//                        .setPhoneNumber("+79202073131").build(),
//                new Person.PersonBuilder(
//                        new PersonsRequisite("Петя", "Питин", 22), "Москва")
//                        .setPhoneNumber("+79202073131").build(),
//                new Person.PersonBuilder(
//                        new PersonsRequisite("Вова", "Вовин", 17), "Рязань")
//                        .build());
//        personList.forEach(em::persist);
//    }
}
