package br.com.simova.services;

import br.com.simova.models.Apontamento;
import br.com.simova.models.Atividade;
import br.com.simova.models.Equipamento;
import br.com.simova.models.Funcionario;

import java.util.Date;

public class DBService {
    public static void executarPrograma() {

        projetoNome();
        exibirDuplaLinhaPontilhada();

        Funcionario f1 = new Funcionario("Robson", "Masculino", "A0142", "Programador");
        Equipamento e1 = new Equipamento("T01", "Trator 1", "Volkswagen", "VW 1");
        Atividade a1 = new Atividade("A0001", "Desafio POO Simova", "Grupo 1", 5);
        Apontamento ap1 = new Apontamento("AP0001", new Date(), e1, a1, f1);

        ap1.exibirApontamento();
        exibirLinhaPontilhada();

        f1.exibirFuncionario();
        exibirLinhaPontilhada();

        e1.exibirEquipamento();
        exibirLinhaPontilhada();

        for (int hora = 1; hora <= 20; hora++) {
            ap1.usarEquipamento();
        }

        exibirLinhaPontilhada();
        e1.exibirEquipamento();
        exibirLinhaPontilhada();

        a1.exibirAtividade();
        exibirLinhaPontilhada();

        for (int i = 0; i < 5; i++)
            ap1.avancarAtividade();
        a1.exibirAtividade();
    }


    public static void exibirLinhaPontilhada() {

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public static void exibirDuplaLinhaPontilhada() {

        System.out.println("==========================================================================================================================================================================");
        System.out.println("==========================================================================================================================================================================");
    }

    public static void projetoNome() {

        System.err.println("\n\t\t\t\t\t\t\t\t\t\t\t\tProjeto Programação Orientada a Objetos - Simova\n");
    }
}
