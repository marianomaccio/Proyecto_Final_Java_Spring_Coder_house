package com.coderhouse.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_item")
    private long id;

    @Column
    private String description;
    @JsonIgnore
    @OneToMany(mappedBy = "item", cascade = CascadeType.REMOVE)
    private List<Product> productList;
}
