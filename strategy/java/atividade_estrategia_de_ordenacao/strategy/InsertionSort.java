package strategy.java.atividade_estrategia_de_ordenacao.strategy;

public class InsertionSort extends OrdenacaoStrategy {

	public void ordenar(int[] elementos) {
		int j;
		int key;
		int i;

		for (j = 1; j < elementos.length; j++) {
			key = elementos[j];
			for (i = j - 1; (i >= 0) && (elementos[i] > key); i--) {
				elementos[i + 1] = elementos[i];
			}
			elementos[i + 1] = key;
		}

	}
}
