package com.cadastro.colaborador.service;

import com.cadastro.colaborador.classes.Funcionarios;
import com.cadastro.colaborador.mapper.FuncionariosMapper;
import com.cadastro.colaborador.repository.FuncionariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroFuncionariosService {

    private final  FuncionariosRepository funcionariosRepository;

    public CadastroFuncionariosService(FuncionariosRepository funcionariosRepository) {
        this.funcionariosRepository = funcionariosRepository;
    }

    public void cadastrarFuncionarios(Funcionarios funcionarios){
        FuncionariosRepository.save(FuncionariosMapper.toFuncionariosDomain(funcionarios));
    }
}
