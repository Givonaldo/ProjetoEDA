package br.com.ifpb.algoritmoOrdenacao;

/**
 * 
 * @author Gilvonaldo
 *
 */
public class InsertionSort implements Sort {

	@Override
	public void sort(int[] array) {
		
		int i = 0;
		int elemento = 0;
		
		for (int j = 0; j < array.length; j++) {
			elemento = array[j];	
			i = j - 1;
			while((i>=0) && (array[i] > elemento)){
				array[i+1] = array[i];
				array[i] = elemento;
				i = i - 1;
			}
		}
	}
}
