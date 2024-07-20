/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.mas.service_b.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.ac.bg.fon.mas.service_b.client.ExternalServiceAClient;
import rs.ac.bg.fon.mas.service_b.model.A1Dto;
import rs.ac.bg.fon.mas.service_b.service.B1Service;

/**
 *
 * @author Predrag
 */
@Service
public class B1ServiceImpl implements B1Service{

    
    private final ExternalServiceAClient serviceAClient; 

    @Autowired
    public B1ServiceImpl(ExternalServiceAClient serviceAClient) {
        this.serviceAClient = serviceAClient;
    }
        
    @Override
    public A1Dto getA1(Long id) {
        return serviceAClient.getA1ById(id);
    }
    
}
