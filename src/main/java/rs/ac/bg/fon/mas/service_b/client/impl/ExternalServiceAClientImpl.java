/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.mas.service_b.client.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import rs.ac.bg.fon.mas.service_b.client.ExternalServiceAClient;
import rs.ac.bg.fon.mas.service_b.model.A1Dto;

/**
 *
 * @author Predrag
 */
@Component
public class ExternalServiceAClientImpl implements ExternalServiceAClient{
    
    private final RestTemplate restTemplate;
    private final String aServiceUrl;
    
    @Autowired
    public ExternalServiceAClientImpl(RestTemplate restTemplate,
            @Value("${app.a-service.host:localhost}") String aServiceHost,
            @Value("${app.a-service.port:81}") String aServicePort) {
        this.restTemplate = restTemplate;
        this.aServiceUrl = "http://" + aServiceHost + ":" + aServicePort + "/a1/";
    }
    
    @Override
    public A1Dto getA1ById(Long id) {
        ResponseEntity<A1Dto> resEntity = restTemplate.exchange("http://SERVICE-A/a1/{id}", HttpMethod.GET, null, A1Dto.class, id);
        return resEntity.getBody();
    }
    
}
