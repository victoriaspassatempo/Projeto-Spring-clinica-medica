package com.cadastro.colaborador.domain;


import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "salario")
public class SalarioDomain {
    @Temporal(TemporalType.TIME)
    private LocalTime jornada;

    @Column
    private double salario;

    @Column
    private double bonus;

    public LocalTime getJornada() {
        return jornada;
    }

    public void setJornada(LocalTime jornada) {
        this.jornada = jornada;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
