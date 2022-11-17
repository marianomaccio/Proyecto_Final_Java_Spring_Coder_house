package com.coderhouse.app.controller;

import com.coderhouse.app.dto.PersonDto;
import com.coderhouse.app.entity.Person;
import com.coderhouse.app.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@ResponseBody
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<PersonDto> findPersonById(@PathVariable(name = "id") long id){
        return new ResponseEntity<>(this.personService.findPersonById(id), HttpStatus.ACCEPTED);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Person> updatePersonById(@PathVariable(name = "id") long id, @RequestBody Person person){
        return new ResponseEntity<>(this.personService.updatePersonById(id, person), HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        return new ResponseEntity<>(this.personService.createPerson(person), HttpStatus.ACCEPTED);
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Person> deletePersonById(@PathVariable(name = "id") long id){
        return new ResponseEntity<>(personService.deletePersonById(id), HttpStatus.ACCEPTED);
    }
}
