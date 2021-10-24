package com.real.estate.manager.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Apartment {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull private Integer totalArea;
    @NotNull private Integer price;
    @NotNull private Integer noOfBedRoom;
    @NotNull private Integer noOfBathRoom;
    @NotNull private Integer bedRoomArea;
    @NotNull private Integer bathRoomArea;

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

    public int getNoOfBedRoom() {
        return noOfBedRoom;
    }

    public void setNoOfBedRoom(int noOfBedRoom) {
        this.noOfBedRoom = noOfBedRoom;
    }

    public int getNoOfBathRoom() {
        return noOfBathRoom;
    }

    public void setNoOfBathRoom(int noOfBathRoom) {
        this.noOfBathRoom = noOfBathRoom;
    }

    public int getBedRoomArea() {
        return bedRoomArea;
    }

    public void setBedRoomArea(int bedRoomArea) {
        this.bedRoomArea = bedRoomArea;
    }

    public int getBathRoomArea() {
        return bathRoomArea;
    }

    public void setBathRoomArea(int bathRoomArea) {
        this.bathRoomArea = bathRoomArea;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
