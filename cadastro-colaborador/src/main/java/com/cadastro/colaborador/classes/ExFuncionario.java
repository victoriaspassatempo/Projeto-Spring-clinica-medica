package com.cadastro.colaborador.classes;

import java.time.LocalDate;

public class ExFuncionario {
    private LocalDate dataDesligamento;

    private Integer idFuncionario;

    public LocalDate getDataDesligamento() {
        return dataDesligamento;
    }

    public void setDataDesligamento(LocalDate dataDesligamento) {
        this.dataDesligamento = dataDesligamento;
    }
}
