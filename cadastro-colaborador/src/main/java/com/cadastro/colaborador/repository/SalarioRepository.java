package com.cadastro.colaborador.repository;

import com.cadastro.colaborador.classes.Salario;
import com.cadastro.colaborador.domain.SalarioDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface SalarioRepository extends JpaRepository<Salario, Integer> {
    static void save(SalarioDomain toSalarioDomain) {
    }
}
