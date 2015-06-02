package br.com.ifpb.algoritmoOrdenacao;

public class SelectionSort implements Sort {

	@Override
	public void sort(int[] array) {
		
		int menorValor = 0;
		int indiceMenorValor = 0;
		
		for (int i = 0; i < array.length; i++) {
			menorValor = array[i];
			indiceMenorValor = i;
			
			for (int j = i + 1 ; j < array.length; j++){
				if (array[j] < menorValor){
					menorValor = array[j];
					indiceMenorValor = j;
				}
			}
			array[indiceMenorValor] = array[i];
			array[i] = menorValor;
		}	
	}
}
