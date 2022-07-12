package com.cadastro.colaborador.controller;

import com.cadastro.colaborador.classes.Funcionarios;
import com.cadastro.colaborador.service.CadastroFuncionariosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroFuncionarioController {
    private final CadastroFuncionariosService cadastroFuncionariosService;

    public CadastroFuncionarioController(CadastroFuncionariosService cadastroFuncionariosService) {
        this.cadastroFuncionariosService = cadastroFuncionariosService;
    }

    @PostMapping
    public void cadastrarFuncionarios(Funcionarios funcionarios){
        cadastrarFuncionarios(funcionarios);

        ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
