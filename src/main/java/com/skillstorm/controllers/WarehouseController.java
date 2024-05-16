package com.skillstorm.controllers;

import com.skillstorm.models.Warehouse;
import com.skillstorm.repositories.WarehouseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class WarehouseController {

    @Autowired
    private WarehouseRepository warehouseRepository;

    // Create a new warehouse
    @PostMapping("/warehouses")
    @ResponseStatus(HttpStatus.CREATED)
    public Warehouse createWarehouse(@RequestBody Warehouse warehouse) {
        return warehouseRepository.save(warehouse);
    }

    // Get all warehouses
    @GetMapping("/warehouses")
    public List<Warehouse> getAllWarehouses() {
        return warehouseRepository.findAll();
    }

    // Get warehouse by ID
    @GetMapping("/warehouses/{id}")
    public ResponseEntity<Warehouse> getWarehouseById(@PathVariable Integer id) {
        Optional<Warehouse> warehouseOptional = warehouseRepository.findById(id);
        return warehouseOptional.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Update an existing warehouse
    @PutMapping("/warehouses/{id}")
    public ResponseEntity<Warehouse> updateWarehouse(@PathVariable Integer id, @RequestBody Warehouse updatedWarehouse) {
        Optional<Warehouse> existingWarehouseOptional = warehouseRepository.findById(id);
        if (existingWarehouseOptional.isPresent()) {
            Warehouse existingWarehouse = existingWarehouseOptional.get();
            existingWarehouse.setName(updatedWarehouse.getName());
            existingWarehouse.setCapacity(updatedWarehouse.getCapacity());
            return ResponseEntity.ok(warehouseRepository.save(existingWarehouse));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete a warehouse by ID
    @DeleteMapping("/warehouses/{id}")
    public ResponseEntity<Void> deleteWarehouse(@PathVariable Integer id) {
        if (warehouseRepository.existsById(id)) {
            warehouseRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
