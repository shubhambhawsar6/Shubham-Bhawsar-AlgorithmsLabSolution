package com.greatlearning.sorting;

public class Mergesort {

	public static void sort_currency_denomination(int [] array,int left,int right) {
		
		if(left<right) {
			int mid = (left+right)/2;
			
			sort_currency_denomination( array, left, mid);
			
			sort_currency_denomination( array, mid+1, right);
			
			mergeArray(array,left,mid,right);
		}
	}

	private static void mergeArray(int[] array, int left, int mid, int right) {
		
		   int l1= mid-left+1;
		   int l2=right-mid;
		   
		   int leftArray[] = new int[l1];
		   int rightArray[]= new int[l2];
		
		   for(int i=0;i<l1;i++) {
			   leftArray[i] = array[left+i]; 
		   }
		   
		   int j=mid+1;
		   for(int i=0;i<l2;i++) {
			   rightArray[i]=array[j];
			   j++;
		   }
		   
		   int m=0,n=0,k=left;
		   
		   while(m<l1 && n<l2) {
			   if(leftArray[m]>rightArray[n]) {
				   array[k]=leftArray[m];
				   m++;
			   }else {
				   array[k]=rightArray[n];
				   n++;
			   }
			   k++;
		   }
		   
		   while (m < l1) {
			   array[k] = leftArray[m];
			   m++;
			   k++;
			   }
		   
		   while (n < l2) {
			   array[k] = rightArray[n];
			   n++;
			   k++;
			   }
	}
}
