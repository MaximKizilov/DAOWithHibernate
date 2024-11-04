package ru.netology.daowithhibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;

@Embeddable
public class PersonsRequisite {

    public PersonsRequisite() {

    }

    public PersonsRequisite(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    private String name;

    private String surname;

    private int age;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonsRequisite{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
