package com.cadastro.colaborador.repository;

import com.cadastro.colaborador.classes.ExFuncionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExFuncionarioRepository extends JpaRepository<ExFuncionario, Integer> {

}
