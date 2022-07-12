package com.cadastro.colaborador.classes;

import java.time.LocalTime;

public class Salario {
    private LocalTime jornada;
    private double salario;
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
