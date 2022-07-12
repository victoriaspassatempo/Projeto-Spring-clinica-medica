package com.cadastro.colaborador.mapper;

import com.cadastro.colaborador.classes.Funcionarios;
import com.cadastro.colaborador.domain.FuncionariosDomain;

public class FuncionariosMapper {
    public static FuncionariosDomain toFuncionariosDomain(Funcionarios funcionarios){
        FuncionariosDomain Funcionarios = new FuncionariosDomain();
        Funcionarios.setIdFuncionario(Funcionarios.getIdFuncionario());
        Funcionarios.setNome(funcionarios.getNome());
        Funcionarios.setDataNascimento(funcionarios.getDataNascimento());
        Funcionarios.setDataContratação(funcionarios.getDataContratação());
        Funcionarios.setRg(funcionarios.getRg());
        Funcionarios.setCpf(funcionarios.getCpf());
        Funcionarios.setEmail(funcionarios.getEmail());
        Funcionarios.setTelefone(funcionarios.getTelefone());
        Funcionarios.setTipoContrato(funcionarios.getTipoContrato());
        Funcionarios.setCep(funcionarios.getCep());
        Funcionarios.setCidade(funcionarios.getCidade());
        Funcionarios.setBairro(funcionarios.getBairro());
        Funcionarios.setEstado(funcionarios.getEstado());
        return Funcionarios;
    }
}
