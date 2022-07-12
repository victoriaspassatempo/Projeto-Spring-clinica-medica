package com.cadastro.colaborador.repository;

import com.cadastro.colaborador.classes.Salario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalarioRepository extends JpaRepository<Salario, Integer> {
}
