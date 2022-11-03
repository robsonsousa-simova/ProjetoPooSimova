package br.com.simova.models;

public class Atividade {

    private String codigo;
    private String nome;
    private String grupo;
    private int etapas;

    public Atividade() {
    }

    public Atividade(String codigo, String nome, String grupo, int etapas) {
        this.codigo = codigo;
        this.nome = nome;
        this.grupo = grupo;
        this.etapas = etapas;
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

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getEtapas() {
        return etapas;
    }

    public void setEtapas(int etapas) {
        this.etapas = etapas;
    }

    @Override
    public String toString() {
        return "|\tCódigo: " + codigo + "\t|\tNome: " + nome + "\t|\tGrupo: " + grupo + "\t|\tEtapas: " + etapas;
    }

    public void exibirAtividade() {

        String atividade = getClassName() + "\t" + this;

        System.out.println(atividade);
    }

    public String getClassName() {

        return "ClassName: " + this.getClass().getSimpleName();
    }
}
