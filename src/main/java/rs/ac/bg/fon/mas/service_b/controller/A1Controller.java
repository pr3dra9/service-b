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
public class A1Controller {
    
    @Autowired
    private B1Service service;
    
    @GetMapping("service-a/a1/{id}")
    public @ResponseBody ResponseEntity<A1Dto> getA1(@PathVariable Long id) {
      A1Dto res = service.getA1(id);
      if (res == null)
          return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
      return ResponseEntity.status(HttpStatus.OK).body(res);
    }
    
}
