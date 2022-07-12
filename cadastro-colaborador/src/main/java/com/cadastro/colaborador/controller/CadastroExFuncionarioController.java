package com.cadastro.colaborador.controller;

import com.cadastro.colaborador.classes.ExFuncionario;
import com.cadastro.colaborador.service.CadastroExFuncionarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class CadastroExFuncionarioController {

    private final CadastroExFuncionarioService cadastroExFuncionarioService;

    public CadastroExFuncionarioController(CadastroExFuncionarioService cadastroExFuncionarioService) {
        this.cadastroExFuncionarioService = cadastroExFuncionarioService;
    }

    @PostMapping
     public ResponseEntity<Void> cadastrarExFuncionario(ExFuncionario exFuncionario){
        cadastroExFuncionarioService.cadastrarExFuncionario(exFuncionario);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
