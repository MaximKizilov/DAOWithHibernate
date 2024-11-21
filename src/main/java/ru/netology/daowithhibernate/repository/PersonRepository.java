package ru.netology.daowithhibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;
import ru.netology.daowithhibernate.entity.Person;
import ru.netology.daowithhibernate.entity.PersonsRequisite;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, PersonsRequisite> {

     public List<Person> findByCityOfLiving(String city);
     public List<Person> findPersonByPersonsRequisiteAgeBeforeOrderByPersonsRequisiteAsc(int age);
     Optional<Person> findPersonByPersonsRequisite_NameContainingIgnoreCaseAndAndPersonsRequisite_SurnameContainingIgnoreCase(String name, String surname);

//     @PersistenceContext
//     private EntityManager entityManager;
//
//     public List<Person> getPersonsByCity(String cityOfLiving){
//          Query query = entityManager.createQuery("select p from Person p where lower(p.cityOfLiving) = :cityOfLiving", Person.class);
//          query.setParameter("cityOfLiving", cityOfLiving.toLowerCase());
//          return query.getResultList();
//     }
}
