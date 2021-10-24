package com.real.estate.manager.models;

import javax.validation.constraints.NotNull;

public class SearchRequest {
    @NotNull private Integer minTotalArea;
    @NotNull private Integer price;
    @NotNull private Integer minNoOfBedRoom;
    @NotNull private Integer minNoOfBathRoom;
    @NotNull private Integer minBedRoomArea;
    @NotNull private Integer minBathRoomArea;

    public int getMinTotalArea() {
        return minTotalArea;
    }

    public int getPrice() {
        return price;
    }

    public int getMinNoOfBedRoom() {
        return minNoOfBedRoom;
    }

    public int getMinNoOfBathRoom() {
        return minNoOfBathRoom;
    }

    public int getMinBedRoomArea() {
        return minBedRoomArea;
    }

    public int getMinBathRoomArea() {
        return minBathRoomArea;
    }

}
