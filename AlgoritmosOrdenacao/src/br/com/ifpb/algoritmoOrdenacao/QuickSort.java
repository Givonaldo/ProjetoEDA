package br.com.ifpb.algoritmoOrdenacao;

public class QuickSort implements Sort {

	public void quickSort(int array[], int posicaoInicial, int posicaoFinal) {

		int esquerda = posicaoInicial;// "Contador esquerdo"
		int direita = posicaoFinal;// "Contador direito"
		int pivo = array[(posicaoInicial + posicaoFinal) / 2];
		int troca;

		while (esquerda <= direita) {

			while (array[esquerda] < pivo) {
				esquerda = esquerda + 1;
			}
			while (array[direita] > pivo) {
				direita = direita - 1;
			}
			if (esquerda <= direita) {
				troca = array[esquerda];
				array[esquerda] = array[direita];
				array[direita] = troca;
				esquerda = esquerda + 1;
				direita = direita - 1;
			}
		}

		if (direita > posicaoInicial) {
			quickSort(array, posicaoInicial, direita);// Chamada recursiva
		}
		if (esquerda < posicaoFinal) {
			quickSort(array, esquerda, posicaoFinal);// Chamada recursiva
		}
	}
	
	@Override
	public void sort(int[] array) {

		quickSort(array, 0, array.length - 1);

	}

}
