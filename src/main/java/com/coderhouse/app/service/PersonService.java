package com.coderhouse.app.service;

import com.coderhouse.app.dto.PersonDto;
import com.coderhouse.app.entity.Person;
import com.coderhouse.app.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public PersonDto findPersonById(long id) {
        Person person= personRepository.findById(id).orElseThrow(()->(new RuntimeException("Invalid Person")));
        int edad = Integer.parseInt(String.valueOf(Period.between(person.getDateBirth(), LocalDate.now()).getYears()));
        PersonDto personDto = new PersonDto();
        personDto.setName(person.getName());
        personDto.setSurname(person.getSurname());
        personDto.setAge(edad);
        personDto.setAdress(person.getAdress());
        personDto.setState(person.getState());
        return personDto;
    }

    public Person updatePersonById(long id, Person person) {
        Person personResponse = personRepository.findById(id).orElseThrow(()->(new RuntimeException("Invalid Person")));
        personResponse.setName(person.getName());
        personResponse.setSurname(person.getSurname());
        personResponse.setIdentityDocument(person.getIdentityDocument());
        personResponse.setAdress(person.getAdress());
        personResponse.setDateBirth(person.getDateBirth());
        personResponse.setState(person.getState());
        personRepository.save(personResponse);
        return personResponse;
    }

    public Person createPerson(Person person) {
        personRepository.save(person);
        return person;
    }

    public Person deletePersonById(long id) {
        Person person= personRepository.findById(id).orElseThrow(()->(new RuntimeException("Invalid Person")));
        personRepository.deleteById(id);
        return person;
    }
}
