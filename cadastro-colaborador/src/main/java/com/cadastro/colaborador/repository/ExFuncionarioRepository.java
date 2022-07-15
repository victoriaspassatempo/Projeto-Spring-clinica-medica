package com.cadastro.colaborador.repository;

import com.cadastro.colaborador.classes.ExFuncionario;
import com.cadastro.colaborador.domain.ExFuncionarioDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ExFuncionarioRepository extends JpaRepository<ExFuncionario, Integer> {

    static void save(ExFuncionarioDomain toExFuncionarioDomain) {
    }
}
