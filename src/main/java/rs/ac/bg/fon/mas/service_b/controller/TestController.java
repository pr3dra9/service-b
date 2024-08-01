/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.mas.service_b.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Predrag
 */
@RestController
@RequestMapping("test")
public class TestController {
    
    @GetMapping(value="get", produces = "text/plain")
    public @ResponseBody ResponseEntity<String> testGet() {
        return ResponseEntity.status(HttpStatus.OK).body("Uspesno pozvana GET metoda");
    }
    
    @PostMapping(value="post", produces = "text/plain")
    public @ResponseBody ResponseEntity<String> testPost() {
        return ResponseEntity.status(HttpStatus.OK).body("Uspesno pozvana POST metoda");
    }

}
