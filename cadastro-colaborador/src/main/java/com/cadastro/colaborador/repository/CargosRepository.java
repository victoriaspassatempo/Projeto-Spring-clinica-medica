package com.cadastro.colaborador.repository;

import com.cadastro.colaborador.classes.Cargos;
import com.cadastro.colaborador.domain.CargosDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CargosRepository extends JpaRepository<Cargos, Integer> {
    static void save(CargosDomain toCargosDomain) {
    }

}
