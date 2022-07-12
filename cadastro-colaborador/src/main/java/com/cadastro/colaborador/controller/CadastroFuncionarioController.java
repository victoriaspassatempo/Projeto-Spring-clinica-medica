package com.cadastro.colaborador.controller;

import com.cadastro.colaborador.classes.Cargos;
import com.cadastro.colaborador.classes.ExFuncionario;
import com.cadastro.colaborador.classes.Funcionarios;
import com.cadastro.colaborador.classes.Salario;
import com.cadastro.colaborador.service.CadastroCargosService;
import com.cadastro.colaborador.service.CadastroExFuncionarioService;
import com.cadastro.colaborador.service.CadastroFuncionariosService;
import com.cadastro.colaborador.service.CadastroSalarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroFuncionarioController {
    private final CadastroFuncionariosService cadastroFuncionariosService;
    private final CadastroExFuncionarioService cadastroExFuncionarioService;
    private final CadastroSalarioService cadastroSalarioService;
    private final CadastroCargosService cadastroCargosService;

    public CadastroFuncionarioController(CadastroFuncionariosService cadastroFuncionariosService, CadastroExFuncionarioService cadastroExFuncionarioService,
                                         CadastroSalarioService cadastroSalarioService, CadastroCargosService cadastroCargosService) {
        this.cadastroFuncionariosService = cadastroFuncionariosService;
        this.cadastroExFuncionarioService = cadastroExFuncionarioService;
        this.cadastroSalarioService = cadastroSalarioService;
        this.cadastroCargosService = cadastroCargosService;
    }

    @PostMapping
    public void cadastrarFuncionarios(Funcionarios funcionarios, Cargos cargos, ExFuncionario exFuncionario, Salario salario){
        cadastrarFuncionarios(funcionarios, cargos, exFuncionario,salario);
        ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
