package com.cadastro.colaborador.mapper;

import com.cadastro.colaborador.classes.Salario;
import com.cadastro.colaborador.domain.SalarioDomain;

public class SalarioMapper {
    public static SalarioDomain toSalarioDomain(Salario salario){
        SalarioDomain Salario = new SalarioDomain();
        Salario.setJornada(salario.getJornada());
        Salario.setSalario(salario.getSalario());
        Salario.setBonus(salario.getBonus());

        return Salario;
    }
}
