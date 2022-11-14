package com.coderhouse.app.entity;

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

    @OneToMany(mappedBy = "item")
    private List<Product> productList;
}
