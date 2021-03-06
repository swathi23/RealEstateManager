package com.real.estate.manager.repository;

import com.real.estate.manager.models.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ApartmentRepository extends JpaRepository<Apartment, Long> {

    @Query(value = "SELECT * FROM Apartment a WHERE " +
            "a.no_of_bed_room >= :minBeds and " +
            "a.no_of_bath_room >= :minBath and " +
            "a.total_area >= :totalArea and " +
            "a.bath_room_area >= :bathRoomArea and " +
            "a.bed_room_area >= :bedRoomArea and " +
            "a.price <= :price " +
            "order by price limit 1", nativeQuery = true)
    Apartment findApartments(@Param("minBeds") int minBeds,
                             @Param("minBath") int minBath,
                             @Param("totalArea") int totalArea,
                             @Param("bathRoomArea") int bathRoomArea,
                             @Param("bedRoomArea") int bedRoomArea,
                             @Param("price") int price);

}
