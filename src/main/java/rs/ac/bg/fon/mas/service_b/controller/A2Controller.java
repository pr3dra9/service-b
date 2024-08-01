/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.mas.service_b.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import rs.ac.bg.fon.mas.service_b.dto.A1Dto;
import rs.ac.bg.fon.mas.service_b.dto.A2Dto;
import rs.ac.bg.fon.mas.service_b.service.B1Service;
import rs.ac.bg.fon.mas.service_b.service.B2Service;

/**
 *
 * @author Predrag
 */
@RestController
@RequestMapping("")
public class A2Controller {
    
    @Autowired
    private B2Service b2service;
    
    @PostMapping(value="service-a/a2")
    public @ResponseBody ResponseEntity<Void> create(@RequestBody A2Dto a2) {
        b2service.create(a2);
        return ResponseEntity.accepted().build();
    }
    
    @PutMapping(value="service-a/a2")
    public @ResponseBody ResponseEntity<Void> update(@RequestBody A2Dto a2) {
        b2service.update(a2);
        return ResponseEntity.accepted().build();
    }
    
    @DeleteMapping(value="service-a/a2/{id}")
    public @ResponseBody ResponseEntity<Void> update(@PathVariable Long id) {
        b2service.delete(id);
        return ResponseEntity.accepted().build();
    }
    
}
