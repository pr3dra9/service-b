/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rs.ac.bg.fon.mas.service_b.client;

import rs.ac.bg.fon.mas.service_b.model.A1Dto;

/**
 *
 * @author Predrag
 */
public interface ExternalServiceAClient {
    A1Dto getA1ById(Long id);
}
