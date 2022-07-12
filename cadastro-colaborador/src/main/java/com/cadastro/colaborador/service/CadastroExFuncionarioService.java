package com.cadastro.colaborador.service;

import com.cadastro.colaborador.classes.ExFuncionario;
import com.cadastro.colaborador.mapper.ExFuncionarioMapper;
import com.cadastro.colaborador.repository.ExFuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroExFuncionarioService {
    @Autowired
    private ExFuncionarioRepository exfuncionarioRepository;

    public void cadastrarExFuncionario(ExFuncionario exfuncionario){
        ExFuncionarioRepository.save(ExFuncionarioMapper.toExFuncionarioDomain(exfuncionario));
    }
}
