package com.cadastro.colaborador.service;

import com.cadastro.colaborador.classes.Salario;
import com.cadastro.colaborador.mapper.SalarioMapper;
import com.cadastro.colaborador.repository.SalarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroSalarioService {

    private final  SalarioRepository salarioRepository;

    public CadastroSalarioService(SalarioRepository salarioRepository) {
        this.salarioRepository = salarioRepository;
    }

    public void cadastrarSalario(Salario salario){
        SalarioRepository.save(SalarioMapper.toSalarioDomain(salario));
    }
}
