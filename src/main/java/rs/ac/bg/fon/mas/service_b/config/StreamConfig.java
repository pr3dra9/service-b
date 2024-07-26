/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.mas.service_b.config;

import java.util.function.Consumer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rs.ac.bg.fon.mas.service_b.dto.A2Dto;

/**
 *
 * @author Predrag
 */
@Configuration
public class StreamConfig {

    @Bean
    public Consumer<A2Dto> consumeCreateA2Message() {
        return a2 -> System.out.println("A2 Created -" + 
                " ID: " + a2.id() + 
                " Name: " + a2.name() +
                " Active: " + a2.active() + 
                " Code: " + a2.code() + 
                ".");
    }
  
    @Bean
    public Consumer<A2Dto> consumeUpdateA2Message() {
        return a2 -> System.out.println("A2 Updated -" + 
                " ID: " + a2.id() + 
                " Name: " + a2.name() +
                " Active: " + a2.active() + 
                " Code: " + a2.code() + 
                ".");
    }
    
    @Bean
    public Consumer<Boolean> consumeDeleteA2Message() {
        return signal -> System.out.println("Brisanje objekta je uspesno: " + signal.toString());
    }

}
