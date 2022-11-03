package br.com.simova.models;

public class Equipamento {

    private String codigo;
    private String nome;
    private String fabricante;
    private String modelo;
    private int horasManutencao;

    public Equipamento() {
    }

    public Equipamento(String codigo, String nome, String fabricante, String modelo) {
        this.codigo = codigo;
        this.nome = nome;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.horasManutencao = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getHorasManutencao() {
        return horasManutencao;
    }

    public void setHorasManutencao(int horasManutencao) {
        this.horasManutencao = horasManutencao;
    }

    public void incrementarHorasUsoEquipamento(int horasManutencao) {

        this.horasManutencao = horasManutencao + 1;
    }

    @Override
    public String toString() {
        return "|\tCodigo: " + codigo
                + "\t|\tNome: " + nome
                + "\t|\tFabricante: " + fabricante
                + "\t|\tModelo: " + modelo
                + "\t|\tHoras Manutencao: " + getHorasManutencao();
    }

    public void exibirEquipamento() {

        String equipamento = getClassName() + "\t" + this;

        System.out.println(equipamento);
    }

    public String getClassName() {

        return "ClassName: " + this.getClass().getSimpleName();
    }
}
