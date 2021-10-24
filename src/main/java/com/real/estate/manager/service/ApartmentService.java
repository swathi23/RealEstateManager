package com.real.estate.manager.service;

import com.real.estate.manager.models.Apartment;
import com.real.estate.manager.models.SearchRequest;
import com.real.estate.manager.repository.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApartmentService {
    @Autowired
    private ApartmentRepository apartmentRepository;

    public Apartment create(Apartment apartment) {

        return apartmentRepository.save(apartment);
    }

    public Apartment find(SearchRequest request) {
        return apartmentRepository.findApartments(request.getMinNoOfBed(), request.getMinNoOfBath(),
                request.getMinTotalArea(), request.getMinAreaOfBath(), request.getMinAreaOfBed(), request.getPrice());
    }
}