package com.cadastro.colaborador.service;

import com.cadastro.colaborador.classes.Cargos;
import com.cadastro.colaborador.mapper.CargosMapper;
import com.cadastro.colaborador.repository.CargosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroCargosService {
    @Autowired
    private CargosRepository cargosRepository;

    public void cadastrarFuncionario(Cargos cargos){
        CargosRepository.save(CargosMapper.toCargosDomain(cargos));
    }
}
