package com.example.backendigor;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClimaController {
    @GetMapping("/")
    public String viajem(@RequestParam String clima, @RequestParam String estilo) {
        if ("calor".equals(clima) && "natureza".equals(estilo)){
            return "Rio de janeiro";}
        else if ("calor".equals(clima) && "cultural".equals(estilo)) {
            return "Salvador";}
        else if ("frio".equals(clima) && "cultural".equals(estilo)) {
            return "Gramado";}
        else if ("frio".equals(clima) && "natureza".equals(estilo)) {
            return "cordoba";}else {
            return "Invalido";
        }
    }

    }




