package br.com.ifpb.algoritmoOrdenacao;

public class MergeSort implements Sort{

	private int[] helper; 
	private int[] vetor; 
	
	private int tamanho; 
	
	//mergeSort method
	public void merge(int low, int high){
		if(low<high){
			int mid =(low+high)/2; 	
			merge(low, mid); 
			merge(mid+1, high); 
			combine(low, mid, high);  
		}
	}
	//merge method
	public void combine(int low, int mid, int high){
		//copy numbers into helper array;
		for(int ii=0;ii<=high;ii++){
			this.helper[ii]=this.vetor[ii]; 
		}
		
		int ii = low;
		int jj = mid+1;
		int kk = low; 
		
		while((ii <= mid) && (jj<=high)){
			if(helper[ii] <= helper[jj]){
				this.vetor[kk] = this.helper[ii];
				ii++; 
			}else{
				this.vetor[kk] = this.helper[jj]; 
				jj++; 
			}
			kk++;
		}
		while(ii<=mid){
			this.vetor[kk]=this.helper[ii]; 
			kk++;
			ii++;
		}
		
	}
	
	@Override
	public void sort(int[] array) {
		
		this.vetor = array; 
		this.tamanho = array.length; 
		this.helper = new int[tamanho]; 
		merge(0, tamanho-1); 
		
	}
}
