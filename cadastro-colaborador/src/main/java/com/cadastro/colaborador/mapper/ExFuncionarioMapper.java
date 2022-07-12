package com.cadastro.colaborador.mapper;

import com.cadastro.colaborador.classes.ExFuncionario;
import com.cadastro.colaborador.domain.ExFuncionarioDomain;

public class ExFuncionarioMapper {
    public static ExFuncionarioDomain toExFuncionarioDomain(ExFuncionario exFuncionario){
        ExFuncionarioDomain ExFuncionario = new ExFuncionarioDomain();
        exFuncionario.setDataDesligamento(exFuncionario.getDataDesligamento());

        return ExFuncionario;
    }
}
