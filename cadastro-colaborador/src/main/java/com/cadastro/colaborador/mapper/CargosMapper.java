package com.cadastro.colaborador.mapper;

import com.cadastro.colaborador.classes.Cargos;
import com.cadastro.colaborador.domain.CargosDomain;

public class CargosMapper {
    public static CargosDomain toCargosDomain(Cargos cargos){
        CargosDomain Cargos = new CargosDomain();
        Cargos.setDescricao(cargos.getDescricao());
        Cargos.setRegistro(cargos.getRegistro());
        Cargos.setCategoria(cargos.getCategoria());

        return Cargos;
    }
}
