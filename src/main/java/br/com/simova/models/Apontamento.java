package br.com.simova.models;

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

        // equipamento.incrementarHorasUsoEquipamento();
        this.equipamento.incrementarHorasUsoEquipamento(equipamento.getHorasManutencao());
        // this.equipamento.setHorasManutencao(equipamento.getHorasManutencao());

        if (equipamento.getHorasManutencao() >= 20) {

            System.out.println("O equipamento " + equipamento.getNome()
                    + " foi utilizado por " + equipamento.getHorasManutencao()
                    + " horas" + " e deve ser colocado em manutenção.");
        } else {
            System.out.println("Dolly diz: continue a usar, continue a usar...");
        }
    }

    @Override
    public void avancarAtividade() {

    }

    @Override
    public String toString() {
        return "|\tCodigo: " + codigo
                + "\t|\tData: " + dataApt
                + "\t|\tEquipamento: " + equipamento.getNome()
                + "\t|\tAtividade: " + atividade.getNome()
                + "\t|\tFuncionário: " + funcionario.getNome();
    }

    public void exibirApontamento() {

        String apontamento = getClassName() + "\t" + this;

        System.out.println(apontamento);
    }

    public String getClassName() {

        return "ClassName: " + this.getClass().getSimpleName();
    }
}
