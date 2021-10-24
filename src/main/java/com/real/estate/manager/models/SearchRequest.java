package com.real.estate.manager.models;

public class SearchRequest {
    private int minTotalArea;
    private int price;
    private int minNoOfBed;
    private int minNoOfBath;
    private int minAreaOfBed;
    private int minAreaOfBath;

    public int getMinTotalArea() {
        return minTotalArea;
    }

    public int getPrice() {
        return price;
    }

    public int getMinNoOfBed() {
        return minNoOfBed;
    }

    public int getMinNoOfBath() {
        return minNoOfBath;
    }

    public int getMinAreaOfBed() {
        return minAreaOfBed;
    }

    public int getMinAreaOfBath() {
        return minAreaOfBath;
    }

}
