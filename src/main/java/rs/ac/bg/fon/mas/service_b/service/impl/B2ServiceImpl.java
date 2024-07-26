/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.mas.service_b.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;
import rs.ac.bg.fon.mas.service_b.dto.A2Dto;
import rs.ac.bg.fon.mas.service_b.service.B2Service;

/**
 *
 * @author Predrag
 */
@Service
public class B2ServiceImpl implements B2Service{

    @Autowired
    private StreamBridge streamBridge;
    
    @Override
    public boolean create(A2Dto a2) {
        boolean signal = streamBridge.send("createA2-out-0", a2);
        System.out.println("SIGNAL: " + signal);
        return true;
    }

    @Override
    public boolean update(A2Dto a2) {
        boolean signal = streamBridge.send("updateA2-out-0", a2);
        System.out.println("SIGNAL: " + signal);
        return true;
    }

    @Override
    public boolean delete(Long id) {
        boolean signal = streamBridge.send("deleteA2-out-0", id);
        System.out.println("SIGNAL: " + signal);
        return true;
    }

}
