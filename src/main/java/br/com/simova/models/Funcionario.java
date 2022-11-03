package br.com.simova.models;

public class Funcionario extends Pessoa {

    private String cracha;
    private String funcao;


    public Funcionario(String nome, String sexo, String cracha, String funcao) {
        this.setNome(nome);
        this.setSexo(sexo);
        this.cracha = cracha;
        this.funcao = funcao;
    }

    public String getCracha() {
        return cracha;
    }

    public void setCracha(String cracha) {
        this.cracha = cracha;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Cracha: " + cracha + "\tFunção: " + funcao;
    }

    public void exibirFuncionario() {

        String funcionario = toString();

        System.out.println("Nome: " + getNome() + "\tSexo: " + getSexo() + "\t" + funcionario);
    }
}
