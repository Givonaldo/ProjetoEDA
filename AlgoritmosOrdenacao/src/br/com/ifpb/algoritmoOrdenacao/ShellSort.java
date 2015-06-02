package br.com.ifpb.algoritmoOrdenacao;

public class ShellSort implements Sort{

	
	public void sort(int[] array) {
	    int h = 1;
	    while(h < array.length)
	            h = h * 3 + 1;
	    h = h / 3;
	    int c, j;
	    while (h > 0) {
	        for (int i = h; i < array.length; i++) {
	            c = array[i];
	            j = i;
	            while (j >= h && array[j - h] > c) {
	                array[j] = array[j - h];
	                j = j - h;
	            }
	            array[j] = c;
	        }
	        h = h / 2;
	    }
	}
}
