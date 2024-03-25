/**
 * Engenharia de Software Moderna - Padrões de Projeto (Cap. 6)
 * Prof. Marco Tulio Valente
 * <p>
 * Exemplo do padrão de projeto Strategy
 */

package strategy.java.atividade_estrategia_de_ordenacao;

import strategy.java.atividade_estrategia_de_ordenacao.modelo.MinhaLista;
import strategy.java.atividade_estrategia_de_ordenacao.strategy.InsertionSort;
import strategy.java.atividade_estrategia_de_ordenacao.strategy.ShellSort;
import strategy.java.atividade_estrategia_de_ordenacao.strategy.SelectionSortStrategy;

public class Cliente {

	public static void main(String[] args) {
		System.out.println("Lista #1 foi ordenada com a estratégia default: BubbleSort");

		int[] elementos1 = {7, 3, 5, 2, 4, 1, 6};
		MinhaLista lista1 = new MinhaLista(elementos1);
		lista1.ordenar(); // ordena lista usando estratégia default: Bubble Sort
		lista1.print();

		System.out.println("\nLista #2 foi ordenada com uma outra estratégia: SelectionSort");

		int[] elementos2 = {6, 5, 4, 3, 2, 1, 7};
		MinhaLista lista2 = new MinhaLista(elementos2);
		lista2.setOrdenacaoStrategy(new SelectionSortStrategy());
		lista2.ordenar(); // ordena lista usando Selection Sort
		lista2.print();

		System.out.println("\nLista #3 foi ordenada com uma outra estratégia: InsertionSort");
		int[] array = {10, 34, 20, 4, 23};
		MinhaLista lista3 = new MinhaLista(array);
		lista3.setOrdenacaoStrategy(new InsertionSort());
		lista3.ordenar();
		lista3.print();

		System.out.println("\nLista #4 foi ordenada com uma outra estratégia:  ShellSort");
		int[] array2 = {25, 6, 24, 100, 666};
		MinhaLista lista4 = new MinhaLista(array2);
		lista4.setOrdenacaoStrategy(new ShellSort());
		lista4.ordenar();
		lista4.print();

        /* Implemente mais 2 estratégias de ordenação    
         * 
         *  insertionsort 
            shellsort 
            mergesort 
            quicksortcle
            quicksort2
            heapsort
            heapsort
            bucketsort 
          */

		//

	}

}
