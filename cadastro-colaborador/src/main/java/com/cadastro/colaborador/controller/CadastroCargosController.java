package com.cadastro.colaborador.controller;

import com.cadastro.colaborador.classes.Cargos;
import com.cadastro.colaborador.service.CadastroCargosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroCargosController {
    private final CadastroCargosService cadastroCargosService;


    public CadastroCargosController(CadastroCargosService cadastroCargosService) {
        this.cadastroCargosService = cadastroCargosService;
    }

    @PostMapping
    public void cadastrarCargos(Cargos cargos){
        cadastrarCargos(cargos);

        ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
