package ru.netology.daowithhibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.*;
import ru.netology.daowithhibernate.entity.Person;
import ru.netology.daowithhibernate.entity.PersonsRequisite;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, PersonsRequisite> {
     @Query(value = "SELECT * FROM Persons WHERE city_of_living = :city", nativeQuery = true)
     public List<Person> findByCity(String city);
     @Query(value = "SELECT * FROM Persons WHERE age<?1  ORDER BY age ASC", nativeQuery = true)
     public List<Person> findPersonByAge(int age);
     @Query(value = "SELECT * FROM Persons WHERE name like :name and surname like :surname", nativeQuery = true)
     Optional<Person> findPersonByNameSurname(String name, String surname);

}
