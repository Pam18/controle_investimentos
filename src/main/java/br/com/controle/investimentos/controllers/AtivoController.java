package br.com.controle.investimentos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.controle.investimentos.services.IAtivoService;

@RestController
public class AtivoController {
	
	@Autowired 
	private IAtivoService iAtivoService;

    @GetMapping("/")
    public ResponseEntity<?> listarTodosAtivos() {
    	return ResponseEntity.status(200).body(iAtivoService.listarAtivo());
//    	return ResponseEntity.status(200).body("ok");

    }
}
