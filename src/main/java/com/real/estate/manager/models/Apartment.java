package com.real.estate.manager.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Apartment {
    @Id
    @GeneratedValue
    private Long id;
}
