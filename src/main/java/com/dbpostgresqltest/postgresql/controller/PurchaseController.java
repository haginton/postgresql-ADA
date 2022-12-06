package com.dbpostgresqltest.postgresql.controller;

import com.dbpostgresqltest.postgresql.model.PurchaseDto;
import com.dbpostgresqltest.postgresql.model.UserDto;
import com.dbpostgresqltest.postgresql.repository.PurchaseRepository;
import com.dbpostgresqltest.postgresql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/purchases")
public class PurchaseController {

    private final PurchaseRepository purchaseRepository;

    @Autowired
    public PurchaseController(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @GetMapping
    public ResponseEntity<List<PurchaseDto>> getAll() {
        return new ResponseEntity<>(purchaseRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<PurchaseDto> insertUser(
            @RequestBody PurchaseDto purchase
    ) {
        return new ResponseEntity<>(purchaseRepository.save(purchase), HttpStatus.CREATED);
    }

}
