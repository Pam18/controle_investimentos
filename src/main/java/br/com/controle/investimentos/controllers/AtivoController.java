package br.com.controle.investimentos.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.controle.investimentos.services.IAtivoService;

@RestController
public class AtivoController {
    private static IAtivoService iAtivoService;

    @GetMapping("/")
    public static ResponseEntity<?> listarTodosAtivos() {
        return ResponseEntity.status(200).body(iAtivoService.listarAtivo());
    }
}
