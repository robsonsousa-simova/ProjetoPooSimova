package br.com.simova;

import br.com.simova.models.Apontamento;
import br.com.simova.models.Atividade;
import br.com.simova.models.Equipamento;
import br.com.simova.models.Funcionario;

import java.util.Date;

public class MainApplication {

    public static void main(String[] args) {

        exibirLinhaPontilhada();
        System.out.println("Project Initialization");
        exibirLinhaPontilhada();

        Funcionario f1 = new Funcionario("Robson", "Masculino", "A0142", "Programador");
        f1.exibirFuncionario();
        exibirLinhaPontilhada();

        Equipamento e1 = new Equipamento("T01", "Trator 1", "Volkswagen", "VW 1", 4);
        e1.exibirEquipamento();
        exibirLinhaPontilhada();

        Atividade a1 = new Atividade("A0001", "Atividade 1", "Grupo 1", 2);
        a1.exibirAtividade();
        exibirLinhaPontilhada();

        Apontamento ap1 = new Apontamento("AP0001", new Date(), e1, a1, f1);
        ap1.exibirApontamento();
    }

    public static void exibirLinhaPontilhada() {

        System.out.println("-----------------------------------------------------------------------------------------------------");
    }
}
