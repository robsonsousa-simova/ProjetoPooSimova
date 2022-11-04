package br.com.simova.models;

import java.text.SimpleDateFormat;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getDataApt() {

        return dataApt;
    }

    public void setDataApt(Date dataApt) {
        this.dataApt = dataApt;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public void usarEquipamento() {

        // equipamento.incrementarHorasUsoEquipamento();
        this.equipamento.incrementarHorasUsoEquipamento(equipamento.getHorasManutencao());
        // this.equipamento.setHorasManutencao(equipamento.getHorasManutencao());

        if (equipamento.getHorasManutencao() >= 20)

            System.out.println("O equipamento " + equipamento.getNome() + " apresentado no Apontamento " + getCodigo()
                    + " foi utilizado por " + equipamento.getHorasManutencao() + " horas" + " e deve ser colocado em manutenção.");
        else
            System.out.println("Dory diz: continue a usar, continue a usar...");
    }

    @Override
    public void avancarAtividade() {

        this.atividade.decrementarEtapas(atividade.getEtapas());


        if (atividade.getEtapas() > 0) {

            if (atividade.getEtapas() > 1)
                System.out.println("Restam " + atividade.getEtapas() + " etapas para concluir a Atividade " + atividade.getNome());
            else
                System.out.println("Resta " + atividade.getEtapas() + " etapa para concluir a Atividade " + atividade.getNome());
        } else
            System.out.println("O Apontamento " + getCodigo() + " teve a Atividade " + atividade.getNome() + " concluída com sucesso.");
    }

    @Override
    public String toString() {

        String pattern = "yyyy-dd-MM";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return "|\tCodigo: " + codigo
                + "\t|\tData: " + sdf.format(dataApt)
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
