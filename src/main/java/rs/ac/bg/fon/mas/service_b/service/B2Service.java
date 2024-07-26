/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rs.ac.bg.fon.mas.service_b.service;

import rs.ac.bg.fon.mas.service_b.dto.A2Dto;

/**
 *
 * @author Predrag
 */
public interface B2Service {
    public boolean create(A2Dto a2);
    public boolean update(A2Dto a2);
    public boolean delete(Long id);
}
