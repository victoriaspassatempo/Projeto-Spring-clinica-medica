package com.cadastro.colaborador.service;

import com.cadastro.colaborador.domain.FuncionarioDomain;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ColaboradorService {

//    final ColaboradorRepository repository;
//
//    public ColaboradorService(ColaboradorRepository repository) {
//        this.repository = repository;
//    }

    List<FuncionarioDomain> lista = new ArrayList<>();

    public Object save(FuncionarioDomain domain) {
        lista.add(domain);
        return lista;
//        return repository.save(domain);
    }
    public Object recuperar() {
        return lista;
    }
}
