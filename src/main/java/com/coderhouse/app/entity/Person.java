package com.coderhouse.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_person")
    private long id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column(name = "identity_document")
    private String identityDocument;

    @Column
    private String adress;

    @Column(name = "date_birth")
    private LocalDate dateBirth;

    @Column
    private String state;
    @JsonIgnore
    @OneToMany(mappedBy = "person", cascade = CascadeType.REMOVE)
    private List<DetailSale> detailSaleList;
}
