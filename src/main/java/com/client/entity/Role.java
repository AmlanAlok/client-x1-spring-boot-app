package com.client.entity;

import javax.persistence.*;

@Entity
@Table(name="roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
