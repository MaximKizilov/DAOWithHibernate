package ru.netology.daowithhibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.*;
import ru.netology.daowithhibernate.entity.Person;

import java.util.List;

@Repository
public class JPARepository {


     @PersistenceContext
     private EntityManager entityManager;

     public List<Person> getPersonsByCity(String cityOfLiving){
          Query query = entityManager.createQuery("select p from Person p where lower(p.cityOfLiving) = lower(:city)", Person.class);
          query.setParameter("city", cityOfLiving);
          return query.getResultList();
     }
}
