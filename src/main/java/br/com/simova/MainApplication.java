package br.com.simova;

import br.com.simova.models.Apontamento;
import br.com.simova.models.Atividade;
import br.com.simova.models.Equipamento;
import br.com.simova.models.Funcionario;

import java.util.Date;

public class MainApplication {

    public static void main(String[] args) {

        projetoNome();
        exibirDuplaLinhaPontilhada();

        Funcionario f1 = new Funcionario("Robson", "Masculino", "A0142", "Programador");
        Equipamento e1 = new Equipamento("T01", "Trator 1", "Volkswagen", "VW 1");
        Atividade a1 = new Atividade("A0001", "Atividade 1", "Grupo 1", 2);
        Apontamento ap1 = new Apontamento("AP0001", new Date(), e1, a1, f1);

        f1.exibirFuncionario();
        exibirLinhaPontilhada();

        e1.exibirEquipamento();
        exibirLinhaPontilhada();

        a1.exibirAtividade();
        exibirLinhaPontilhada();

        ap1.exibirApontamento();
        exibirLinhaPontilhada();

        for (int hora = 1; hora <= 20; hora++) {
            ap1.usarEquipamento();
        }

        exibirLinhaPontilhada();
        e1.exibirEquipamento();
    }


    public static void exibirLinhaPontilhada() {

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public static void exibirDuplaLinhaPontilhada() {

        System.out.println("===================================================================================================================================================================");
        System.out.println("===================================================================================================================================================================");
    }

    public static void projetoNome() {

        System.err.println("\n\t\t\t\t\t\t\t\t\t\t\t\tProjeto Programação Orientada a Objetos - Simova\n");
    }
}
