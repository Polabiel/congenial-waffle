package com.exercicio.controller;

import com.exercicio.models.SupplierModels;
import com.exercicio.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;

import java.util.List;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {

    private final SupplierRepository _supplierRepository;

    @Autowired
    public SupplierController(SupplierRepository supplierRepository) {
        _supplierRepository = supplierRepository;
    }

    @GetMapping
    public ResponseEntity<List<SupplierModels>> getSupplier() {
        List<SupplierModels> suppliers = _supplierRepository.findAll();

        return suppliers.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(suppliers);
    }

    @PostMapping
    public ResponseEntity<?> createSupplier(@RequestBody SupplierModels supplierModels) {
        SupplierModels saveSupplier = _supplierRepository.save(supplierModels);

        return ResponseEntity.status(HttpStatus.CREATED).body(saveSupplier);
    }

    @PutMapping("/{ID}")
    public ResponseEntity<SupplierModels> updateSupplier (@PathVariable Integer ID, @RequestBody SupplierModels supplierModels){
        return _supplierRepository.findById(ID).map(existingSupplier -> {
            existingSupplier.setName(supplierModels.getName());
            existingSupplier.setAddress(supplierModels.getAddress());
            existingSupplier.setCity(supplierModels.getCity());
            existingSupplier.setState(supplierModels.getState());
            existingSupplier.setPostalCode(supplierModels.getPostalCode());
        })
                .orElseGet(()-> ResponseEntity.status(HttpStatus.CREATED).body(_supplierRepository.save(supplierModels)));
    }
}
