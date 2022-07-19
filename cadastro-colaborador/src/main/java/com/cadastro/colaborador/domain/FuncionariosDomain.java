package com.cadastro.colaborador.domain;


import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "funcionarios")
public class FuncionariosDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idFuncionario;

    @Column
    private String nome;

    @Temporal(TemporalType.DATE)
    private LocalDate dataNascimento;

    @Temporal(TemporalType.DATE)
    private LocalDate dataContratação;

    @Column
    private Integer cpf;

    @Column
    private Integer rg;

    @Column
    private String email;

    @Column
    private Integer telefone;

    @Column
    private  String tipoContrato;

    @Column
    private Integer cep;

    @Column
    private String cidade;

    @Column
    private String bairro;

    @Column
    private String estado;

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataContratação() {
        return dataContratação;
    }

    public void setDataContratação(LocalDate dataContratação) {
        this.dataContratação = dataContratação;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
