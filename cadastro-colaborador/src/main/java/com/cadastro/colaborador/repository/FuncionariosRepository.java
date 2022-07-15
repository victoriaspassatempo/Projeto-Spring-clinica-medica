package com.cadastro.colaborador.repository;

import com.cadastro.colaborador.classes.Funcionarios;
import com.cadastro.colaborador.domain.FuncionariosDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface FuncionariosRepository extends JpaRepository<Funcionarios, Integer> {
    static void save(FuncionariosDomain toFuncionariosDomain) {
    }
}
