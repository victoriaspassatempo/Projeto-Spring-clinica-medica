package com.cadastro.colaborador.service;

import com.cadastro.colaborador.classes.Cargos;
import com.cadastro.colaborador.mapper.CargosMapper;
import com.cadastro.colaborador.repository.CargosRepository;
import org.springframework.stereotype.Service;


@Service
public class CadastroCargosService {

    private final CargosRepository cargosRepository;

    public CadastroCargosService(CargosRepository cargosRepository) {
        this.cargosRepository = cargosRepository;
    }

    public void cadastrarFuncionario(Cargos cargos){
        CargosRepository.save(CargosMapper.toCargosDomain(cargos));
    }
}
