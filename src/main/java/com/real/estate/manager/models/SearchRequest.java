package com.real.estate.manager.models;

public class SearchRequest {
    private int minTotalArea;
    private int price;
    private int minNoOfBed;
    private int minNoOfBath;

    public int getMinTotalArea() {
        return minTotalArea;
    }

    public void setMinTotalArea(int minTotalArea) {
        this.minTotalArea = minTotalArea;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMinNoOfBed() {
        return minNoOfBed;
    }

    public void setMinNoOfBed(int minNoOfBed) {
        this.minNoOfBed = minNoOfBed;
    }

    public int getMinNoOfBath() {
        return minNoOfBath;
    }

    public void setMinNoOfBath(int minNoOfBath) {
        this.minNoOfBath = minNoOfBath;
    }

    public int getMinAreaOfBed() {
        return minAreaOfBed;
    }

    public void setMinAreaOfBed(int minAreaOfBed) {
        this.minAreaOfBed = minAreaOfBed;
    }

    public int getMinAreaOfBath() {
        return minAreaOfBath;
    }

    public void setMinAreaOfBath(int minAreaOfBath) {
        this.minAreaOfBath = minAreaOfBath;
    }

    private int minAreaOfBed;
    private int minAreaOfBath;
}
