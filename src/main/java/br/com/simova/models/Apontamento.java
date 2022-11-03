package br.com.simova.models;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Apontamento implements Relatorio {

    private String codigo;
    private Date dataApt;
    private Equipamento equipamento;
    private Atividade atividade;
    private Funcionario funcionario;

    public Apontamento() {
    }

    public Apontamento(String codigo, Date dataApt,
                       Equipamento equipamento, Atividade atividade, Funcionario funcionario) {
        this.codigo = codigo;
        this.dataApt = dataApt;
        this.equipamento = equipamento;
        this.atividade = atividade;
        this.funcionario = funcionario;
    }

    @Override
    public void usarEquipamento() {

    }

    @Override
    public void avancarAtividade() {

    }

    @Override
    public String toString() {
        return "Codigo: " + codigo
                + "\tData: " + dataApt
                + "\tEquipamento: " + equipamento.getNome()
                + "\tAtividade: " + atividade.getNome()
                + "\tFuncionário: " + funcionario.getNome();
    }

    public void exibirApontamento(){

        String apontamento = toString();

        System.out.println(apontamento);
    }
}
