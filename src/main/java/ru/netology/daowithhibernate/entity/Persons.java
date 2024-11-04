package ru.netology.daowithhibernate.entity;

import jakarta.persistence.*;

@Entity
public class Persons {

    public Persons() {

    }

    public Persons(PersonsRequisite personsRequisite, String phoneNumber, String citiOfLiving) {
        this.personsRequisite = personsRequisite;
        this.phoneNumber = phoneNumber;
        this.citiOfLiving = citiOfLiving;
    }

    public Persons(PersonsBuilder personsBuilder) {
        this.personsRequisite = personsBuilder.personsRequisite;
        this.phoneNumber = personsBuilder.phoneNumber;
        this.citiOfLiving = personsBuilder.citiOfLiving;
    }


    @EmbeddedId
    private PersonsRequisite personsRequisite;

    private String phoneNumber;

    @Embedded
    private String citiOfLiving;


    public static class  PersonsBuilder{
        private Long id;
        private PersonsRequisite personsRequisite;
        private String phoneNumber;
        private String citiOfLiving;

        public PersonsBuilder(PersonsRequisite personsRequisite, String citiOfLiving) {
            this.personsRequisite = personsRequisite;
            this.citiOfLiving = citiOfLiving;
        }


        public PersonsBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public Persons build() {
            return new Persons(this);
        }
    }

    @Override
    public String toString() {
        return "Persons{" +
                ", personsRequisite=" + personsRequisite +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", citiOfLiving='" + citiOfLiving + '\'' +
                '}';
    }
}
