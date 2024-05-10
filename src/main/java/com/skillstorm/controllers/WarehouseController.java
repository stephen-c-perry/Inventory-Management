package com.skillstorm.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Service;

@RestController
public class WarehouseController {

    // Create mappings for requests

    @GetMapping("/warehouses")
    public List<Warehouse> findAll(@RequestParam(defaultValue = "3") int limit) {
        return service.findAll(limit);
    }

    @GetMapping("/warehouse/{id}")
    public Warehouse findById(@PathVariable int id) {
        return null;
    
    

}
