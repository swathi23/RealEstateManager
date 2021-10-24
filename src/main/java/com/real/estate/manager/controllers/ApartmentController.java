package com.real.estate.manager.controllers;

import com.real.estate.manager.models.Apartment;
import com.real.estate.manager.models.SearchRequest;
import com.real.estate.manager.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ApartmentController {
    @Autowired
    private
    ApartmentService service;
    @PostMapping("/apartment")
    public ResponseEntity<Object> create(@RequestBody Apartment apartment) {
        Apartment result = service.create(apartment);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/search")
    public ResponseEntity<Object> search(@RequestBody SearchRequest request) {
        Apartment apartment = service.find(request);
        return ResponseEntity.ok(apartment);

    }

}
