package com.real.estate.manager.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Apartment {
    @Id
    @GeneratedValue
    private Long id;
    private int totalArea;
    private int price;
    private int noOfBed;
    private int noOfBath;

    private int areaOfBed;
    private int areaOfBath;

    public Apartment(int totalArea, int price, int noOfBed, int noOfBath, int areaOfBed, int areaOfBath) {
        this.totalArea = totalArea;
        this.price = price;
        this.noOfBed = noOfBed;
        this.noOfBath = noOfBath;
        this.areaOfBed = areaOfBed;
        this.areaOfBath = areaOfBath;
    }

    public Apartment() { }

//    @OneToMany(mappedBy="apartment")
//    private Set<Room> rooms;


    public int getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(int totalArea) {
        this.totalArea = totalArea;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNoOfBed() {
        return noOfBed;
    }

    public void setNoOfBed(int noOfBed) {
        this.noOfBed = noOfBed;
    }

    public int getNoOfBath() {
        return noOfBath;
    }

    public void setNoOfBath(int noOfBath) {
        this.noOfBath = noOfBath;
    }

    public int getAreaOfBed() {
        return areaOfBed;
    }

    public void setAreaOfBed(int areaOfBed) {
        this.areaOfBed = areaOfBed;
    }

    public int getAreaOfBath() {
        return areaOfBath;
    }

    public void setAreaOfBath(int areaOfBath) {
        this.areaOfBath = areaOfBath;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
