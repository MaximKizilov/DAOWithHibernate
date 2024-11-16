package ru.netology.daowithhibernate.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "persons")
public class Person {

    public Person() {

    }

    public Person(PersonBuilder personBuilder) {
        this.personsRequisite = personBuilder.personsRequisite;
        this.phoneNumber = personBuilder.phoneNumber;
        this.cityOfLiving = personBuilder.cityOfLiving;
    }

    @EmbeddedId
    private PersonsRequisite personsRequisite;

    private String phoneNumber;

    @Column(name = "city_of_living")
    private String cityOfLiving;


    public static class PersonBuilder {
        private PersonsRequisite personsRequisite;
        private String phoneNumber;
        private String cityOfLiving;

        private PersonBuilder() {
        }

        public PersonBuilder(PersonsRequisite personsRequisite, String cityOfLiving) {
            this.personsRequisite = personsRequisite;
            this.cityOfLiving = cityOfLiving;
        }

        public PersonBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    public PersonsRequisite getPersonsRequisite() {
        return personsRequisite;
    }

    public void setPersonsRequisite(PersonsRequisite personsRequisite) {
        this.personsRequisite = personsRequisite;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCityOfLiving() {
        return cityOfLiving;
    }

    public void setCityOfLiving(String cityOfLiving) {
        this.cityOfLiving = cityOfLiving;
    }

    @Override
    public String toString() {
        return "Person{" +
                ", personsRequisite=" + personsRequisite +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", citiOfLiving='" + cityOfLiving + '\'' +
                '}';
    }
}
