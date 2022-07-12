package com.cadastro.colaborador.service;

import com.cadastro.colaborador.classes.Funcionarios;
import com.cadastro.colaborador.repository.FuncionariosRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CadastroFuncionariosService {
    @Autowired
    private FuncionariosRepository funcionariosRepository;

}
