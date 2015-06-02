package br.com.ifpb.algoritmoOrdenacao;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		int array[] = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt(10) * 3;
		}
		// ================================================================
		System.out.println("-- Insertion Sort --");
		System.out.println("Array Desordenado: \n" + Arrays.toString(array));
		InsertionSort insertionsort = new InsertionSort();
		insertionsort.sort(array);
		System.out
				.println("Array Ordenado: \n" + Arrays.toString(array) + "\n");
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt(10) * 3;
		}
		// ================================================================
		System.out.println("--Bubble Sort--");
		System.out.println("Array Desordenado: \n" + Arrays.toString(array));
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort(array);
		System.out
				.println("Array Ordenado: \n" + Arrays.toString(array) + "\n");
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt(10) * 3;
		}
		// ================================================================
		System.out.println("--QuickSort--");
		System.out.println("Array Desordenado: \n" + Arrays.toString(array));
		QuickSort quickSort = new QuickSort();
		quickSort.sort(array);
		System.out
				.println("Array Ordenado: \n" + Arrays.toString(array) + "\n");
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt(10) * 3;
		}
		// ================================================================
		System.out.println("--QuickSort--");
		System.out.println("Array Desordenado: \n" + Arrays.toString(array));
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(array);
		System.out
				.println("Array Ordenado: \n" + Arrays.toString(array) + "\n");
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt(10) * 3;
		}
		// ================================================================
		System.out.println("--SelectionSort--");
		System.out.println("Array Desordenado: \n" + Arrays.toString(array));
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.sort(array);
		System.out.println("Array Ordenado: \n" + Arrays.toString(array) + "\n");
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt(10) * 3;
		}
		// ================================================================
		System.out.println("--ShellSort--");
		System.out.println("Array Desordenado: \n" + Arrays.toString(array));
		ShellSort shellSort = new ShellSort();
		shellSort.sort(array);
		System.out.println("Array Ordenado: \n" + Arrays.toString(array) + "\n");
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt(10) * 3;
		}
	}
}
