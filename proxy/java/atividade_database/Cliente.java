/**
* https://pt.wikipedia.org/wiki/Proxy_(padrões_de_projeto)
* Exemplo do padrão de projeto Proxy
*
*/

package proxy.java.atividade_database;

import java.util.ArrayList;
import java.util.List;

import proxy.java.atividade_database.modelo.Aluno;
import proxy.java.atividade_database.proxies.AlunoProxy;


public class Cliente {

    public static void main(String[] args) {
        
        List<Aluno> alunos = new ArrayList<Aluno>();

        //Instância cada Proxy para encapsular o acesso a classe real
        alunos.add(new AlunoProxy("1"));
        alunos.add(new AlunoProxy("2"));
        alunos.add(new AlunoProxy("3"));
        alunos.add(new AlunoProxy("4"));

        // busca o aluno do banco de dados
        System.out.println("Nome do Aluno: " + alunos.get(0).getNome());
        System.out.println("");
        System.out.println("Nome do Aluno: " + alunos.get(1).getNome());
        System.out.println("");
        System.out.println("Nome do Aluno: " + alunos.get(2).getNome());
        System.out.println("");
        System.out.println("Nome do Aluno: " + alunos.get(3).getNome());
        System.out.println("");

        // Retorna o aluno do cache
        System.out.println("Nome do Aluno: " + alunos.get(0).getNome());
        System.out.println("");
        System.out.println("Nome do Aluno: " + alunos.get(1).getNome());
        System.out.println("");
        System.out.println("Nome do Aluno: " + alunos.get(2).getNome());
        System.out.println("");
        System.out.println("Nome do Aluno: " + alunos.get(3).getNome());
        System.out.println("");

        System.out.println("======");
        System.out.println("Nome: Thainã Viadroski\n RA:21.81.21");
        /* 
        Apresente na saída do console o RA e nome do aluno que fez a atividade.   
        Encontre o erro na atividade_database, corrija o erro  e explique o que tava errado.
        
        Explicação: 
            Na implementação da Classe de proxy não havia a validação para verficar se aluno está vazio
            objeto Aluno estava vazio, com isso sempre estava sendo executado a consulta no banco de dados.
        */


    }
}
    