package br.com.ifpb.algoritmoOrdenacao;

public class BubbleSort implements Sort {

	public void sort(int[] v) {

		boolean houverTroca = true;

		while (houverTroca) {
			houverTroca = false;

			for (int i = 0; i < v.length - 1; i++) {
				if (v[i] > v[i + 1]) {
					int aux = v[i];
					v[i] = v[i + 1];
					v[i + 1] = aux;
					houverTroca = true;
				}
			}
		}
	}

}
