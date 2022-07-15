package com.cadastro.colaborador.domain;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
