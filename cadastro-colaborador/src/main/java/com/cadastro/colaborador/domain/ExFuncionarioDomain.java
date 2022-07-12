package com.cadastro.colaborador.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "exfuncionario")
public class ExFuncionarioDomain {
    @Temporal(TemporalType.DATE)
    private LocalDate dataDesligamento;

    public LocalDate getDataDesligamento() {
        return dataDesligamento;
    }

    public void setDataDesligamento(LocalDate dataDesligamento) {
        this.dataDesligamento = dataDesligamento;
    }
}
