package br.com.ifpb.algoritmoOrdenacao;

/**
 * 
 * @author Gilvonaldo
 *
 */
public class QuickSort implements Sort {

	public void quickSort(int array[], int posicaoInicial, int posicaoFinal) {

		int contEsquerdo = posicaoInicial;// "Contador esquerdo"
		int contDireito = posicaoFinal;// "Contador direito"
		int pivo = array[(posicaoInicial + posicaoFinal) / 2];
		int troca;

		while (contEsquerdo <= contDireito) {
			while (array[contEsquerdo] < pivo) {
				contEsquerdo = contEsquerdo + 1;
			}
			while (array[contDireito] > pivo) {
				contDireito = contDireito - 1;
			}
			if (contEsquerdo <= contDireito) {
				troca = array[contEsquerdo];
				array[contEsquerdo] = array[contDireito];
				array[contDireito] = troca;
				contEsquerdo = contEsquerdo + 1;
				contDireito = contDireito - 1;
			}
		}
		if (contDireito > posicaoInicial) {
			quickSort(array, posicaoInicial, contDireito);// Chamada recursiva
		}
		if (contEsquerdo < posicaoFinal) {
			quickSort(array, contEsquerdo, posicaoFinal);// Chamada recursiva
		}
	}
	
	@Override
	public void sort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

}
