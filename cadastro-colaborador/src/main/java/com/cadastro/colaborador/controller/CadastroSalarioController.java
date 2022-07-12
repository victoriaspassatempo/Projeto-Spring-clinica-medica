package com.cadastro.colaborador.controller;

import com.cadastro.colaborador.classes.Salario;
import com.cadastro.colaborador.service.CadastroSalarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class CadastroSalarioController {
    private final CadastroSalarioService cadastroSalarioService;

    public CadastroSalarioController(CadastroSalarioService cadastroSalarioService) {
        this.cadastroSalarioService = cadastroSalarioService;
    }

    @PostMapping
    public ResponseEntity<Void> cadastrarSalario(Salario salario){
        cadastroSalarioService.cadastrarSalario(salario);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
