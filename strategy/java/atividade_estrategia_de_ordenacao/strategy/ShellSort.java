package strategy.java.atividade_estrategia_de_ordenacao.strategy;

public class ShellSort extends OrdenacaoStrategy {

	public void ordenar(int[] array) {

		int n = array.length;

		for (int gap = n / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < n; i++) {
				int key = array[i];
				int j = i;
				while (j >= gap && array[j - gap] > key) {
					array[j] = array[j - gap];
					j -= gap;
				}
				array[j] = key;
			}
		}

	}

}
