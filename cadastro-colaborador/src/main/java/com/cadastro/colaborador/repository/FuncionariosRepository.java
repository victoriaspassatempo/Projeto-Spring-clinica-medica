package com.cadastro.colaborador.repository;

import com.cadastro.colaborador.classes.Funcionarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionariosRepository extends JpaRepository<Funcionarios, Integer> {
}
