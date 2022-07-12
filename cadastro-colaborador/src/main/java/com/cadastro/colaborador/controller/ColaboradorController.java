package com.cadastro.colaborador.controller;

import com.cadastro.colaborador.domain.FuncionarioDomain;
import com.cadastro.colaborador.service.ColaboradorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
@Api(value = "Clínica Médica API REST")
@CrossOrigin(origins = "*")
public class ColaboradorController {

    final ColaboradorService service;

    public ColaboradorController(ColaboradorService service) {
        this.service = service;
    }

    @PostMapping("/cadastrar-funcionario")
    @ApiOperation(value = "cadastra novo funcionario")
    public ResponseEntity<Object> cadastrarAluno() {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.recuperar());
    }
    @GetMapping("/recuperar-funcionario")
    @ApiOperation(value = "recupera funcionarios")
    public ResponseEntity<Object> cadastrarAluno(@RequestBody FuncionarioDomain aluno) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(aluno));
    }
}
